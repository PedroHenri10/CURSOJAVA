import java.util.ArrayList;

class ListaGenerica<T> {

    private ArrayList<T> lista = new ArrayList<>();

    public void adicionar(T valor) {
        lista.add(valor);
    }

    public boolean contem(T valor) {
        return lista.contains(valor);
    }

    public void listar() {
        for (T item : lista) {
            System.out.println(item);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        ListaGenerica<Integer> lista = new ListaGenerica<>();

        lista.adicionar(10);
        lista.adicionar(20);

        lista.listar();

        System.out.println("Tem 10? " + lista.contem(10));
    }
}
