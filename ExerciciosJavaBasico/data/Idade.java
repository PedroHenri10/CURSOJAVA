import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (AAAA-MM-DD): ");
        String data = sc.nextLine();

        LocalDate nascimento = LocalDate.parse(data);
        LocalDate hoje = LocalDate.now();

        Period idade = Period.between(nascimento, hoje);

        System.out.println("Idade: " + idade.getYears() + " anos");

        sc.close();
    }
}
