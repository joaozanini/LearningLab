import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB_complete {

    public static void main(String[] args) throws SQLException {

        query("CREATE DATABASE IF NOT EXISTS curso_java");
        query("USE curso_java");
        query("CREATE TABLE pessoas (" +
                "codigo INT AUTO_INCREMENT PRIMARY KEY," +
                "nome VARCHAR(80) NOT NULL" +
                ")");
    }

     static void query(String query) throws SQLException {
         try {
             Connection connection = FabricaConnection.getConnection();
             Statement statement = connection.createStatement();
             statement.execute(query);
             connection.close();
             System.out.println("Query executed");
         } catch (SQLException e) {
             System.out.println("Query failed");
         }

     }
}
