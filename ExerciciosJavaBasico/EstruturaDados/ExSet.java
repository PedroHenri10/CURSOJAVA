import java.util.*;

public class ExSet {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);

        System.out.println("Lista com duplicados:");
        System.out.println(numeros);

        Set<Integer> semDuplicados = new HashSet<>(numeros);

        System.out.println("Sem duplicados:");
        System.out.println(semDuplicados);
    }
}
