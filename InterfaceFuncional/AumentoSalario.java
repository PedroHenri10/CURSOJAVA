import java.util.*;

public class AumentoSalario {
    public static void main(String[] args) {

        List<Double> salarios = Arrays.asList(1000.0, 2000.0, 3000.0);

        double soma = salarios.stream()
                .map(s -> s * 1.10)
                .reduce(0.0, (a, b) -> a + b);

        double media = soma / salarios.size();

        System.out.println("Média com aumento: " + media);
    }
}
