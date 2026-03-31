class Caixa<T> {

    private T valor;

    public void guardar(T valor) {
        this.valor = valor;
    }

    public T pegar() {
        return valor;
    }
}

public class Main {
    public static void main(String[] args) {

        Caixa<String> c1 = new Caixa<>();
        c1.guardar("Java");

        Caixa<Integer> c2 = new Caixa<>();
        c2.guardar(10);

        System.out.println(c1.pegar());
        System.out.println(c2.pegar());
    }
}
