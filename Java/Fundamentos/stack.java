import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Deque<String> livros = new ArrayDeque<String>(); // FILO
        
        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote");
        livros.add("O Hobbit");
        
        System.out.println(livros.peek());
        System.out.println(livros.element());
        
        System.out.println(livros.poll());
        System.out.println(livros.pop());
        
    }
}

