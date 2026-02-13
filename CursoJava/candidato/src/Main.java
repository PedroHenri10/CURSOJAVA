import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Cargo: ");
        String cargo = sc.nextLine();

        if(cargo.equalsIgnoreCase("deputado") && idade >= 21){
            System.out.println("Candidato apto!");
        }else if(cargo.equalsIgnoreCase("senador") && idade >= 35){
            System.out.println("Candidato apto!");
        }else if(cargo.equalsIgnoreCase("presidente") && idade >= 35){
            System.out.println("Candidato apto!");
        }else{
            System.out.println("Candidato não apto!");
        }
        sc.close();
    }
}