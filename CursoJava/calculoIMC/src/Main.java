import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- SISTEMA DE CADASTRO BIOMÉTRICO ---");

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Peso atual (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Objetivo principal (perder peso, ganhar massa, manter saúde): ");
        String objetivo = scanner.nextLine();

        double imc = peso / (altura * altura);

        System.out.println("\n========================================");
        System.out.println("      RELATÓRIO DO ALUNO (FITNESS)      ");
        System.out.println("========================================");
        System.out.printf("ALUNO:    %s\n", nome.toUpperCase());
        System.out.printf("IMC:      %.2f\n", imc);
        System.out.printf("OBJETIVO: %s\n", objetivo);
        System.out.println("----------------------------------------");


        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Classificação: Obesidade grau |");
        }else if( imc >= 35 && imc < 40){
            System.out.println("Classificação: Obesidade grau ||");
        }else{
            System.out.println("Classificação: Obesidade grau |||");
        }

        System.out.println("========================================");

        scanner.close();
    }
}