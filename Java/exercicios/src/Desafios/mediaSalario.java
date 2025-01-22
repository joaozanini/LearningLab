package Desafios;

import java.util.Scanner;

public class mediaSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro Salário: ");
		String val1 = entrada.next().replace(",", ".");
		
		System.out.print("Segundo Salário: ");
		String val2 = entrada.next().replace(",", ".");
		
		System.out.print("Terceiro Salário: ");
		String val3 = entrada.next().replace(",", ".");
		
		double sal1 = Double.parseDouble(val1);
		double sal2 = Double.parseDouble(val2);
		double sal3 = Double.parseDouble(val3);
		
		entrada.close();
		
		System.out.println("Sua média salarial é de: R$" + (sal1 + sal2 + sal3) / 3);
	} 

}
