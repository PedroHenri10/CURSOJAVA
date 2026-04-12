import java.util.function.Supplier;

public class SupplierAv1 {

    static String carregarDados() {
        System.out.println("Buscando do banco...");
        return "Dados carregados";
    }

    public static void main(String[] args) {

        Supplier<String> lazy =
                () -> carregarDados();

        System.out.println("Antes...");
        System.out.println(lazy.get());
    }
}
