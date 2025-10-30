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
public class CincoQueijos implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza de 5 Queijos");
        System.out.println("Mussarela, Provolone, Provolone, Gorgonzola, Molho de tomate, Orégano, Azeitona");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de preparo: 9 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Me de os 70 reais, salafrario!");
    }
    
}
