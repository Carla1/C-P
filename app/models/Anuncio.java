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
	private String link, nome, codigo;

	@Column
	private String[] lista_instrumentos, lista_estilos;



	// Construtor vazio para o Hibernate criar os objetos
	public Anuncio() {
		this.autores = new ArrayList<Anunciante>();
	}

	public Anuncio(String link, String nome){
		this.nome = nome;
		this.link = link;
		this.codigo = "removerdalista";
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
