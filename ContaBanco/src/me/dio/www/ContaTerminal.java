package me.dio.www;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal { public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
 
System.out.println("Por favor, digite o número da Agência:");
    String agencia = scanner.nextLine();
 
    System.out.println("Por favor, digite o número da Conta:");
    int numero = scanner.nextInt();
    scanner.nextLine();
 
    System.out.println("Por favor, digite seu nome:");
    String nomeCliente = scanner.nextLine();
 
    System.out.println("Por favor, digite seu saldo:");
    double saldo = scanner.nextDouble();
 
    System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
            "sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
 
    scanner.close();
}
 
}