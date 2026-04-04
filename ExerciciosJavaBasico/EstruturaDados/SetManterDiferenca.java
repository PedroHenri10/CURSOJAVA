import java.util.*;

public class SetManterDiferenca {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> resultado = new HashSet<>(a);
        resultado.addAll(b);

        Set<Integer> inter = new HashSet<>(a);
        inter.retainAll(b);

        resultado.removeAll(inter);

        System.out.println(resultado);
    }
}
