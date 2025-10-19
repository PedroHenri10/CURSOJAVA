/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tratamentoexcecaovetor;

/**
 *
 * @author pedro henrique
 */
import javax.swing.JOptionPane;

public class VetorExcecao {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        try {
            while (true) {
                String posStr = JOptionPane.showInputDialog("Informe a posição (0 a 9) ou -1 para sair:");
                int pos = Integer.parseInt(posStr);

                if (pos == -1) break;

                String valorStr = JOptionPane.showInputDialog("Informe o valor a ser inserido:");
                int valor = Integer.parseInt(valorStr);

                inserirValor(vetor, pos, valor); 
                JOptionPane.showMessageDialog(null, "Valor inserido com sucesso!");

            }

        } catch (VetorPosicaoInvalidaExcecao e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: digite apenas números inteiros!", "Erro", JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

        } finally {
            StringBuilder conteudo = new StringBuilder("Conteúdo final do vetor:\n");
            for (int i = 0; i < vetor.length; i++) {
                conteudo.append("Posição ").append(i).append(": ").append(vetor[i]).append("\n");
            }
            JOptionPane.showMessageDialog(null, conteudo.toString(), "Relatório do Vetor", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void inserirValor(int[] vetor, int pos, int valor) throws VetorPosicaoInvalidaExcecao {
        if (pos < 0 || pos >= vetor.length) {
            throw new VetorPosicaoInvalidaExcecao(pos);
        }
        vetor[pos] = valor;
    }
}

