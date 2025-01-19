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
		
		/* you can use these methods to brute strings*/
		System.out.println("João".concat("!"));
	}
}
