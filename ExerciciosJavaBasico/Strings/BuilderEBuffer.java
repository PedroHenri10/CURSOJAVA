public class ExAvancado1 {
    public static void main(String[] args) {

        String frase = "  Java   e muito   poderoso ";

        StringBuilder normalizada = new StringBuilder();

        boolean ultimoFoiEspaco = false;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == ' ') {
                if (!ultimoFoiEspaco) {
                    normalizada.append(c);
                    ultimoFoiEspaco = true;
                }
            } else {
                normalizada.append(Character.toUpperCase(c));
                ultimoFoiEspaco = false;
            }
        }
      
        String resultado = normalizada.toString().trim();

        StringBuffer buffer = new StringBuffer(resultado);
        buffer.reverse();

        for (int i = 0; i < buffer.length(); i++) {
            char c = buffer.charAt(i);

            if ("AEIOU".indexOf(c) != -1) {
                buffer.setCharAt(i, '*');
            }
        }

        System.out.println(buffer.toString());
    }
                                }
