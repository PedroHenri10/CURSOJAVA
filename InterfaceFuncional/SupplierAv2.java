import java.util.function.Supplier;

public class SupplierAv2 {

    static String cache = null;

    public static void main(String[] args) {

        Supplier<String> fornecedor = () -> {
            if (cache == null) {
                cache = "Valor caro de gerar";
            }
            return cache;
        };

        System.out.println(fornecedor.get());
        System.out.println(fornecedor.get()); 
    }
}
