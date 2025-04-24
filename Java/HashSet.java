import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		HashSet conjunto = new HashSet();
			
		conjunto.add('M');
		conjunto.add("<3");
		conjunto.add(19);
		conjunto.add(true);
		conjunto.add(1.2);
	        // conversão automática para todos os tipos ex: int --> Integer
	        
	        System.out.println("Tamanho do conjunto: " + conjunto.size());
	        System.out.println(conjunto.remove(true)); // retorna true pq foi removido com sucesso
	        System.out.println("Tamanho do conjunto após remoção de 'true': " + conjunto.size());
	        System.out.println(conjunto.contains('M')); // retorna true pq 'M' está no Conjunto, lembrando que M != m
	        System.out.println(conjunto);
	        
	        Set nums = new HashSet();
	        nums.add(1);
	        nums.add(2);
	        nums.add(3);
	        
	        // união entre conjuntos
	        conjunto.addAll(nums);
	        
	        // Remove os itens que não estão em nums (retem o que está dentro dos parênteses)
	        conjunto.retainAll(nums);
	        
	        // remover nums de conjunto
	        conjunto.remove(nums);
	        
	        // clear em nums
	        nums.clear();
	        System.out.println(nums);

		//Set tipados
		Set<String> nomes = new HashSet<String>(); // só aceitas valores do tipo String
		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Alexandre");
		nomes.add("Gustavo");
		nomes.add("Miriasi");
		nomes.add("Fabiana");

		System.out.println("Nomes não ordenados: ");
		for(String nome: nomes) {
			System.out.println(nome); // HashSet não possui ordem, os nomes vão sair em uma ordem aleatória
		}

		// Usando o TreeSet & SortedSet (tem critério de ordenação)
		SortedSet<String> nomesOrdenados = new TreeSet<String>(); 
		nomesOrdenados.add("Zanini");
		nomesOrdenados.add("Reinaldo");
		nomesOrdenados.add("Gabriel");
		nomesOrdenados.add("Shark");
		nomesOrdenados.add("Daniel");
		nomesOrdenados.add("Goat");

		System.out.println("Nomes ordenados: ");
		for(String nome: nomesOrdenados) {
			System.out.println(nome); // Nesse caso o critério de ordenação é ordem alfabética (padrão do java para TreeSet)
		} 
	}
}
