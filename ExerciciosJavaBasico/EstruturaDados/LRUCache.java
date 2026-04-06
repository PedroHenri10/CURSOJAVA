import java.util.*;

class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacidade;

    public LRUCache(int capacidade) {
        super(capacidade, 0.75f, true);
        this.capacidade = capacidade;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacidade;
    }
}

public class Main {
    public static void main(String[] args) {

        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        cache.get(1); // 1 vira recente

        cache.put(4, "D"); 

        System.out.println(cache);
    }
}
