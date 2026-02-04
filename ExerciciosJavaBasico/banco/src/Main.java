import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(new Locale("pt", "BR"));

        String saldoString = sc.nextLine();
        String saldoPadrao = saldoString.replaceAll(",", ".");
        float saldo = Float.parseFloat(saldoPadrao);
        int op = 0;

        if(saldoPadrao.equals("") && saldo == 0){
            System.out.println("Saldo atual: R$0,00");
            return;
        }else {
            op = sc.nextInt();
            sc.nextLine();
        }

        if(op >= 1 && op <=3 && saldo != 0){
            switch (op){
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f", saldo);
                    break;
                case 2:
                    float saque = 0;
                    String saqueString = sc.nextLine();
                    String saquePadrao = saqueString.replaceAll(",",".");
                    Pattern padrao = Pattern.compile("^\\d+(\\.\\d{2})?$");
                    Matcher matcher = padrao.matcher(saquePadrao);

                    if(matcher.find()){
                        saque = Float.parseFloat(saquePadrao);
                    }else{
                        System.out.println("Valor inválido para saque");
                        break;
                    }

                    if(saque < 1.00 ){
                        System.out.println("Valor inválido para saque");
                        break;
                    }else{
                        if(saldo >= saque){
                            saldo = (saldo - saque);
                            System.out.printf("Saldo atual: R$ %.2f", saldo);
                            break;
                        }else{
                            System.out.printf("Valor do saque maior do que o saldo disponível: R$%.2f", saldo);
                            break;
                        }
                    }
                case 3:
                    System.out.println("Encerrando a operação");
                    break;
                default:
                    break;
            }
        }else{
            System.out.println("Opção inválida!");
        }

    }
}