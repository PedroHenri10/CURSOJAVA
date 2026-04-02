import java.util.*;

public class SomarList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();
        notas.add(7.5);
        notas.add(8.0);
        notas.add(6.5);

        double soma = 0;
        for (double n : notas) soma += n;

        System.out.println("Média: " + (soma / notas.size()));
    }
}
