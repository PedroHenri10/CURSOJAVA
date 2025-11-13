/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concorrencia;

/**
 *recomendavel nao rodar esse codigo, foi utilizado para afins didaticos
 * @author Pedro
 */
public class Virus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x =0;
        while(x <10){
            Janela j1,j2,j3,j4;        

            Janela janela = new Janela();
            j1 = new Janela();
            j2 = new Janela();
            j3 = new Janela();
            j4 = new Janela();
            janela.start();
            j1.start();
            j2.start();
            j3.start();
            j4.start();
            x++;
        }
    }
    
}
