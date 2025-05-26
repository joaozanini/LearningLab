package modelo.basico.umpraum;

import javax.persistence.*;

import modelo.basico.Entidade;
import modelo.basico.umpraum.Assento;

@Entity
public class Cliente implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="assento_id", unique=true)
    private Assento assento;

    public Cliente() {

    }

    public Cliente(String nome, Assento assento) {
        this.nome = nome;
        this.assento = assento;
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

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}
