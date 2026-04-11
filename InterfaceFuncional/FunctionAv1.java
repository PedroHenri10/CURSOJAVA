import java.util.function.Function;

public class FunctionAv1 {

    public static void main(String[] args) {

        Function<String, String> trim = s -> s.trim();
        Function<String, String> upper = s -> s.toUpperCase();
        Function<String, Integer> tamanho = s -> s.length();

        Function<String, Integer> pipeline =
                trim.andThen(upper).andThen(tamanho);

        System.out.println(pipeline.apply("  java  "));
    }
}
