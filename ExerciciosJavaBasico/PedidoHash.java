import java.time.LocalDate;
import java.util.Objects;

class PedidoHash {

    int id;
    LocalDate data;

    public Pedido(int id, LocalDate data) {
        this.id = id;
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido)) return false;

        Pedido p = (Pedido) o;
        return id == p.id && data.equals(p.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data);
    }

    @Override
    public String toString() {
        return "Pedido " + id + " - " + data;
    }
}
