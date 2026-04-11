import java.util.function.Predicate;

public class PredicateAv2 {

    public static void main(String[] args) {

        String email = "user@email.com";
        String senha = "12345678";

        Predicate<String> emailValido =
                e -> e.contains("@") && e.contains(".");

        Predicate<String> senhaForte =
                s -> s.length() >= 8;

        if (emailValido.test(email) && senhaForte.test(senha)) {
            System.out.println("Usuário válido");
        } else {
            System.out.println("Dados inválidos");
        }
    }
}
