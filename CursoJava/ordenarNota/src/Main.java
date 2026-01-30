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
        double aux = 0;

        System.out.println(aluno + " - Ordenação notas: ");
        if(nota1 > nota2 && nota1 > nota3 ){
            System.out.println(nota1);
            if(nota2 > nota3){
                System.out.println(nota2);
                System.out.println(nota3);
            }else{
                System.out.println(nota3);
                System.out.println(nota2);
            }
        }else if(nota2 > nota3){
            System.out.println(nota2);
            if(nota1 > nota3){
                System.out.println(nota1);
                System.out.println(nota3);
            }else{
                System.out.println(nota3);
                System.out.println(nota1);
            }
        }else if(nota3 > nota1 && nota3 > nota2){
            System.out.println(nota3);
            if(nota1> nota2){
                System.out.println(nota1);
                System.out.println(nota2);
            }else{
                System.out.println(nota2);
                System.out.println(nota1);
            }
        }else{
            System.out.println("notas iguais: "+nota3 + " " + nota2 + " " +nota1);
        }
    }
}