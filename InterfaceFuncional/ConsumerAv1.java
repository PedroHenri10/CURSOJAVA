import java.util.function.Consumer;

public class ConsumerAv1 {

    public static void main(String[] args) {

        Consumer<String> log =
                s -> System.out.println("Log: " + s);

        Consumer<String> salvar =
                s -> System.out.println("Salvando: " + s);

        Consumer<String> pipeline =
                log.andThen(salvar);

        pipeline.accept("Pedido 123");
    }
}
