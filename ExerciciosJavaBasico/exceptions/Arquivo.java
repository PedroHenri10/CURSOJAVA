import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));

            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo!");
        }
    }
}
