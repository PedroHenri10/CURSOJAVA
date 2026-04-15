import java.util.*;

class ProdutoComparator {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco + " - Qtd: " + quantidade;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Mouse", 50, 10));
        lista.add(new Produto("Teclado", 100, 5));
        lista.add(new Produto("Monitor", 500, 2));
        lista.add(new Produto("Mouse Gamer", 50, 7));

        Collections.sort(lista, (a, b) -> b.quantidade - a.quantidade);

        System.out.println("Por quantidade:");
        lista.forEach(System.out::println);
        
        Collections.sort(lista, (a, b) -> b.nome.compareTo(a.nome));

        System.out.println("\nPor nome invertido:");
        lista.forEach(System.out::println);

        Collections.sort(lista, (a, b) -> Double.compare(b.preco, a.preco));

        System.out.println("\nPor preço desc:");
        lista.forEach(System.out::println);
    }
 }
