import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Tem título: (true/false): ");
        boolean titulo = sc.nextBoolean();

       if(idade >= 18){
           System.out.println("Deve votar!");
       }else if(idade >=16 && titulo){
           System.out.println("Se quiser, pode votar!");
       }else{
            System.out.println("Não precisa votar!");
        }
    }
}