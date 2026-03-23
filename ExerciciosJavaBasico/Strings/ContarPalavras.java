import java.util.Scanner;

public class ContarPalavras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] palavras = frase.trim().split(" ");

        int contador = palavras.length;

        System.out.println("Quantidade de palavras: " + contador);

        sc.close();
    }
}
