import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção de almoço\n" +
                "1-Churrasscaria\n" +
                "2-Pizzaria\n" +
                "3-Japones\n" +
                "4-Vegetariano");
        int almoco = sc.nextInt();
        sc.nextLine();

        switch (almoco){
            case 1:
                System.out.println("indo para churrascaria...");
                break;
            case 2:
                System.out.println("indo para a pizzaria...");
                break;
            case 3:
                System.out.println("indo comer japones...");
                break;
            case 4:
                System.out.println("indo para o restaurante vegetariano...");
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
}