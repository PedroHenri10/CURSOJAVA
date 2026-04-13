import java.util.*;
import java.util.function.*;

class Jogador {
    String nome;
    int pontos;
    boolean ativo;

    public Jogador(String nome, int pontos, boolean ativo) {
        this.nome = nome;
        this.pontos = pontos;
        this.ativo = ativo;
    }
}

public class RankingSistema {

    public static void main(String[] args) {

        List<Jogador> jogadores = Arrays.asList(
                new Jogador("pedro", 100, true),
                new Jogador("ana", 150, true),
                new Jogador("carlos", 120, false)
        );

        Predicate<Jogador> ativo =
                j -> j.ativo;

        Function<Jogador, Jogador> normalizar =
                j -> {
                    j.nome = j.nome.toUpperCase();
                    return j;
                };

        BiFunction<Integer, Integer, Integer> bonus =
                (pontos, extra) -> pontos + extra;

        Supplier<Integer> gerarId =
                () -> new Random().nextInt(9999);

        Consumer<String> salvar =
                msg -> System.out.println("SALVO: " + msg);

        List<Jogador> ranking = new ArrayList<>();

        jogadores.stream()
                .filter(ativo)
                .map(normalizar)
                .forEach(j -> {

                    j.pontos = bonus.apply(j.pontos, 20);

                    int id = gerarId.get();

                    salvar.accept("Jogador " + j.nome + " ID " + id);

                    ranking.add(j);
                });

        ranking.sort((a, b) -> b.pontos - a.pontos);

        System.out.println("\n=== RANKING FINAL ===");

        int pos = 1;
        for (Jogador j : ranking) {
            System.out.println(pos++ + " - " + j.nome + ": " + j.pontos);
        }
    }
}
