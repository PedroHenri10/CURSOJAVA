import java.util.*;

class ProdutoHashMap {

    int codigo;

    public Produto(int codigo) {
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
}

public class TesteMap {

    public static void main(String[] args) {

        HashMap<Produto, String> map = new HashMap<>();

        map.put(new Produto(1), "Mouse");

        System.out.println(map.get(new Produto(1))); 
    }
}
