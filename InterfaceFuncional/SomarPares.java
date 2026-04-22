import java.util.*;

public class SomarPares {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        int soma = numeros.stream()
                .filter(n -> n % 2 == 0)  
                .reduce(0, (a, b) -> a + b); 

        System.out.println("Soma dos pares: " + soma);
    }
}
