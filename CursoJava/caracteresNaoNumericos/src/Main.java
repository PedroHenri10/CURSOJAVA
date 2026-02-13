import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite apenas valores númericos!");
        String valor = sc.nextLine();

        if(valor.matches("\\d+")){
            System.out.println("Valor válido!");
        }else{
            System.out.println("valor inválido, contém valores não númericos!");
        }
    }
}