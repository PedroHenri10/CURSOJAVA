import java.util.*;

public class MaiorSalario {
    public static void main(String[] args) {

        List<Double> salarios = Arrays.asList(2000.0, 3500.0, 1500.0, 5000.0);

        double maior = salarios.stream()
                .map(s -> s * 1.15) 
                .reduce(0.0, (a, b) -> a > b ? a : b);

        System.out.println("Maior salário com aumento: " + maior);
    }
}
