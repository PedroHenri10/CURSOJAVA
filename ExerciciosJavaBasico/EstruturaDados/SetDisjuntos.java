import java.util.*;

public class SetDisjuntos {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> b = new HashSet<>(Arrays.asList(3, 4));

        boolean disjuntos = Collections.disjoint(a, b);

        System.out.println("São disjuntos? " + disjuntos);
    }
}
