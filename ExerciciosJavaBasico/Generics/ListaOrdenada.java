import java.util.*;

class ListaOrdenada<T extends Comparable<T>> {

    private List<T> lista = new ArrayList<>();

    public void adicionar(T valor) {
        lista.add(valor);
        Collections.sort(lista);
    }

    public T maior() {
        if (lista.isEmpty()) return null;
        return lista.get(lista.size() - 1);
    }

    public List<T> getLista() {
        return lista;
    }
}

public class Main3 {
    public static void main(String[] args) {

        ListaOrdenada<Integer> lista = new ListaOrdenada<>();

        lista.adicionar(30);
        lista.adicionar(10);
        lista.adicionar(20);

        System.out.println("Lista: " + lista.getLista());
        System.out.println("Maior: " + lista.maior());
    }
}
