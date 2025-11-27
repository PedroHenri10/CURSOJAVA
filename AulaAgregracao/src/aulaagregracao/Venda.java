/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaagregracao;

import java.util.ArrayList;

/**
 *Classe para criar objeto do tipo venda
 * @author Pedro H
 * @Since 27/11/2025
 */
public class Venda {
    int codigo;
    String cliente;
    ArrayList <Produto> itens = new ArrayList();
    
    public Venda(int codigo, String cliente){
        this.codigo = codigo;
        this.cliente = cliente;
    }
    
    //metodo que relaciona produto comprado com a venda
    public void adicionarProduto(Produto p){
        itens.add(p);
        System.out.println("Item adicionado á venda!");
    }
    
    //exibir o conteudos dos produtos comprados pelo cliente
    public void listarProdutos(){
        for (Produto item : itens){
            System.out.println("Produto: "+item.nome);
            System.out.println("Valor: "+item.valor);
        }
    }
    
    public void indicesProdutos(){
        for(Produto x: itens){
            System.out.println("Produtos: " + itens);
        }
    }
    
    float valorCompra = 0;
            
    //total da compra
    public void valorPagar(){
        for(Produto x: itens){
            valorCompra += x.valor;
        }
        
        System.out.println("Valor da compra: " + valorCompra);
    }
    
}
