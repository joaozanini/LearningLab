package fundamentos;

public class incremento {
	public static void main(String[] args) {
        int a = 1;
        System.out.println("int a = " + a);
        System.out.println();
        
        System.out.println("retorno de a++ =" + a++);
        System.out.println("var a após incremento = " + a);
        
        a = 1;
        System.out.println("retorno de ++a = " + ++a);
        System.out.println("var a após incremento = " + a);      
    }
}
