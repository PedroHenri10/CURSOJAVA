/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author 2830482411031
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "João";
        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";
        
        System.out.println("O nome da pessoa 1: " +p1.nome);
        System.out.println("O nome da pessoa 2: " +p2.nome);
    }
    
}
