package teste.umpraum;

import infra.DAO;
import modelo.basico.Entidade;
import modelo.basico.umpraum.Assento;
import modelo.basico.umpraum.Cliente;

public class NovoClienteAssento  {

    public static void main(String[] args) {

        Assento assento = new Assento("02A");
        Cliente cliente = new Cliente("Bia", assento);

        DAO<Entidade> dao = new DAO<>();
        dao.abrirTransacao().incluir(assento).incluir(cliente).fecharTransacao().fechar();

    }
}
