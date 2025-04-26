import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.nomeCliente = "João";
        
        c1.itens.add(new Item("Caneta", 1, 2.5));
        c1.itens.add(new Item("Flores", 12, 8.0));
        
        c1.compraInfo();
    }
}

class Compra {
    String nomeCliente;
    ArrayList<Item> itens = new ArrayList<Item>();
    
    void compraInfo() {
        System.out.println("-x-".repeat(25));
        System.out.printf("%s comprou:\n", nomeCliente);
        for (Item item : itens) {
            double precoTotalItem = item.precoUn * item.quantidade;
            System.out.printf("Produto: %s | Quantidade: %d | Preço Unitário: %.2f | Preço Total: %.2f\n", 
                              item.nome, item.quantidade, item.precoUn, precoTotalItem);
        }
        
        System.out.printf("Valor total da compra: %.2f\n", valorTotal());
        System.out.println("-x-".repeat(25));
    }
    
    double valorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.precoUn * item.quantidade;
        }
        return total;
    }
}

class Item {
    String nome;
    int quantidade;
    double precoUn;
    
    Item(String nome, int quantidade, double precoUn) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUn = precoUn;
    }
}
