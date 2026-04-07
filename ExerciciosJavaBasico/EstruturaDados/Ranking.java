import java.util.*;

class Ranking {

    private Map<String, Integer> pontuacao = new HashMap<>();

    public void adicionarJogador(String nome, int pontos) {
        pontuacao.put(nome, pontos);
    }

    public void atualizarPontuacao(String nome, int pontos) {
        pontuacao.put(nome, pontuacao.getOrDefault(nome, 0) + pontos);
    }

    public void mostrarRanking() {

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(pontuacao.entrySet());

        lista.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("=== RANKING ===");
        int pos = 1;

        for (Map.Entry<String, Integer> e : lista) {
            System.out.println(pos++ + " - " + e.getKey() + " : " + e.getValue());
        }
    }

    public void topN(int n) {

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(pontuacao.entrySet());

        lista.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("=== TOP " + n + " ===");

        for (int i = 0; i < Math.min(n, lista.size()); i++) {
            System.out.println(lista.get(i).getKey() + " : " + lista.get(i).getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Ranking ranking = new Ranking();

        ranking.adicionarJogador("Pedro", 100);
        ranking.adicionarJogador("Ana", 150);
        ranking.adicionarJogador("Carlos", 120);

        ranking.atualizarPontuacao("Pedro", 50);

        ranking.mostrarRanking();

        ranking.topN(2);
    }
                               }
