package funcional;

import models.Anuncio;
import models.Contador;
import org.junit.Before;
import org.junit.Test;
import play.mvc.Content;
import views.html.index;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;

public class IndexViewTest {

	List<Anuncio> anuncios;
	Anuncio anuncio1;

	@Before
	public void iniciaVariaveis() {
		anuncios = new ArrayList<Anuncio>();
		anuncio1 = new Anuncio();
        anuncio1.setId(1L);
	}

	// Testa o template index.scala.html
	@Test
	public void indexTemplate() {
		anuncios.add(anuncio1);

		// guarda o html resultante da renderização do index.scala.html
		// com a lista de anuncios e o formulario
		Content html = index.render(anuncios,new Contador());
		assertThat(contentType(html)).isEqualTo("text/html");
		// verifica se o html contém a determimnada string, no caso o nome do
		// livro
		assertThat(contentAsString(html)).contains(anuncio1.getNome());
	}

}
