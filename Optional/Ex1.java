import java.util.Optional;

public class Ex1 {
    public static void main(String[] args) {

        String nome = null;

        Optional<String> opt = Optional.ofNullable(nome);

        String resultado = opt.orElse("Desconhecido");

        System.out.println(resultado);
    }
}
