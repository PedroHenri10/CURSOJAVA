/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tratamentoexcecaosoma;

/**
 *
 * @author pedro henrique
 */
public class ExcecaoAcimaDeCem extends Exception {

    public ExcecaoAcimaDeCem(int soma) {
        super("Erro: a soma ultrapassou 100! Soma atual: " + soma);
    }
    
}
