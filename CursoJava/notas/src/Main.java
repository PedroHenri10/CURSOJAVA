import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota (A-F): ");
        char nota = sc.next().toUpperCase().charAt(0);

        switch(nota){
            case 'A':
                System.out.println("Excelente!");
                break;
            case 'B':
                System.out.println("Bom!");
                break;
            case 'C':
                System.out.println("Mediano!");
                break;
            case 'D':
                System.out.println("Quase lá");
                break;
            case 'E':
                System.out.println("Precisa melhorar!");
                break;
            case 'F':
                System.out.println("Reprovadp!");
                break;
            default:
                System.out.println("Nota inválida!");
        }

        sc.close();
    }
}