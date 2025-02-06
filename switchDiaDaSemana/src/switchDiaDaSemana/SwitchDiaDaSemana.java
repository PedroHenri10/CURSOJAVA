package switchDiaDaSemana;
import java.util.Scanner;

public class SwitchDiaDaSemana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 (1=Domingo, 2=Segunda... 7=Sábado):");
        int dia = input.nextInt();

        String diaSemana;

        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Dia da semana inválido";
        }

        System.out.println("O dia da semana é: " + diaSemana);
        input.close(); // Feche o Scanner após o uso
    }
}