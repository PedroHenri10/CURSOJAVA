package saldoTransacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Digite o valor da primeira transação: ");
        double transacao1 = scanner.nextDouble();

        System.out.print("Digite o valor da segunda transação: ");
        double transacao2 = scanner.nextDouble();

        System.out.print("Digite o valor da terceira transação: ");
        double transacao3 = scanner.nextDouble();

        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;

        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
	}

}
