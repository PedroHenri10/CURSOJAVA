class Par<K, V> {

    private K chave;
    private V valor;

    public Par(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return chave + " -> " + valor;
    }
}

public class Main1 {
    public static void main(String[] args) {

        Par<String, Integer> p = new Par<>("Idade", 25);

        System.out.println(p);
    }
}
