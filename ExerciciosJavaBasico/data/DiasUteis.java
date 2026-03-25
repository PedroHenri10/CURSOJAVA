import java.time.LocalDate;
import java.util.Scanner;

public class DiasUteis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Data inicial (AAAA-MM-DD): ");
        LocalDate inicio = LocalDate.parse(sc.nextLine());

        System.out.print("Data final (AAAA-MM-DD): ");
        LocalDate fim = LocalDate.parse(sc.nextLine());

        int diasUteis = 0;

        while (!inicio.isAfter(fim)) {

            if (inicio.getDayOfWeek().getValue() < 6) { // 1=Seg ... 5=Sex
                diasUteis++;
            }

            inicio = inicio.plusDays(1);
        }

        System.out.println("Dias úteis: " + diasUteis);

        sc.close();
    }
}
