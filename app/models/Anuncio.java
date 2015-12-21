package models;

import com.google.common.base.Objects;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Entidade que representa um Anuncio
// Referenciar a uma tabela
@Entity(name = "Anuncio")
public class Anuncio {

	// Todo Id tem que ter o GeneratedValue a não ser que ele seja setado
	// Usar Id sempre Long
	@Id
	@GeneratedValue
	private Long id;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Anunciante> autores;

	@Column
	private String nome, cidade, bairro, instrumentos, email, face, objetivo, estilo_gosta, estilo_nao_gosta, codigo;

	@Column
	private String[] lista_instrumentos, lista_estilos;



	// Construtor vazio para o Hibernate criar os objetos
	public Anuncio() {
		this.autores = new ArrayList<Anunciante>();
	}

	public Anuncio(String nome, String cidade, String bairro, String instrumentos, String email, String face, String objetivo,
				   String estilo_gosta, String estilo_nao_gosta, String codigo) {
       	this();
    	this.nome = nome;
		this.cidade = cidade;
		this.bairro = bairro;
		this.instrumentos = instrumentos;
		this.email = email;
		this.face = face;
		this.objetivo = objetivo;
		this.estilo_gosta = estilo_gosta;
		this.estilo_nao_gosta = estilo_nao_gosta;
		this.codigo = codigo;


   	}

	public String [] criaListaInstrumentos(){
		lista_instrumentos = instrumentos.split(",");
		return lista_instrumentos;
	}

	public String [] criaListaEstilos(){
		lista_estilos = estilo_gosta.split(",");
		return lista_estilos;
	}

	public String[] getLista_estilos() {
		return lista_estilos;
	}

	public String[] getLista_instrumentos() {
		return lista_instrumentos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEstilo_nao_gosta() {
		return estilo_nao_gosta;
	}

	public void setEstilo_nao_gosta(String estilo_nao_gosta) {
		this.estilo_nao_gosta = estilo_nao_gosta;
	}

	public String getEstilo_gosta() {
		return estilo_gosta;
	}

	public void setEstilo_gosta(String estilo_gosta) {
		this.estilo_gosta = estilo_gosta;
	}

	public String getInstrumentos() { return instrumentos; }

	public void setInstrumentos(String instrumentos) { 	this.instrumentos = instrumentos; }

	//	public ArrayList<String> getInstrumentos() {
//		return instrumentos;
//	}
//
//	public void setInstrumentos(ArrayList<String> instrumentos) {
//		this.instrumentos = instrumentos;
//	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
        	this.cidade = cidade;
    	}
	
	public String getBairro() {
		return bairro;
	}

    	public void setBairro(String bairro) {
        this.bairro = bairro;
   	}
	
	public String getEmail() {
		return email;
	}

   	public void setEmail(String email) {
        this.email = email;
   	}

	public String getFace() {
		return face;
	}

    	public void setFace(String face) {
        this.face = face;
   	 }

	public String getObjetivo() {
		return objetivo;
	}

    	public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    	}


    public String getNome() {
		return nome;
	}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Anuncio)) {
			return false;
		}
		Anuncio outroAnuncio = (Anuncio) obj;
		return Objects.equal(outroAnuncio.getNome(), this.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.getNome());
	}

    public List<Anunciante> getAutores() {
        return Collections.unmodifiableList(autores);
    }

    public void addAutor(Anunciante anunciante) {
        autores.add(anunciante);
    }

    public void setId(long id) {
        this.id = id;
    }
}
