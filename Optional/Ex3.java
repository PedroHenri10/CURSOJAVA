import java.util.Optional;

public class Ex3 {
    public static void main(String[] args) {

        Optional<Integer> numero = Optional.of(10);

        Optional<Integer> resultado = numero.map(n -> n * 2);

        System.out.println(resultado.orElse(0));
    }
}
