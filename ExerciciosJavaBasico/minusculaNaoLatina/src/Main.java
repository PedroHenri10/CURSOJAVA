import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String t1 = "ação";
        String t2 = "acao";
        String t3 = "AÇÃO";

        Pattern padrao = Pattern.compile("[\\p{Ll}&&[^a-z]]");
        Matcher matcher1 = padrao.matcher(t1);
        Matcher matcher2 = padrao.matcher(t2);
        Matcher matcher3 = padrao.matcher(t3);

        if(matcher1.find()){
            System.out.println("Contem minusculas não latinas");
        }else{
            System.out.println("Não contem minusculas não latinas");
        }

        if(matcher2.find()){
            System.out.println("Contem minusculas não latinas");
        }else{
            System.out.println("Não contem minusculas não latinas");
        }

        if(matcher3.find()){
            System.out.println("Contem minusculas não latinas");
        }else{
            System.out.println("Não contem minusculas não latinas");
        }
    }
}