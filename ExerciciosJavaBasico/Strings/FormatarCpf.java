public class FormatarCpf {
    public static void main(String[] args) {

        String cpf = "12345678901";
        StringBuilder sb = new StringBuilder(cpf);

        sb.insert(3, ".");
        sb.insert(7, ".");
        sb.insert(11, "-");

        System.out.println(sb);
    }
}
