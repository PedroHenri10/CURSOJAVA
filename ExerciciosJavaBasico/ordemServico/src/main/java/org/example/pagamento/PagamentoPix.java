package org.example.pagamento;

public class PagamentoPix implements FormaPagamento {

    @Override
    public void pagar(double v) {
        System.out.println("Pago R$ " + v + " via PIX.");
    }
}
