import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float valor = 120.f;
        Scanner sc = new Scanner(System.in);

        System.out.println("Você é estudante? (true/false)");
        boolean estudante = sc.nextBoolean();

        System.out.println("Você é trabalhador? (true/false)");
        boolean trabalhador = sc.nextBoolean();

        if(estudante || trabalhador){
            valor = valor /2;
            System.out.printf("valor da meia entrada: R$%.2f", valor);
        }else{
            System.out.printf("valor da entrada: R$%.2f", valor);
        }
    }
}