import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        String ladoAString = sc.nextLine().replaceAll(",",".");
        String ladoBString = sc.nextLine().replaceAll(",",".");
        String ladoCString = sc.nextLine().replaceAll(",",".");

        float ladoA = Float.parseFloat(ladoAString);
        float ladoB = Float.parseFloat(ladoBString);
        float ladoC = Float.parseFloat(ladoCString);

        if(ladoA + ladoB > ladoC && ladoA +ladoC > ladoB && ladoB+ladoC>ladoA){
            System.out.println("Triângulo Válido!");
        }else{
            System.out.println("Triângulo Inválido!");
        }
    }
}