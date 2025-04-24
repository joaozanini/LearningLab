import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    // HashSet são 
	    
		HashSet conjunto = new HashSet();
		
		conjunto.add('M');
		conjunto.add("<3");
		conjunto.add(19);
		conjunto.add(true);
		conjunto.add(1.2);
        // conversão automática para todos os tipos ex: int --> Integer
        
        System.out.println("Tamanho do conjunto: " + conjunto.size());
        System.out.println(conjunto.remove(true));
        System.out.println("Tamanho do conjunto após remoção de 'true': " + conjunto.size());
        System.out.println(conjunto.contains('M'));
        System.out.println(conjunto);
        
        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        
        // união entre conjuntos
        conjunto.addAll(nums);
        
        // Remove os itens que não estão em nums (retem os de num)
        conjunto.retainAll(nums);
        
        // remover nums de conjunto
        conjunto.remove(nums);
        
        // clear em nums
        nums.clear();
        System.out.println(nums);
	}
}
