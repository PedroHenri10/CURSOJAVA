import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String veiculo = sc.nextLine().toLowerCase();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        switch (veiculo){
            case "moto":
                System.out.println("Tarifa de moto: R$5,00");
                break;
            case "carro":
                System.out.println("Tarifa de carro: R$10,00");
                break;
            case "caminhao":
                System.out.println("Tarifa de caminhão: R$20,00");
                break;
            case "onibus":
                System.out.println("Tarifa de onibus: R$30,00");
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
}