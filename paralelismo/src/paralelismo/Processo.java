/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelismo;

/**
 *
 * @author 2830482411031
 */
public class Processo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Threads t1 = new Threads("Pedro");
        Threads t2 = new Threads("Batman");
        Threads t3 = new Threads("Messi");
        Threads t4 = new Threads("Carol");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }//fim do main
    
}
