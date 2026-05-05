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

        List<Integer> lista3 = Arrays.asList(5, 12, 20, 8, 30);
        int count = lista3.stream()
                .filter(n -> n > 10)
                .reduce(0, (acc, n) -> acc + 1);
        System.out.println(count);

        List<Integer> lista4 = Arrays.asList(1,2,3,4,5);
        int soma4 = lista4.stream().reduce(0, Integer::sum);
        System.out.println(soma4);

        List<Integer> lista5 = Arrays.asList(1, 2, 3, 4);
        int produto = lista5.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(produto);
    }
}
