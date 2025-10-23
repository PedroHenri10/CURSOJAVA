/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2830482411031
 */
public class Residencia {
    public static void main(String[] args) throws InterruptedException {
        /*
        TV tv = new TV("LG", 65, false);
        tv.ligar();
        tv.desligar(5);
        */
        System.out.println("");
        Microondas micro = new Microondas("Brastemp", 10, 30, false);
        micro.timer(5);
        micro.mais30seg();
        micro.desligar();
        //micro.pipoca();
    }
}//fim da classe