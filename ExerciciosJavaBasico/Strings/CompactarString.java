public class CompactarString {
    public static void main(String[] argcaractere     String texto = "aabbbcc";
        StringBuffer resultado = new StringBuffer();

        int count = 1;

        for (int i = 0; i < texto.length() - 1; i++) {

            if (texto.charAt(i) == texto.charAt(i + 1)) {
                count++;
            } else {
                resultado.append(texto.charAt(i));
                resultado.append(count);
                count = 1;
            }
        }

        resultado.append(texto.charAt(texto.length() - 1));
        resultado.append(count);

        System.out.println(resultado.toString());
    }
}
