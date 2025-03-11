package projetoHashMap;
import java.util.HashMap;

public class HashMapE {

	public  static void main(String[] args) {
		HashMap<String, String> dicionario = new HashMap<>();
		dicionario.put("palavra 1", "significado da palavra 1");
		dicionario.put("palavra 2", "significado da palavra 2");
		dicionario.put("palavra 3", "significado da palavra 3");
		dicionario.put("palavra 4", "significado da palavra 4");
		
		HashMap<String, Integer> estoque = new HashMap<>();
		estoque.put("maça", 30);
		estoque.put("Uva", 30);
		estoque.put("Melão", 20);
		
		System.out.println(estoque.get("Uva"));
		
		for(String chave : estoque.keySet() )
		{
			System.out.println(chave + " "+ estoque.get(chave));
		}
	}
}
