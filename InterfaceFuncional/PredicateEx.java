import java.util.*;
import java.util.function.Predicate;

class Usuario {
    String nome;
    int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class PredicateEx {

    public static void main(String[] args) {

        List<Usuario> lista = Arrays.asList(
                new Usuario("Pedro", 17),
                new Usuario("Ana", 22),
                new Usuario("Carlos", 19)
        );

        Predicate<Usuario> maiorDeIdade = u -> u.idade >= 18;

        for (Usuario u : lista) {
            if (maiorDeIdade.test(u)) {
                System.out.println(u.nome);
            }
        }
    }
}
