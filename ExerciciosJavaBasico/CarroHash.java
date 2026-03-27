import java.util.Objects;

class CarroHash {

    private final String placa;

    public Carro(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro)) return false;

        Carro c = (Carro) o;
        return placa.equals(c.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    @Override
    public String toString() {
        return placa;
    }
}
