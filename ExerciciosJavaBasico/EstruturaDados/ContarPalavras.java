import java.util.*;

public class ContarPalavras {
    public static void main(String[] args) {

        String[] palavras = {"java", "sql", "java", "api"};

        Map<String, Integer> mapa = new HashMap<>();

        for (String p : palavras) {
            mapa.put(p, mapa.getOrDefault(p, 0) + 1);
        }

        System.out.println(mapa);
    }
}
