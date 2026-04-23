import java.util.*;

class ConcatenarMaiorIdade {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class Ex1 {
    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Pedro", 20),
            new Pessoa("Ana", 17),
            new Pessoa("Carlos", 25),
            new Pessoa("Mariana", 30)
        );

        String resultado = pessoas.stream()
                .filter(p -> p.idade >= 18)     
                .map(p -> p.nome)                
                .reduce("", (a, b) -> a.isEmpty() ? b : a + ", " + b);

        System.out.println(resultado);
    }
}
