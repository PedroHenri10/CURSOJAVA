import java.util.*;

class PedidoLista {

    int id;
    List<String> itens;

    public Pedido(int id, List<String> itens) {
        this.id = id;
        this.itens = itens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido)) return false;

        Pedido p = (Pedido) o;
        return id == p.id && itens.equals(p.itens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, itens);
    }

    @Override
    public String toString() {
        return "Pedido " + id + " " + itens;
    }
}
