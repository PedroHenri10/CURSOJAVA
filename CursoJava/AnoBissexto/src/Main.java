import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(new Locale("pt", "BR"));

        String anoString = sc.nextLine().replaceAll(",",".");
        int ano = Integer.parseInt(anoString);

        if((ano % 100 == 0 && ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.printf("%d é bissexto", ano);
        }else{
            System.out.printf("%d não é bissexto", ano);
        }
    }
}