import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] notas = {1.0, 2.5, 3.3, 4.2, 5.1};
        System.out.println(Arrays.toString(notas));
        
        for(double nota: notas) {
            System.out.println(nota);
        }
 
        double media = mediaNotas(notas);
        System.out.println("Média: " + media);
    }

    public static double mediaNotas(double[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }
}
