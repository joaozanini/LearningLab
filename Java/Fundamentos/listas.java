import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> usuarios = new ArrayList<>();
        usuarios.add(new User("João", 1));
        usuarios.add(new User("Maria", 2));

        for (User u : usuarios) {
            System.out.println("Nome: " + u.nome + ", ID: " + u.userId);
        }
    }
}

class User {
    String nome;
    int userId;

    User(String nome, int userId) {
        this.nome = nome;
        this.userId = userId;
    }
}
