import java.util.*;
import java.util.function.*;

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

class Pedido {
    List<Produto> produtos;
    int quantidade;

    public Pedido(List<Produto> produtos, int quantidade) {
        this.produtos = produtos;
        this.quantidade = quantidade;
    }
}

public class SistemaPedidos {

    public static void main(String[] args) {

        List<Pedido> pedidos = Arrays.asList(
                new Pedido(Arrays.asList(new Produto("Mouse", 100)), 2),
                new Pedido(Arrays.asList(new Produto("Teclado", 200)), 0), 
                new Pedido(Arrays.asList(new Produto("Monitor", 800)), 1)
        );

        Predicate<Pedido> pedidoValido =
                p -> p.quantidade > 0 && !p.produtos.isEmpty();

        BiFunction<Pedido, Double, Double> calcularTotal =
                (p, taxa) -> {
                    double soma = 0;
                    for (Produto prod : p.produtos) {
                        soma += prod.preco;
                    }
                    return (soma * p.quantidade) * (1 + taxa);
                };

        Function<Double, Double> desconto =
                total -> total > 500 ? total * 0.9 : total;

        Supplier<Integer> gerarId =
                () -> new Random().nextInt(10000);

        Consumer<String> log =
                msg -> System.out.println("LOG: " + msg);

        pedidos.stream()
                .filter(pedidoValido)
                .forEach(p -> {

                    int id = gerarId.get();

                    double total = calcularTotal.apply(p, 0.1); 
                    double finalValor = desconto.apply(total);

                    log.accept("Pedido " + id + " processado");

                    System.out.println("Pedido ID: " + id);
                    System.out.println("Valor final: " + finalValor);
                    System.out.println("------");
                });
    }
}
