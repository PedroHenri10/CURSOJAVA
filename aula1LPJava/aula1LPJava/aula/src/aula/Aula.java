/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author 2830482411031
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello world");
        
        Carro c1 = new Carro();
        c1.anoFabricacao = 2020;
        c1.modelo = "Corsa";
        
        System.out.println(c1.modelo);
        
        c1.ligar();
        System.out.println(c1.getEstado());
        
        if(c1.getEstado()){
            System.out.println("Carro ligado!");
        }else{
            System.out.println("Carro desligado!");
        }
        
        c1.desligar();
        if(c1.getEstado()){
            System.out.println("Carro ligado!");
        }else{
            System.out.println("Carro desligado!");
        }
    }
    
    
}
