import java.util.*;

public class RotacaoList {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;

        Collections.rotate(lista, k);

        System.out.println(lista);
    }
}
