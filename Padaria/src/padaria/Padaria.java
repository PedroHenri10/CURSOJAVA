package padaria;

import java.time.LocalTime;
import javax.swing.JOptionPane;

public class Padaria {

    String cliente;
    int paes;
    boolean estaQueimado;
    LocalTime horario;

    public Padaria() {

        try {
            this.cliente = JOptionPane.showInputDialog("Nome do Cliente: ");
            if (this.cliente == null || this.cliente.trim().isEmpty()) {
                throw new VendaException("Nome do cliente não pode ser vazio!");
            }
        } catch (VendaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado no nome do cliente: " + e.toString());
        }

        try {
            this.paes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de pães: "));
            if (this.paes > 50) {
                throw new VendaException("Não é permitido vender mais de 50 pães por cliente!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Digite apenas números inteiros para a quantidade de pães!");
        } catch (VendaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado na quantidade de pães: " + e.toString());
        }

        try {
            int resposta = JOptionPane.showConfirmDialog(null, "Os pães estão queimados?", "Queimados", JOptionPane.YES_NO_OPTION);
            this.estaQueimado = (resposta == JOptionPane.YES_OPTION);

            if (this.estaQueimado) {
                throw new VendaException("Venda cancelada: Os pães estão queimados.");
            }

        } catch (VendaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao verificar se os pães estão queimados: " + e.toString());
        }


        try {
            this.horario = LocalTime.now();
            if (this.horario.isAfter(LocalTime.of(18, 0))) {
                throw new VendaException("Não é permitido vender após as 18 horas!");
            }
        } catch (VendaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado ao verificar o horário: " + e.toString());
        }
    }

    public static void main(String[] args) {
        Padaria p1 = new Padaria();
    }
}
