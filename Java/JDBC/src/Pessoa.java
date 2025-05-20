public class Pessoa {
    private int codigo;
    private String nome;

    int getCodigo() {
        return codigo;
    }

    String getNome() {
        return nome;
    }

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}
