import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opções\n" +
                "1- Novo jogo\n" +
                "2- Carregar\n" +
                "3- Configurações\n" +
                "4- Sair");
        int op = sc.nextInt();
        sc.nextLine();

        switch (op){
            case 1:
                System.out.println("Jogo Novo criado");
                break;
            case 2:
                System.out.println("Carregando...");
                break;
            case 3:
                System.out.println("Configurando...");
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção Inválida1");
                break;
        }
    }
}