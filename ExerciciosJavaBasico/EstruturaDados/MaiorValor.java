import java.util.*;

public class MaiorValor {
    public static void main(String[] args) {

        Map<String, Integer> notas = new HashMap<>();
        notas.put("Pedro", 7);
        notas.put("Leo", 9);
        notas.put("Carlos", 8);

        int maior = 0;

        for (int v : notas.values()) {
            if (v > maior) maior = v;
        }

        System.out.println("Maior nota: " + maior);
    }
}
