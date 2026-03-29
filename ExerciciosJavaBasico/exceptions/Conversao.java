import java.util.Scanner;

public class Conversao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            String s = sc.nextLine();

            int num = Integer.parseInt(s);

            System.out.println("Número: " + num);

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida!");
        }

        sc.close();
    }
}
