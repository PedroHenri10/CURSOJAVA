import java.util.Scanner;
public class VerificaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite valor compra: ");

        int idade = scanner.nextInt();
        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }
        // Nenhuma condição cobre idade == 18
    }
}