/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaula1;

/**
 *
 * @author 2830482411031
 */
public class ExAula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Livro l1 = new Livro();
        l1.titulo = "Debochando legal";
        l1.autor = "Cleiton Rasta";
        l1.anoPublicacao = 1999;
        
        Livro l2 = new Livro();
        l2.titulo = "Pequeno principe";
        l2.autor = "Maquiavel Lispector";
        l2.anoPublicacao = 1800;
        
        System.out.println("O nome do livro 1: " +l1.titulo + " |Autor: "+l1.autor +" |publicacao: "+ l1.anoPublicacao);
        System.out.println("O nome do livro 2: " +l2.titulo + " !Autor: "+ l2.autor +" !publicacao: "+ l2.anoPublicacao);
        
    }
    
}
