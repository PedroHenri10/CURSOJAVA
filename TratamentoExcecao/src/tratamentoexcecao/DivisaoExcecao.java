package tratamentoexcecao;

/*
*To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
 
/**

* Classe para tratar as excecoes paa a classe Divisao

* @author 2830482411046

*/

public class DivisaoExcecao extends Exception{

    public DivisaoExcecao(){

        super("O A não pode ser menor que o B");

    }
 
public DivisaoExcecao(int b) {

        super("O valor digitado para o B: " + b + "Não pode ser superior a 500");

    }

public DivisaoExcecao(String s){

     super("O valor digitado para A não pode ser negativo!!");

    }

} // Fim da classe

 