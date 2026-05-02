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

public class OrdenacaoProduto {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(21, 34, 12, 45);

        System.out.println("9. Último dígito:");
        nums.stream()
            .sorted(Comparator.comparing(n -> n % 10)
                    .thenComparing(n -> n)) 
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
                 .sorted(Comparator.comparing(
                     p -> p.getNome().toLowerCase()
                 ))
                 .forEach(System.out::println);
    }
}
