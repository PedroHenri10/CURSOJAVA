import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana","Pedro","Jo","Carlos");

       Predicate<String> maistresletras = s -> s.length() > 3;
       
       List<String> nomestresletras = nomes.stream().filter(maistresletras).collect(Collectors.toList());
       System.out.println(nomestresletras);
       
       List<Integer> nums = Arrays.asList(10, 5, 30, 20);
       
       Predicate<Integer> maiorque15 = n -> n > 15;
       
       List<Integer> maiores= nums.stream().filter(maiorque15).collect(Collectors.toList());
       System.out.println(maiores);
       
       Function<Integer, Integer> dobro = x -> x*2;
       
       List<Integer> listaDobro = nums.stream().map(dobro).collect(Collectors.toList());
       System.out.println(listaDobro);
       
       Function<String, String> maiusculo = s -> s.toUpperCase();
       
       List<String> maiusculos = nomes.stream().map(maiusculo).collect(Collectors.toList());
       System.out.println(maiusculos);
       
       Function<String, Integer> tamanhoPalavras = s -> s.length();
       
       List<Integer> tamanho = nomes.stream().map(tamanhoPalavras).collect(Collectors.toList());
       System.out.println(tamanho);
       
       List<Integer> numerosOrdenado = nums.stream().sorted().collect(Collectors.toList());
       System.out.println(numerosOrdenado);
       
       List<Integer> numsDes = nums.stream().sorted((a,b) -> b - a).collect(Collectors.toList());
       System.out.println(numsDes);
       
       List<String> ordenarS = nomes.stream().sorted((a,b) -> a.length() - b.length()).collect(Collectors.toList());
       System.out.println(ordenarS);

        List<Integer> listaNumeros2 = Arrays.asList( 15, 42, 10, 8, 99, 15, 23, 42, 7, 50, 10, 15, 88, 32, 7, 10, 60, 42, 99, 5 );
        
        List<Integer> topTresMaiores = listaNumeros2.stream().sorted(Comparator.reverseOrde
        r()).limit(3).collect(Collectors.toList());
        System.out.println(topTresMaiores);
    }
}
