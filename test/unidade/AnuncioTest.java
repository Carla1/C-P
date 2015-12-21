package unidade;

import base.AbstractTest;
import models.Anunciante;
import models.Anuncio;
import models.dao.GenericDAO;
import org.junit.Test;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class AnuncioTest extends AbstractTest {

    GenericDAO dao = new GenericDAO();
	List<Anuncio> anuncios;
	List<Anunciante> autores;
	
	@Test
	public void deveSalvarLivroSemAutor () {
		anuncios = dao.findAllByClass(Anuncio.class); //consulta o bd
		assertThat(anuncios.size()).isEqualTo(0);
		
		Anuncio a1 = new Anuncio("Anuncio1", "CG", "Centro", "piano", "carla@com.br", "carla@com.br","encontrar banda","forro","funk","1234");
		dao.persist(a1);
		
		anuncios = dao.findAllByClass(Anuncio.class); //consulta o bd
		assertThat(anuncios.size()).isEqualTo(1);
		assertThat(anuncios.get(0).getNome()).isEqualTo("Anuncio1");
		assertThat(anuncios.get(0).getCidade()).isEqualTo("CG");
		assertThat(anuncios.get(0).getBairro()).isEqualTo("Centro");
		assertThat(anuncios.get(0).getInstrumentos()).isEqualTo("piano");
		assertThat(anuncios.get(0).getEmail()).isEqualTo("carla@com.br");
		assertThat(anuncios.get(0).getFace()).isEqualTo("carla@com.br");
		assertThat(anuncios.get(0).getObjetivo()).isEqualTo("encontrar banda");
		assertThat(anuncios.get(0).getEstilo_gosta()).isEqualTo("forro");
		assertThat(anuncios.get(0).getEstilo_nao_gosta()).isEqualTo("funk");
		assertThat(anuncios.get(0).getCodigo()).isEqualTo("1234");
	}
	

}
