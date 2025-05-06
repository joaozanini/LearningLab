public class Main {
    public static void main(String[] args) {
        produto p1 = new produto("Iphone 15", 4900.00, 0.15);
        p1.informacoes();
    }
}

class produto {
    String nome;
    double preco;
    double descontopercentual;

    public produto(String nome, double preco, double descontopercentual) {
        this.nome = nome;
        this.preco = preco;
        this.descontopercentual = descontopercentual;
    }

    double precodesconto() {
        return preco - preco * descontopercentual;
    }
    
    void informacoes() {
        System.out.printf("Nome do Produto: %s\n", nome);
        System.out.printf("Preço Total do Produto: R$%.2f\n", preco);
        System.out.printf("Preço com desconto = R$%.2f\n", precodesconto());
        System.out.printf("Imposto Municipal: %s\n", (preco >= 2500? "8,5%" : "ISENTO"));
        System.out.printf("Frete: %s\n", (preco >= 3000? "R$100" : "R$50"));
    }
}
