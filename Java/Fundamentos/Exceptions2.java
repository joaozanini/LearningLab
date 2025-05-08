import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(7 / sc.nextInt());
        } catch (Exception e) { // em caso de Exception (ex: / by zero)
            System.out.println("Exception: " + e.getMessage());
        } finally { // sempre é executado
            sc.close();
        }
    }
}
