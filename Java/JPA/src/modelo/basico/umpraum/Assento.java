package modelo.basico.umpraum;

import modelo.basico.Entidade;

import javax.persistence.*;

@Entity
public class Assento implements Entidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @OneToOne(mappedBy = "assento")
    private Cliente cliente;

    public Assento() {

    }

    public Assento(String nome) {
        this.nome = nome;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
