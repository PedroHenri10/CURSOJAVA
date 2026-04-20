import java.util.*;

public class ContagemPalavra {
    public static void main(String[] args) {

        String frase = "java java python java c python c";

        String[] palavras = frase.split(" ");

        Map<String, Integer> contador = new HashMap<>();

        for (String p : palavras) {
            contador.put(p, contador.getOrDefault(p, 0) + 1);
        }

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(contador.entrySet());

        lista.sort((a, b) -> b.getValue() - a.getValue());
      
        StringBuilder resultado = new StringBuilder();

        for (Map.Entry<String, Integer> e : lista) {
            resultado.append(e.getKey())
                     .append(" -> ")
                     .append(e.getValue())
                     .append("\n");
        }

        StringBuffer buffer = new StringBuffer(resultado.toString());

        buffer.reverse();

        System.out.println(buffer.toString());
    }
}
