import java.util.*;

public class InverterList {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Collections.reverse(lista);

        System.out.println(lista);
    }
}
