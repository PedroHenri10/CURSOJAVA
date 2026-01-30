import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        boolean verificacaoDados = false;

        while(!verificacaoDados) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu nome completo?");
            String nome = sc.nextLine();

            System.out.println("Sua idade?");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Qual é o seu Destino?");
            String destino = sc.nextLine();

            System.out.println("Quantos dias de viagem?");
            int diasViagem = sc.nextInt();

            System.out.println("Você confirma seus dados (true/false)?\n" +
            "nome completo: " + nome + "\n idade: "+ idade +
            " \n Destino: " + destino + " \n dias de viagem: "+ diasViagem);
            verificacaoDados = sc.nextBoolean();

            if(verificacaoDados){
                System.out.println("Dados confirmados!!!\n" +
                        "nome completo: " + nome + "\n idade: "+ idade +
                        " \n Destino: " + destino + " \n dias de viagem: "+ diasViagem);
            }
        }

    }
}