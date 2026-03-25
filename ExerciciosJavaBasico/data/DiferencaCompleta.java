import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DiferencaCompleta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Data 1 (AAAA-MM-DD): ");
        LocalDate d1 = LocalDate.parse(sc.nextLine());

        System.out.print("Data 2 (AAAA-MM-DD): ");
        LocalDate d2 = LocalDate.parse(sc.nextLine());

        Period p = Period.between(d1, d2);

        System.out.println("Diferença:");
        System.out.println(p.getYears() + " anos");
        System.out.println(p.getMonths() + " meses");
        System.out.println(p.getDays() + " dias");

        sc.close();
    }
}
