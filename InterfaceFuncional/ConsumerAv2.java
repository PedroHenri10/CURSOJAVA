import java.util.*;
import java.util.function.Consumer;

public class ConsumerAv2 {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4);

        int[] soma = {0};

        Consumer<Integer> somador =
                n -> soma[0] += n;

        lista.forEach(somador);

        System.out.println("Soma: " + soma[0]);
    }
}
