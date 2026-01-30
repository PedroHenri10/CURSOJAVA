import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        System.out.println("Aluno: ");
        String aluno = sc.nextLine();

        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = sc.nextDouble();

        System.out.println("Nota 4: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2+ nota3+ nota4)/4;

        if(media < 4){
            System.out.println(aluno + " Reprovado!");
        }else if(media < 6){
            System.out.println(aluno +" Recuperação!");
        }else{
            System.out.println(aluno + " Aprovado!");
        }
    }
}