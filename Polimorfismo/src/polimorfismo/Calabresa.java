/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
  *implementacao de todos os metodos de interface pizza
 * @author Pedro Henrique
 * @Since 30/10/2025
 */
public class Calabresa implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza de Calabresa");
        System.out.println("Calabresa, Cebola, Molho de tomate, Orégano, Azeitona preta");
    }

    @Override
    public void assar() {
         System.out.println("Tempo de preparo: 15 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Me de os 35 reais, salafrario!");
    }
    
}
