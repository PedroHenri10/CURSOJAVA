import java.util.*;
import java.util.stream.Collectors;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class FiltroPorIdade {
    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Pedro", 20),
            new Pessoa("Ana", 17),
            new Pessoa("Carlos", 25),
            new Pessoa("João", 15)
        );

        Map<String, List<String>> resultado = pessoas.stream()
                .filter(p -> p.nome.length() > 3) 
                .filter(p -> p.idade > 10)        
                .collect(Collectors.groupingBy(
                        p -> p.idade >= 18 ? "Maior" : "Menor",
                        Collectors.mapping(p -> p.nome, Collectors.toList())
                ));

        System.out.println(resultado);
    }
}
