package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Iphone 15", 4000.00);

        DAO dao = new DAO<>(Produto.class);
        dao.incluirAtomico(produto1);

        System.out.printf("ID do produto cadastrado: %d\n", produto1.getId());
    }
}
