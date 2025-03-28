package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Hello World";
		System.out.println(s);

		/* methods */
		// replace
		s = s.replace("Hello World", "Olá Mundo");
		System.out.println(s);

		// toUpperCase & toLowerCase
		s = s.toUpperCase();
		System.out.println(s);

		s = s.toLowerCase();
		System.out.println(s);

		// concat
		s = s.concat("!");
		System.out.println(s);

		// charAt
		System.out.println("Olá Mundo!".charAt(0));

		// startsWith & ends with
		System.out.println("Olá Mundo!".startsWith("Olá")); // True or False
		System.out.println("Olá Mundo!".endsWith("Olá")); // True or False

		/* you can use these methods to brute strings */
		System.out.println("João".concat("!"));

		// string f
		var nome = "João";
		var sobrenome = "Zanini";
		var idade = 19;
		var salario = 1500.00;

		// printf
		System.out.printf("Nome: %s %s | idade: %d | salário: R$%.2f", nome, sobrenome, idade, salario);

		// string format
		String frase = String.format("Nome: %s %s | idade: %d | salário: R$%.2f", nome, sobrenome, idade, salario);
		System.out.println();
		System.out.println(frase);
	}
}
