public class ContaPoupanca extends Conta {
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            // Simula um rendimento de 2% ao depositar
            saldo += valor * 1.02;
        }
    }

    @Override
    public String toString() {
        return "Conta Poupança | Saldo: R$ " + String.format("%.2f", saldo);
    }
}
