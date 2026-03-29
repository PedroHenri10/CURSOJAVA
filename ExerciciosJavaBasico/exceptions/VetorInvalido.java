import java.util.Scanner;

public class VetorInvalido {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = {10, 20, 30};

        try {
            System.out.print("Digite o índice: ");
            int i = sc.nextInt();

            System.out.println("Valor: " + vetor[i]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice inválido!");
        }

        sc.close();
    }
}
