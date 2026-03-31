import java.util.*;

class Soma {

    public static double somar(List<? extends Number> lista) {
        double soma = 0;

        for (Number n : lista) {
            soma += n.doubleValue();
        }

        return soma;
    }

    public static void adicionarValores(List<? super Integer> lista) {
        lista.add(10);
        lista.add(20);
        lista.add(30);
    }
}

public class Main{
    public static void main(String[] args) {

        List<Integer> listaInt = Arrays.asList(10, 20, 30);
        System.out.println("Soma: " + Calculadora.somar(listaInt));

        List<Number> lista = new ArrayList<>();
        Calculadora.adicionarValores(lista);

        System.out.println("Lista: " + lista);
    }
}
