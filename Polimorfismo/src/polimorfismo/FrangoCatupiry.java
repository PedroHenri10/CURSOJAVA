/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *classe criada para gerar objeto do tipo pizza
 * @author Pedro Henrique
 * @Since 30/10/2025
 */
public class FrangoCatupiry implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza de frango com catupiry");
        System.out.println("Molho de tomate, frango, catupiry");
    }

    @Override
    public void assar() {
        System.out.println("Tempo para Assar: 12 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Me de os 50 reais, salafrario!");
    }
    
}
