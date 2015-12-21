package models;

import javax.persistence.*;


// Entidade que representa um Anuncio
// Referenciar a uma tabela

@Entity(name = "Contador")
public class Contador {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private int resolvido, nao_resolvido;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contador(){
        this.resolvido = 0;
        this.nao_resolvido = 0;

    }

    public int getNao_resolvido() {
        return nao_resolvido;
    }

    public int getResolvido() {
        return resolvido;
    }

    public void setNao_resolvido(int nao_resolvido) {
        this.nao_resolvido = nao_resolvido;
    }

    public void setResolvido(int resolvido) {
        this.resolvido = resolvido;
    }
}
