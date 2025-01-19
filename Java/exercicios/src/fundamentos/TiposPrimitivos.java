package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// numeric types

		// integers numeric types
		byte anos = 19; // 1 byte (-128 to 127)
		short voos = 576; // 2 bytes
		int id = 56793; // 4 bytes
		long pontos = 3_234_845_223L; // L at the end | 8 bytes

		// real numeric types
		float salario = 51_990.90F; // F at the end
		double vendasAcumuladas = 2_991_797_103.01; // double the size of float

		// boolean
		boolean estaDeFerias = false; // true or false

		// character
		char firstLetter = 'J'; // 1 letter
		char uniCode = '\u0010'; // uniCode can be used

		System.out.println("Dias de vida: " + anos * 365);
		System.out.println("user id: " + id);
		System.out.println("Username first letter: " + firstLetter);
		System.out.println("Salário: " + salario);
		System.out.println("Número de Viagens: " + voos / 2);
		System.out.println("pontos acumulados: " + pontos);
		System.out.println("vendas acumuladas: " + vendasAcumuladas);
		System.out.println("Férias: " + estaDeFerias);
		System.out.println("uniCode: " + uniCode);
	}
}
