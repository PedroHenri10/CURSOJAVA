/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaheranca;

/**
 *
 * @author Pedro henrique
 * @since 11/09/2025
 */
public class Concessionaria {
    
    public static void main(String[] args) {
        //variavel de referencia 
       Carro carro = new Carro("Mercedes", "CLA250", "Rosa", 2022, (float)800000, false, 250);
       carro.exibirDadosCarroGUI();
       carro.exibirDadosVeiculo();
       Carro c1;
       c1 = new Carro();
       c1.exibirDadosCarroGUI();
       Caminhao ca2;
       ca2 = new Caminhao();
       ca2.exibirDadosCaminhaoGUI();
    }
    
    
}
