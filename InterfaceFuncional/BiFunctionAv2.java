import java.util.function.BiFunction;

class Produto {
    String nome;
    double preco;
    public Produto(String n, double p) { nome = n; preco = p; }
}

class Pedido {
    String descricao;
    public Pedido(String d) { descricao = d; }
}

public class BiFunctionAv2 {

    public static void main(String[] args) {

        BiFunction<Produto, Pedido, String> resumo =
                (p, ped) -> ped.descricao + " - " + p.nome + " R$" + p.preco;

        Produto p = new Produto("Mouse", 100);
        Pedido ped = new Pedido("Pedido #1");

        System.out.println(resumo.apply(p, ped));
    }
}
