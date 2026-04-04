import java.util.*;

public class RemoverDuplicados {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 2, 3, 1, 4);

        Set<Integer> visto = new HashSet<>();
        List<Integer> resultado = new ArrayList<>();

        for (int n : lista) {
            if (!visto.contains(n)) {
                resultado.add(n);
                visto.add(n);
            }
        }

        System.out.println(resultado);
    }
}
