package models;

import com.google.common.base.Objects;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Entidade que representa uma Tabela no Banco de Dados
@Entity
public class Anunciante {

	// Gerador de Sequencia para o Id
	@Id
	@GeneratedValue
	private Long id;

	// Nome do Anunciante dos Livros
	private String nome;

	// Relação Muitos para Muitos
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
	private List<Anuncio> anuncios;

	// Construtor Vazio para o Hibernate criar os objetos
	public Anunciante() {
		this.anuncios = new ArrayList<Anuncio>();
	}

    	public Anunciante(String nome) {
        	this();
       		this.nome = nome;
    	}

	public List<Anuncio> getAnuncios() {
		return Collections.unmodifiableList(anuncios);
	}

	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Anunciante)) {
			return false;
		}
		Anunciante outroAnunciante = (Anunciante) obj;
		return Objects.equal(outroAnunciante.getNome(), this.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.nome);
	}


}
