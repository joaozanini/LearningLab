package modelo.basico;

import javax.persistence.*;

@Entity
public class Produto implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, name="prod_nome", length=100)
    String nome;

    @Column(nullable = false, name="prod_preco", precision = 11, scale = 2)
    Double preco;

    public Produto() {}

    public Produto(String nome, Double preco) {
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
