import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        
        // Add e Offer -> adicionam elementos nan fila
        // a diferença no comportamento é quando a fila está cheia
        // add retorna uma Exception e offer retorna false
        
        fila.add("Maria");
        fila.offer("João");
        fila.add("Alexandre");
        fila.offer("Gustavo");
        
        // peek e element -> retornam o elemento na posição 0
        // a diferença no comportamento acontece qnd a fila estiver vazia
        // peek retorna null e element retorna uma Exception
        
        System.out.println(fila.peek());
        System.out.println(fila.element());       
        
        // poll e remove -> lê e remove o elemento da fila, ótimo para fifo (first in first out)
        // a diferença no comportamento acontece qnd a fila estiver vazia
        // poll retorna null e remove retorna uma Exception
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        
        // outros metodos importantes:
        System.out.println(fila.size()); // 2
        fila.clear(); // vai limpar a fila
        System.out.println(fila.isEmpty()); // true
        System.out.println(fila.contains("João")); // false
    }
}

