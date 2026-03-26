import java.util.Objects;

class ContaBancaria {

    int numero;
    double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;

        Conta c = (Conta) o;
        return numero == c.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Conta: " + numero + ", Saldo: " + saldo;
    }
}
