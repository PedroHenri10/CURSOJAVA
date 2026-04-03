import java.util.*;

public class RemoverValores {
    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("A", 3);
        mapa.put("B", 7);
        mapa.put("C", 2);

        mapa.entrySet().removeIf(entry -> entry.getValue() < 5);

        System.out.println(mapa);
    }
}
