import java.util.*;

public class InverterMap {
    public static void main(String[] args) {

        Map<String, Integer> original = new HashMap<>();
        original.put("A", 1);
        original.put("B", 2);

        Map<Integer, String> invertido = new HashMap<>();

        for (Map.Entry<String, Integer> entry : original.entrySet()) {
            invertido.put(entry.getValue(), entry.getKey());
        }

        System.out.println(invertido);
    }
}
