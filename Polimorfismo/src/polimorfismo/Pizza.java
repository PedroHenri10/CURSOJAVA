/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *interface para servir de padrao para tudo e qualquer tipo de pizza,´possui as funcionalidades, montar assar e cobrar
 * @author Pedro Henrique
 * @Since 30/10/2025
 */
public interface Pizza {
    // metodo para montar pizzar 
    public void montar();
    
    //metodo para o tempo de assar pizza
    public void assar();
    
    //metodo para cobrar de acordo com o valor
    public void cobrar();
}
