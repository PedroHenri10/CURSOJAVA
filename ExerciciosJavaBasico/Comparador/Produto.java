import java.util.*;

class Produto implements Comparable<Produto> {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto outro) {

        if (this.preco < outro.preco) return -1;
        if (this.preco > outro.preco) return 1;

        return this.nome.compareTo(outro.nome);
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

        Collections.sort(lista);

        for (Produto p : lista) {
            System.out.println(p);
        }
    }
}
