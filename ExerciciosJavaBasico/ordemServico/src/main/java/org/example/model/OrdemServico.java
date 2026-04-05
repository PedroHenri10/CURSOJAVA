package org.example.model;
import org.example.pagamento.FormaPagamento;
import java.util.LinkedList;
import org.example.exceptions.OrdemVaziaException;
import org.example.exceptions.EquipamentoNaoEncontradoException;

public class OrdemServico {

    private static int geradorId = 1000;

    int id = geradorId++;
    String status = "ABERTA";
    String descricaoDefeito;

    LinkedList<Equipamento> equipamentos = new LinkedList<>();

    public static int getGeradorId() {
        return geradorId;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getDescricaoDefeito() {
        return descricaoDefeito;
    }

    public LinkedList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void adicionarEquipamento(Equipamento e) {
        equipamentos.add(e);
        System.out.println("Equipamento adicionado!");
    }

    public void adicionarEquipamento(String modelo) {
        System.out.println("Modelo " + modelo + " reservado.");
    }

    public double calcularOrcamento() {
        double total = 0;

        for (Equipamento e : equipamentos) {
            total += e.calcularValorServico();
        }

        return total;
    }

    public void encerrar(FormaPagamento fp) throws OrdemVaziaException {

        if (equipamentos.isEmpty()) {
            throw new OrdemVaziaException("Ordem vazia!");
        }

        double total = calcularOrcamento();
        fp.pagar(total);

        status = "ENCERRADA";

        System.out.println("Ordem encerrada! Total: R$ " + total);
    }

    public void cancelar() {
        status = "CANCELADA";
        System.out.println("Ordem cancelada!");
    }

    public void listarEquipamentos() {
        for (Equipamento e : equipamentos) {
            System.out.println(e);
        }
    }
}
