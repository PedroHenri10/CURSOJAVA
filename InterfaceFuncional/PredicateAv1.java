import java.util.*;
import java.util.function.Predicate;

class Produto {
    String nome;
    double preco;
    boolean promocao;

    public Produto(String nome, double preco, boolean promocao) {
        this.nome = nome;
        this.preco = preco;
        this.promocao = promocao;
    }
}

public class PredicateAv1 {
    public static void main(String[] args) {

        List<Produto> lista = Arrays.asList(
                new Produto("Mouse", 120, true),
                new Produto("Monitor", 800, false),
                new Produto("Mesa", 300, true),
                new Produto("Teclado", 90, false)
        );

        Predicate<Produto> precoAlto = p -> p.preco > 100;
        Predicate<Produto> nomeComM = p -> p.nome.startsWith("M");
        Predicate<Produto> naoPromocao = p -> !p.promocao;

        Predicate<Produto> regra =
                (precoAlto.and(nomeComM)).or(naoPromocao);

        lista.stream()
             .filter(regra)
             .forEach(p -> System.out.println(p.nome));
    }
}
