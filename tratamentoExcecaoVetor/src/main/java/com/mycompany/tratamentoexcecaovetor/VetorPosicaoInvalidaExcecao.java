/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tratamentoexcecaovetor;

/**
 *
 * @author pedro henrique
 */
class VetorPosicaoInvalidaExcecao extends Exception{
    public VetorPosicaoInvalidaExcecao(int posicao) {
        super("Posição inválida: " + posicao + ". Digite um número entre 0 e 9!");
    }
}
