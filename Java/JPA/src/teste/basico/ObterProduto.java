package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

import java.util.List;

public class ObterProduto {
    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produto : produtos) {
            System.out.printf("ID: %d | Nome: %s | Preço: %.2f\n", produto.getId(), produto.getNome(), produto.getPreco());
        }

        double precoTotal = produtos.stream().map(p -> p.getPreco()).reduce(0.0, (t, p) -> t + p).doubleValue();

        System.out.println("Valor total dos produtos: " + precoTotal);
    }
}
