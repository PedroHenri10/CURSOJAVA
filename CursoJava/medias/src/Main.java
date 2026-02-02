import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        String stringNota1 = sc.nextLine();
        String stringNota2 = sc.nextLine();
        String stringNota3 = sc.nextLine();
        String stringNota4 = sc.nextLine();

        String nota1Padrao = stringNota1.replaceAll(",", ".");
        String nota2Padrao = stringNota2.replaceAll(",", ".");
        String nota3Padrao = stringNota3.replaceAll(",", ".");
        String nota4Padrao = stringNota4.replaceAll(",", ".");

        float nota1 = Float.parseFloat(nota1Padrao);
        float nota2 = Float.parseFloat(nota2Padrao);
        float nota3 = Float.parseFloat(nota3Padrao);
        float nota4 = Float.parseFloat(nota4Padrao);

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("%.2f", media);
    }
}