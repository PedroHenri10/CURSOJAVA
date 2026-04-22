import java.util.*;

public class Uppercase4Letras {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Lucas", "Jo");

        List<String> resultado = nomes.stream()
                .filter(nome -> nome.length() > 4) 
                .map(String::toUpperCase)         
                .toList();

        System.out.println(resultado);
    }
}
