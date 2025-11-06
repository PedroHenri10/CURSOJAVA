/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelismo;

/**classes criada para gerar thread que executam uma determinada tarefa
 *
 * @author Pedro Henrique
 * @Since 06/11
 */
public class Threads extends Thread{
    int sleepTime;
    
    public Threads(String name){
        super(name);
        sleepTime = (int) (Math.random() * 50000);
        System.out.println("Thread  "+ getName() + " vai dormir por" + sleepTime);
    }
    
    public void run(){
        try {
            Thread.sleep(sleepTime);
        }catch (InterruptedException ex){
            System.out.println("A thread " + getName() + " foi interrompida!!");
        }
        System.out.println("A thread " + getName() + " =======> Acordou");
}
}//fim da classe
