import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome da pessoa: ");
        String nome = scanner.nextLine();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";

        try {
            Connection connection = FabricaConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nome);
            preparedStatement.execute();

            connection.close();
            System.out.println("Insert executed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
