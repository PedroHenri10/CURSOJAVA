/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaulapoo;

/**
 * Classe criada para instanciar os objetos da classe pessoa
 * @author Pedro Henrique
 */
public class Objetos {

    public static void main(String[] args) {
        Pessoa p3, p1;
        p1 = new Pessoa();
        p3 = new Pessoa();
         //Pessoa p1 = new Pessoa("Pedro", 23, 1.74f, 69.0f);
         Analise analise = new Analise();
        p1.exibirDadosPessoa();
        p3.exibirDadosPessoa();
        p1.exibirDadosPessoaGUI();
         //Pessoa p7 = new Pessoa("Amanda", 31, 1.67f, 62.0f);
         /*Pessoa p2 = new Pessoa("leo", 37, 1.70f);
         p3 = new Pessoa("Neymar", 32, 1.76f);
         Pessoa pessoa = new Pessoa("Cristiano", 40, 1.82f);
         p1.exibirDadosPessoa();
         p1 = pessoa;
         
         p1.exibirDadosPessoa();
         p2.exibirDadosPessoa();
         p3.exibirDadosPessoa();
         pessoa.exibirDadosPessoa();
         */
         //System.out.println(analise.AnalisarIdadePessoa(p1));
         //System.out.println(analise.analisarAlturaPessoa(p1));
         System.out.println(analise.analisarPessoaMaisVelha(p1, p3));
     }
}
