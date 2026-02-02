import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de conta (0 - Corrente, 1 -Poupança, 2 - Investimento): ");

        int tipoConte = sc.nextInt();

        String descricaoConta;

        switch(tipoConte){
            case 0:
                descricaoConta = "Conta corrente";
                break;
            case 1:
                descricaoConta = "Conta poupança";
                break;
            case 3:
                descricaoConta = "Conta de investimento";
                break;
            default:
                descricaoConta = "Tipo de conta inválido!";
                break;
        }

        System.out.println("Resultado da classificação: " + descricaoConta);

        sc.close();
    }
}