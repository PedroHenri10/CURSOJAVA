
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Predicate<Integer> ehpar = n -> n % 2 ==0;
        
        Predicate<Integer> ehMaiorQue10 = a -> a > 10;
        if(ehMaiorQue10.test(2)){
            System.out.println("eh maior que 10!");
        }else{
            System.out.println("eh menor que 10!");
        }
        
        List<Integer> numeros = List.of(1,2,3,4,5,6);
        List<Integer> pares = numeros.stream().filter(n -> n % 2 ==0).collect(Collectors.toList());
        System.out.println(pares);
        
        List<String> nomes = List.of("Ana", "João", "Carlos");
        nomes.stream().filter(j -> j.startsWith("J")).forEach(System.out::println);
        
        List<Integer> numeros2 = List.of(5,1,3,2);
        List<Integer> ordenado = numeros2.stream().sorted().collect(Collectors.toList());
        System.out.println(ordenado);

        //Comparator.comparing(Usuario::getNome)
     //     .thenComparing(Usuario::getId);
    }
}
