package fundamentos;

public class temper {
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		double fahrenheit;
		double celcius;
		
		fahrenheit = 32;
		celcius = ((fahrenheit - 32) * 5/9);
		
		System.out.println(celcius);
	}
}
