import java.util.*;

public class FiltrarParesList {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> pares = new ArrayList<>();

        for (int n : nums) {
            if (n % 2 == 0) pares.add(n);
        }

        System.out.println(pares);
    }
}
