import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ValorComDesconto {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        cs.useLocale(new Locale("pt", "BR"));

        double valor = cs.nextDouble();
        cs.nextLine();

        if(valor > 100){
            valor = valor - (valor * 0.1);
            System.out.printf("novo valor com desconto: %.2f",valor);
        }else if(valor > 50){
            valor = valor - (valor * 0.05);
            System.out.printf("novo valor com desconto: %.2f",valor);
        }else{
            System.out.println("Não tem desconto!");
        }

    }
}
