/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaulapoo;

/**
 *Classe para analisar um objeto do tipo pessoa
 * @author Pedro Henrique
 */
public class Analise {
    
    public String AnalisarIdadePessoa(Pessoa p){
        
        if(p.idade < 2){
            return "Bebe";
        }else if (p.idade < 13){
            return "Criança";
        }else if(p.idade < 20){
            return "Adolescente";
        }else if(p.idade <= 60){
            return p.nome + " é um Adulto";
        }else if(p.idade <=85){
            return "Idoso";
        }else{
            return "Super idoso";
        }
        
    }
    
    public String analisarAlturaPessoa(Pessoa p){
        if(p.altura < 1.69){
            return "Baixo";
        }else if(p.altura < 1.90){
            return "altura normal";
        }else{
            return "Alto";
        }
    }
    
    public String analisarPessoaMaisVelha(Pessoa p1, Pessoa p2){
        if(p1.idade > p2.idade){
            return p1.nome + " é mais velho que " + p2.nome;
        }else{
            return p2.nome + " é mais velho que " + p1.nome;
        }
    }
}
