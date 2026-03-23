import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        String invertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }

        if (palavra.equalsIgnoreCase(invertida)) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }

        sc.close();
    }
}
