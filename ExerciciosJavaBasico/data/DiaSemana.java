import java.time.LocalDate;
import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a data (AAAA-MM-DD): ");
        LocalDate data = LocalDate.parse(sc.nextLine());

        System.out.println("Dia da semana: " + data.getDayOfWeek());

        sc.close();
    }
}
