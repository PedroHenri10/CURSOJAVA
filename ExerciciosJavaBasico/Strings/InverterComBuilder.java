public class InverterComBuilder {
    public static void main(String[] args) {

        String texto = "Java";
        StringBuilder sb = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            sb.append(texto.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
