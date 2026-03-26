import java.util.*;

class Produto {

    String nome;
    int codigo;

    public Produto(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;

        Produto p = (Produto) o;
        return codigo == p.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return nome + " (Código: " + codigo + ")";
    }
}

public class TesteProduto {
    public static void main(String[] args) {

        HashSet<Produto> set = new HashSet<>();

        set.add(new Produto("Mouse", 1));
        set.add(new Produto("Teclado", 2));
        set.add(new Produto("Mouse", 1)); // duplicado

        System.out.println(set);
    }
}
