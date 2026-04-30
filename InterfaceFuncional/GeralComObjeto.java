import java.util.stream.Stream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors; 
import java.util.function.Predicate;

class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    
    @Override
    public String toString() { return nome + " (" + idade + ")"; }
    
}

class Main {
    public static void main(String[] args) {
        Predicate<Pessoa> maiorDeIdade = p -> p.getIdade() >=18;
        
        List<Pessoa> lista = new ArrayList<>();

        lista.add(new Pessoa("Alice", 20));
        lista.add(new Pessoa("Bruno", 12));
        lista.add(new Pessoa("Carla", 17));
        lista.add(new Pessoa("Diego", 23));
        lista.add(new Pessoa("Elena", 24));
        lista.add(new Pessoa("Fabio", 15));
        lista.add(new Pessoa("Gabi", 26));
        lista.add(new Pessoa("Hugo", 27));
        lista.add(new Pessoa("Iara", 28));
        lista.add(new Pessoa("João", 29));
        
        List<Pessoa> maioresDeIdade = lista.stream().filter(maiorDeIdade).collect(Collectors.toList());
        System.out.println(maioresDeIdade);
        
        // ordenar por idade
        List<Pessoa> ordenacaoporidade = lista.stream().sorted(Comparator.comparing(Pessoa::getIdade)).collect(Collectors.toList());
        
        ordenacaoporidade.forEach(System.out::println);
        
        //odernar por nome
        List<Pessoa> ordenacaoPorNome = lista.stream().sorted(Comparator.comparing(Pessoa::getNome)).collect(Collectors.toList());
        
        ordenacaoPorNome.forEach(System.out::println);

        List<Pessoa> ex13 = lista.stream().filter(p -> p.getIdade() >= 18).sorted(Comparator.comparing(Pessoa::getIdade)).collect(Collectors.toList());
        System.out.println(ex13);
        
        List<String> ex14 = lista.stream().filter(p -> p.getIdade() >= 18).sorted(Comparator.comparing(Pessoa::getIdade)).map(p -> p.getNome()).collect(Collectors.toList());
        System.out.println(ex14);
        
        lista.stream()
     .filter(p -> p.getIdade() >= 18)
     .sorted(Comparator.comparing(p -> p.getNome()))
     .map(p -> p.getNome())
     .forEach(System.out::println);
    }
}
