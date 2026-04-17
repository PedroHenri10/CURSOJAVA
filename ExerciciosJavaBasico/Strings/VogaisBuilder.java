public class VogaisBuilder {
    public static void main(String[] args) {

        String texto = "Programacao";
        StringBuilder vogais = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if ("aeiouAEIOU".indexOf(c) != -1) {
                vogais.append(c);
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Quantidade: " + vogais.length());
    }
}
