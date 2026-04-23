import java.util.*;

public class TotalCompras {
    public static void main(String[] args) {

        List<Double> compras = Arrays.asList(50.0, 200.0, 150.0, 80.0, 300.0);

        double total = compras.stream()
                .filter(valor -> valor > 100)      
                .map(valor -> valor * 0.9)         
                .reduce(0.0, (a, b) -> a + b);     

        System.out.println("Total com desconto: " + total);
    }
}
