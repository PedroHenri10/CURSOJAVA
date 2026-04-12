import java.util.function.BiFunction;

public class BiFunctionAv1 {

    public static void main(String[] args) {

        BiFunction<Double, Double, Double> calcular =
                (preco, peso) -> preco + (peso * 2);

        double total = calcular.apply(100.0, 5.0);

        System.out.println("Total com frete: " + total);
    }
}
