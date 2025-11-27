/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaagregracao;

/**
 *classe criada para ve objetos do tipo produto
 * @author Pedro Henrique
 * @since27/11/25
 */
public class Produto {
    int codigo;
    String nome; 
    float valor;
    
    public Produto(int codigo, String nome, float valor){
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }
    
    public void exibirProduto(){
        System.out.println("Codigo: " + codigo +
                "\nProduto: " + nome + "\nPreco" + valor);
    }
    
}
