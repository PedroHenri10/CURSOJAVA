import java.util.stream.Stream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors; 
import java.util.function.Predicate;

class Main {
    public static void main(String[] args) {
        List<Integer> listaNums = Arrays.asList(5, 2, 9, 1);
        List<Integer> ordenacaoo = listaNums.stream().sorted((a,b) -> a - b).collect(Collectors.toList());
        
        ordenacaoo.forEach(System.out::println);
        
       List<Integer> descc =listaNums.stream().sorted((a,b) -> b - a).collect(Collectors.toList());
       
       descc.forEach(System.out::println);
       
       List<String> nomes3 = Arrays.asList("Pedro", "Ana", "Carlos");
       
       List<String> ordenNomes = nomes3.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
       ordenNomes.forEach(System.out::println);
    }
}
