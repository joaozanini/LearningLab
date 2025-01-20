package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		System.out.print("Digite seu nome: ");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();

		System.out.println("Seu nome: " + nome);
	}
}
