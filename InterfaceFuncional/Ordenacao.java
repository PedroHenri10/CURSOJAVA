import java.util.*;
import java.util.stream.*;

class Pessoa {
    String nome;
    Integer idade;

    Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public Integer getIdade() { return idade; }

    @Override
    public String toString() {
        return nome + " (" + idade + ")";
    }
}

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(5, 2, 9, 1);

        System.out.println("1.");
        lista.stream().sorted((a, b) -> a - b).forEach(System.out::println);

        System.out.println("2.");
        lista.stream().sorted((a, b) -> b - a).forEach(System.out::println);

        List<String> nomes = Arrays.asList("Pedro", "Ana", "Carlos");

        System.out.println("3.");
        nomes.stream().sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);

        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Carlos", 30),
            new Pessoa("Ana", 22),
            new Pessoa("Pedro", 25),
            new Pessoa("Bia", 22),
            new Pessoa("João", null)
        );

        System.out.println("4.");
        pessoas.stream()
               .filter(p -> p.getIdade() != null)
               .sorted(Comparator.comparing(Pessoa::getIdade))
               .forEach(System.out::println);

        System.out.println("5.");
        pessoas.stream()
               .sorted(Comparator.comparing(Pessoa::getNome))
               .forEach(System.out::println);

        System.out.println("6.");
        pessoas.stream()
               .filter(p -> p.getIdade() != null)
               .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
               .forEach(System.out::println);

        System.out.println("13.");
        pessoas.stream()
               .filter(p -> p.getIdade() != null && p.getIdade() > 18)
               .sorted(Comparator.comparing(Pessoa::getNome))
               .forEach(System.out::println);

        System.out.println("16.");
        pessoas.stream()
               .filter(p -> p.getIdade() != null)
               .sorted(Comparator.comparing(Pessoa::getIdade)
                                 .reversed()
                                 .thenComparing(Pessoa::getNome))
               .forEach(System.out::println);

        System.out.println("17a.");
        pessoas.stream()
               .sorted(Comparator.comparing(
                   Pessoa::getIdade,
                   Comparator.nullsFirst(Integer::compareTo)
               ))
               .forEach(System.out::println);

        System.out.println("17b.");
        pessoas.stream()
               .sorted(Comparator.comparing(
                   Pessoa::getIdade,
                   Comparator.nullsLast(Integer::compareTo)
               ))
               .forEach(System.out::println);

               pessoas.stream().sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome())).forEach(System.out::println);
    }
            }
