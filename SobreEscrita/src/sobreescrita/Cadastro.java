/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescrita;

/**
 *
 * @author 2830482411031
 */
public class Cadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Manoela", 32, 1.65f);
        Professor pr = new Professor("Fernando Diniz", 47, 1.70f, 1, "Financas", 2500f);
        Aluno a = new Aluno("Cleiton rasta", 31, 1.71f, 2118181, 8.9f, 8, false);
        
        p.exibirDados();
        System.out.println();
        pr.exibirDados();
        System.out.println();
        pr.exibirDados(true);
        System.out.println();
        pr.exibirDados(10);
        System.out.println();
        a.exibirDados();
        System.out.println();
        a.exibirDados(false);
        System.out.println();
        a.exibirDados(12);
        System.out.println();
    }
    
}
