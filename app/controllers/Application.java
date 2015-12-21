package controllers;

import models.Anuncio;
import models.Contador;
import models.dao.GenericDAO;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Controlador Principal do Sistema
 */
public class Application extends Controller {
	private static Form<Anuncio> anuncioForm = Form.form(Anuncio.class);
	private static final GenericDAO dao = new GenericDAO();
	private static Contador contador = new Contador();


	public static Result index() {
		return redirect(routes.Application.anuncios());
	}

	/*
	 * A Anotação transactional é necessária em todas as Actions que
	 * usarem o BD.
	 */
	@Transactional
	public static Result anuncios() {
		// Todos os Livros do Banco de Dados
		List<Anuncio> result = dao.findAllByClass(Anuncio.class);
		return ok(views.html.index.render(result,contador));
	}



	@Transactional
	public static Result newAnuncio() {
		// O formulário dos Livros Preenchidos

		DynamicForm filledForm = Form.form().bindFromRequest();
		String objetivo = "";

		if(filledForm.get("objetivo").equals("Tocar Ocasionalmente")){
			objetivo = "Tocar Ocasionalmente";
		}
		else if(filledForm.get("objetivo").equals("Procuro banda")){
			objetivo = "Procuro banda";
		}
		else if(filledForm.get("objetivo").equals("Procuro musico")){
			objetivo = "Procuro musico";
		}

		if (filledForm.hasErrors()) {
            List<Anuncio> result = dao.findAllByClass(Anuncio.class);
            //TODO falta colocar na interface mensagem de erro.
			return badRequest(views.html.index.render(result, contador));
		} else {
            Anuncio novoAnuncio = new Anuncio(filledForm.get("nome"), filledForm.get("cidade"),filledForm.get("bairro"),filledForm.get("instrumentos"),
					filledForm.get("email"),filledForm.get("face"),objetivo, filledForm.get("estilo_gosta"),filledForm.get("estilo_nao_gosta"),filledForm.get("codigo"));
            Logger.debug("Criando anúncio: " + filledForm.data().toString() + " como " + novoAnuncio.getNome());
			// Persiste o Anuncio criado
			dao.persist(novoAnuncio);
			// Espelha no Banco de Dados
			dao.flush();
            /*
             * Usar routes.Application.<uma action> é uma forma de
             * evitar colocar rotas literais (ex: "/books")
             * hard-coded no código. Dessa forma, se mudamos no
             * arquivo routes, continua funcionando.
             */

			return redirect(routes.Application.anuncios());
		}
	}

	@Transactional
	public static Result criar(){
		List<Anuncio> result = dao.findAllByClass(Anuncio.class);
		return ok(views.html.criar.render(result));
	}



	// Notação transactional sempre que o método fizer transação com o Banco de
	// Dados.
	@Transactional
	public static Result deleteAnuncio(Long id) {
		DynamicForm deleteForm = Form.form().bindFromRequest();
		if(deleteForm.get("codigo").equals(dao.findByEntityId(Anuncio.class,id).getCodigo())){
			// Remove o Anuncio pelo Id
			dao.removeById(Anuncio.class, id);
			// Espelha no banco de dados
			dao.flush();
		}
		if(deleteForm.get("optradio").equals("1")){
			contador.setResolvido(contador.getResolvido()+1);

		}else {
			contador.setNao_resolvido(contador.getNao_resolvido() + 1);
		}
		dao.persist(contador);
		dao.flush();
		return redirect(routes.Application.anuncios());
	}

	@Transactional
	public static Result pesquisa(){
		List<Anuncio> result = dao.findAllByClass(Anuncio.class);
		return ok(views.html.pesquisar.render(result));
	}



	@Transactional
	public static Result pesquisarAnuncio(){
		DynamicForm pesquisarForm = Form.form().bindFromRequest();
		List<Anuncio> result = null;
		if(pesquisarForm.get("optradio").equals("1")){
			result = dao.findByAttributeName("Anuncio","nome",pesquisarForm.get("pesquisa"));
		}else if(pesquisarForm.get("optradio").equals("2")){
			result = dao.findByAttributeInstumento(pesquisarForm.get("pesquisa"));
		}else if(pesquisarForm.get("optradio").equals("3")){
			result = dao.findByAttributeEstilo(pesquisarForm.get("pesquisa"));
		}else if(pesquisarForm.get("optradio").equals("4")){
			if(pesquisarForm.get("objetivo").equals("Tocar Ocasionalmente")){
				result = dao.findByAttributeName("Anuncio","objetivo","Tocar Ocasionalmente");
			}else if (pesquisarForm.get("objetivo").equals("Procuro Banda")){
				result = dao.findByAttributeName("Anuncio","objetivo","Procuro Banda");
			}else if (pesquisarForm.get("objetivo").equals("Procuro musico")){
				result = dao.findByAttributeName("Anuncio","objetivo","Procuro musico");
			}
		}else if(pesquisarForm.get("optradio").equals("5")){
			result = dao.findByAttributeName("Anuncio","objetivo","Procuro Banda");
		}else if(pesquisarForm.get("optradio").equals("6")){
			result = dao.findByAttributeName("Anuncio","objetivo","Procuro musico");
		}
		if(result == null){
			return redirect(routes.Application.anuncios());
		}

		return ok(views.html.pesquisar.render(result));
	}


}
