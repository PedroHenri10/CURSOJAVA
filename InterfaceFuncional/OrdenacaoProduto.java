        import java.util.*;
import java.util.stream.*;

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    @Override
    public String toString() {
        return nome + " - " + preco;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(21, 34, 12, 45);

        System.out.println("9. Último dígito:");
        nums.stream()
            .sorted(Comparator.comparingInt((Integer n) -> n % 10)
                    .thenComparingInt(n -> n))
            .forEach(System.out::println);

        List<Produto> produtos = Arrays.asList(
            new Produto("Notebook", 3000),
            new Produto("Mouse", 100),
            new Produto("Teclado", 150),
            new Produto("Monitor", 1200),
            new Produto("mouse", 100)
        );

        System.out.println("\n10. Preço crescente:");
        produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco))
                .forEach(System.out::println);

        System.out.println("\n11. Preço DESC + Nome ASC:");
        produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco)
                        .reversed()
                        .thenComparing(Produto::getNome))
                .forEach(System.out::println);

        System.out.println("\n12. Nome (ignore case):");
        produtos.stream()
                .sorted(Comparator.comparing(p -> p.getNome().toLowerCase()))
                .forEach(System.out::println);

        System.out.println("\n14. Produtos ordenados por preço (só nomes):");
        produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco))
                .map(Produto::getNome)
                .forEach(System.out::println);

        List<Integer> nums4 = Arrays.asList(10, 50, 30, 70, 20);

        System.out.println("\n15. Top 3 maiores:");
        nums4.stream()
             .sorted((a, b) -> b - a)
             .limit(3)
             .forEach(System.out::println);
    }
}
