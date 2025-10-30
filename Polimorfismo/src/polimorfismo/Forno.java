/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *Classe para criado objeto polimorfo forno que irá prepara todo e qualquer tipo de pizza
 * @author Pedro Henrique
 * @Since 30/10/2025
 */
public class Forno {

    /**
     * @param args the command line arguments
     */
    
    public void preparar(Pizza pizza){
        pizza.montar();
        pizza.assar();
        pizza.cobrar();
    }
    
    
    
}
