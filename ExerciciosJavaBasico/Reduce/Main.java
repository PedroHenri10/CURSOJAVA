import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista1 = Arrays.asList(1,2,3,4,5);
        int soma1 = lista1.stream().reduce(0, (a, b) -> a + b);
        System.out.println(soma1);

        List<Integer> lista2 = Arrays.asList(1,2,3,4,5,6);
        int soma2 = lista2.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(soma2);

        
    }
}
