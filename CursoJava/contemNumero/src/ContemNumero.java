import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContemNumero {

    public static void main(String[] args){
        String t1 = "Choc4late";
        String t2 = "Cachorro";

        //boolean contemNumero t1.matches("");
        Pattern padrao = Pattern.compile("\\d+");
        Matcher matcher = padrao.matcher(t1);
        Matcher matcher1 = padrao.matcher(t2);

        if(matcher.find()){
            System.out.println("Contem Numeros!");
        }else{
            System.out.println("Não Contem Numeros!");
        }

        if(matcher1.find()){
            System.out.println("Contem Numeros!");
        }else{
            System.out.println("Não Contem Numeros!");
        }
    }
}
