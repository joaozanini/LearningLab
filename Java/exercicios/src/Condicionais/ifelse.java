package Condicionais;

public class ifelse {
	public static void main(String[] args) {
		double nota = 3.4;
		if (nota < 5) {
			System.out.println("Reprovado");
		} else if (nota < 7 && nota > 5) {
			System.out.println("Recuperação");
		} else if (nota > 7) {
			System.out.println("Aprovado");
		}
	}
}
