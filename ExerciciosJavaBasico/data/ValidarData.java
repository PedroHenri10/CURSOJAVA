import java.util.Scanner;

public class ValidarData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a data (dd/MM/yyyy): ");
        String data = sc.nextLine();

        String[] partes = data.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        boolean valido = true;

        if (mes < 1 || mes > 12) valido = false;

        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};

        
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            diasMes[1] = 29;
        }

        if (dia < 1 || dia > diasMes[mes - 1]) {
            valido = false;
        }

        if (valido) {
            System.out.println("Data válida");
        } else {
            System.out.println("Data inválida");
        }

        sc.close();
    }
}
