public class PalindromoBuffer {
    public static void main(String[] args) {

        String palavra = "arara";

        StringBuffer original = new StringBuffer(palavra);
        StringBuffer invertida = new StringBuffer(palavra);

        invertida.reverse();

        if (original.toString().equals(invertida.toString())) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}
