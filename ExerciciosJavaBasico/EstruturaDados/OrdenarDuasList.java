import java.util.*;

public class OrdenarDuasList {
    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> l2 = Arrays.asList(2, 4, 6, 8);

        List<Integer> resultado = new ArrayList<>();

        int i = 0, j = 0;

        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                resultado.add(l1.get(i++));
            } else {
                resultado.add(l2.get(j++));
            }
        }

        while (i < l1.size()) resultado.add(l1.get(i++));
        while (j < l2.size()) resultado.add(l2.get(j++));

        System.out.println(resultado);
    }
}
