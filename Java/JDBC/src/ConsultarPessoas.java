import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultarPessoas {
    public static void main(String[] args) throws SQLException {
        Connection connection = FabricaConnection.getConnection();
        String sql = "select * from pessoas";

        Statement statement = connection.createStatement();
        ResultSet resultado = statement.executeQuery(sql);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        while(resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome)) ;
        }

        System.out.println("ID - Nome");
        for(Pessoa p : pessoas) {
            System.out.printf("%d - %s\n", p.getCodigo(), p.getNome());
        }
    }
}
