import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Valor do empréstimo: ");
        float valor = sc.nextFloat();
        sc.nextLine();

        System.out.print("Possui restrição? (true/false): ");
        boolean restricao = sc.nextBoolean();

        if (idade >= 18 && !restricao) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo negado!");
        }

        sc.close();
    }
}