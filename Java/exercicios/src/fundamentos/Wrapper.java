package fundamentos;

public class Wrapper {
	public static void main(String[] args) {

		// Primitive Types as Objects
		Byte b = 100;
		Short s = 1000;
		Integer i = 100000;
		Long l = 100000000L;

		// this way, you have access to Methods
		System.out.println(b.toString() + "!");
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = 'c';
		System.out.println(c.toString().toUpperCase());
	}
}
