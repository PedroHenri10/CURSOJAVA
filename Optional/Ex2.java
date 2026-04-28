import java.util.Optional;

public class Ex2 {
    public static void main(String[] args) {

        Optional<String> email = Optional.of("teste@email.com");

        email.ifPresent(e -> {
            System.out.println(e.toUpperCase());
        });
    }
}
