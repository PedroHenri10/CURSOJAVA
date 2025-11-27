/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaagregracao;

/**
 *Classe criada para instanciar objetos do tipo produto e venda
    * @author Pedro h
    * @Since 27/11/2025
 */
public class Mercado {
    
    
    public static void main(String[] args) {
        //Produtos disponiveis para comprar (instancias produto)
        Produto p1, p2,p3,p4,p5;
        Venda v1, v2;
        
        p1 = new Produto(10, "Vassoura", 15.0f);
        p2 = new Produto(11, "Arroz", 10.0f);
        p3 = new Produto(12, "Kit kat",5.0f);
        p4 = new Produto(14, "detergente",6.0f);
        p5 = new Produto(18, "macarrao",8.0f);
        
        //instancias de venda
        
        v1 = new Venda(10, "Poatan");
        v2 = new Venda(12, "Carol");
        
        v1.adicionarProduto(p1);
        v1.adicionarProduto(p2);
        v1.adicionarProduto(p3);
        
        v2.adicionarProduto(p5);
        v2.adicionarProduto(p4);
        v2.adicionarProduto(p3);
        
        //listagem de produtos da venda 1
        System.out.println("-------------------------------------");
        System.out.println("Cliente :" + v1.cliente);
        v1.listarProdutos();
        v1.valorPagar();
        
        System.out.println("-------------------------------------");
        System.out.println("Cliente :" + v2.cliente);
        v2.listarProdutos();
        v2.valorPagar();
        
        System.out.println("-------------------------------------");
        System.out.println("Cliente :" + v1.cliente);
        v1.indicesProdutos();
    }
}
