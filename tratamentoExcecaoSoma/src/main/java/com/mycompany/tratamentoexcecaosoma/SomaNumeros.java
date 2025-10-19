/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tratamentoexcecaosoma;

/**
 *
 * @author pedro henrique
 */

import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int contador = 0;

        try {
            while (true) {
                System.out.print("Digite um número: ");
                int n = Integer.parseInt(sc.nextLine());

                soma = somar(soma, n); 
                contador++;

                System.out.println("Soma parcial: " + soma);
            }

        } catch (ExcecaoAcimaDeCem e) {
            System.out.println("⚠️ " + e.getMessage());
            contador--; 
            double media = soma / (double) contador;
            System.out.println("Foram somados " + contador + " números.");
            System.out.println("Média dos números: " + media);
        } catch (NumberFormatException e) {
            System.out.println("Erro: digite apenas números inteiros!");
        } finally {
            sc.close();
            System.out.println("Programa encerrado.");
        }
    }

    public static int somar(int somaAtual, int novoValor) throws ExcecaoAcimaDeCem {
        int novaSoma = somaAtual + novoValor;

        if (novaSoma > 100) {
            throw new ExcecaoAcimaDeCem(novaSoma);
        }

        return novaSoma;
    }
}
