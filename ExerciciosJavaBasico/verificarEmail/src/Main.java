import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String t1 = "claudinho@gmail.com";
        String t2 = "cleiton@hotmail";
        String t3 = "amandaLionel";

        Pattern padrao = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher1 = padrao.matcher(t1);
        Matcher matcher2 = padrao.matcher(t2);
        Matcher matcher3 = padrao.matcher(t3);

        if(matcher1.find()){
            System.out.println("Email Válido!");
        }else{
            System.out.println("Email não Válido!");
        }

        if(matcher2.find()){
            System.out.println("Email Válido!");
        }else{
            System.out.println("Email não Válido!");
        }

        if(matcher3.find()){
            System.out.println("Email Válido!");
        }else{
            System.out.println("Email não Válido!");
        }
    }
}