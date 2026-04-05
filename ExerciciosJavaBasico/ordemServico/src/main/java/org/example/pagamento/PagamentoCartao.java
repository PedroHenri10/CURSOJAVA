package org.example.pagamento;

public class PagamentoCartao implements FormaPagamento {

    @Override
    public void pagar(double v) {
        System.out.println("Pago R$ " + v + " no Cartão.");
    }
}
