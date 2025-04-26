import java.util.*;

public class Main {
	
	public static void main(String[] args) {
	    Map<Integer, String> users = new HashMap<>();
	    
	    users.put(1, "João");
	    users.put(1, "João Zanini"); // put adiciona e altera um dado, nesse caso ele altera João -> João Zanini
	    users.put(2, "Maria");
	    
	    System.out.println(users.size()); // 2
	    
	    System.out.println(users.keySet()); // [1, 2]
	    System.out.println(users.values()); // [João Zanini, Maria]
	    System.out.println(users.entrySet()); // [1=João Zanini, 2=Maria]
	    
	    System.out.println(users.containsKey(1)); // true
	    System.out.println(users.containsValue("Maria")); // true
	    
	    System.out.println(users.get(2)); // Maria
	    
	    for(int chave: users.keySet()) {
	        System.out.println(chave);
	    }
	    
	    for(String usuario: users.values()) {
	        System.out.println(usuario);
	    }
	    
	    for(Map.Entry<Integer, String> registro: users.entrySet()) { // no lugar de Map.Entry, pode importar java.util.Map.Entry e usar só Entry
	        System.out.println(registro.getKey() + " " + registro.getValue());
	    }
	}
}
