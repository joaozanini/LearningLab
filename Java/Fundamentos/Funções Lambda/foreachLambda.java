import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Maria", "João", "Alexandre", "Gustavo");
        
        System.out.println("Lambda #01:");
        aprovados.forEach(nome -> System.out.println(nome + ";"));
        
        System.out.println();
        
        System.out.println("Method Reference:");
        aprovados.forEach(System.out::println);
	}
}
