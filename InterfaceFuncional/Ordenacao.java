import java.util.*;
import java.util.stream.*;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    @Override
    public String toString() {
        return nome + " (" + idade + ")";
    }
}

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(5, 2, 9, 1);

        System.out.println("1. Crescente:");
        lista.stream()
             .sorted((a, b) -> a - b)
             .forEach(System.out::println);

        System.out.println("\n2. Decrescente:");
        lista.stream()
             .sorted((a, b) -> b - a)
             .forEach(System.out::println);

        List<String> nomes = Arrays.asList("Pedro", "Ana", "Carlos");

        System.out.println("\n3. Strings A-Z:");
        nomes.stream()
             .sorted((a, b) -> a.compareTo(b))
             .forEach(System.out::println);

        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Carlos", 30),
            new Pessoa("Ana", 22),
            new Pessoa("Pedro", 25),
            new Pessoa("Bia", 22)
        );

        System.out.println("\n4. Por idade:");
        pessoas.stream()
               .sorted(Comparator.comparing(Pessoa::getIdade))
               .forEach(System.out::println);

        System.out.println("\n5. Por nome:");
        pessoas.stream()
               .sorted(Comparator.comparing(Pessoa::getNome))
               .forEach(System.out::println);

        System.out.println("\n6. Idade DESC:");
        pessoas.stream()
               .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
               .forEach(System.out::println);
    }
}
