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

class GeralComObjeto{
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
        
        //odernar por nome
    }
}
