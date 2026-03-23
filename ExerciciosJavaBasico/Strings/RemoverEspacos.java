import java.util.Scanner;

public class emoverEspacos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c != ' ') {
                resultado += c;
            }
        }

        System.out.println("Sem espaços: " + resultado);

        sc.close();
    }
}
