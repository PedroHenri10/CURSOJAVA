import java.util.*;

public class DuplicadosSet {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 2, 4, 1);

        Set<Integer> vistos = new HashSet<>();
        Set<Integer> duplicados = new HashSet<>();

        for (int n : lista) {
            if (!vistos.add(n)) {
                duplicados.add(n);
            }
        }

        System.out.println(duplicados);
    }
}
