import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] l1 = {1, 2, 3};
        int[] l2 = {4, 5, 6};
        int[] l3 = {7, 8, 9};
        
        int[][] matriz = {l1, l2, l3};

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}
