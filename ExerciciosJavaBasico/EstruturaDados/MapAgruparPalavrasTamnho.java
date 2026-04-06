import java.util.*;

public class MapAgruparPalavrasTamnho{
    public static void main(String[] args) {

        String[] palavras = {"java", "sql", "api", "spring"};

        Map<Integer, List<String>> mapa = new HashMap<>();

        for (String p : palavras) {
            int tamanho = p.length();

            mapa.putIfAbsent(tamanho, new ArrayList<>());
            mapa.get(tamanho).add(p);
        }

        System.out.println(mapa);
    }
}
