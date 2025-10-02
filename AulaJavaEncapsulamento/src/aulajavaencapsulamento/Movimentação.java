/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulajavaencapsulamento;

/**
 *classe para criar instancias de conta corrente e testar encapsulamento
 * @author 2830482411031
 */
public class Movimentação {
    
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Pedro", 12505, 1234, 1000);
        cc.exibirDadosContaCliente();
        System.out.println();
        cc.Depositar();
        cc.realizarSaque();
        cc.exibirDadosSaldo();
        cc.TrocarSenha();
        //cc.exibirDadosContaCliente();        
        //nao pode dar acesso ao atributo, fora da classe
    }
}
