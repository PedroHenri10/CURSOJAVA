import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Negativado? (true/false): ");
        boolean negativado = sc.nextBoolean();

        System.out.print("É VIP? (true/false): ");
        boolean vip = sc.nextBoolean();

        System.out.print("Cliente há mais de 1 ano? (true/false): ");
        boolean tempo = sc.nextBoolean();

        if (!negativado && (vip || tempo)) {
            System.out.println("Cashback aprovado!");
        } else {
            System.out.println("Sem cashback.");
        }

        sc.close();
    }
}