public class RemoverNumeros {
    public static void main(String[] args) {

        String texto = "Joao123Silva456";
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (!Character.isDigit(c)) {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
