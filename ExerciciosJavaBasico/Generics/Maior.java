public class Maior {

    static class Util {

        public static <T extends Comparable<T>> T maior(T a, T b) {

            if (a.compareTo(b) > 0) {
                return a;
            } else {
                return b;
            }
        }
    }

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        System.out.println("Maior número: " + Util.maior(num1, num2));

        String s1 = "Ana";
        String s2 = "Carlos";
        System.out.println("Maior string: " + Util.maior(s1, s2));

        double d1 = 5.5;
        double d2 = 2.3;
        System.out.println("Maior double: " + Util.maior(d1, d2));
    }
}
