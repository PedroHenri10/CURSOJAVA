/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**classe criada para instanciar umm objeto pao caseiro 
 *
 * @author Pedro Henrique
 * @Since 30/10/2025
 */
public class PaoCaseiro implements Pizza{
    @Override
    public void montar() {
        System.out.println("Pão caseiro");
        System.out.println("farinha, oleo, acucar, Leite, fermento, sal");
    }

    @Override
    public void assar() {
         System.out.println("Tempo de preparo: 40 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Me de os 15 reais, salafrario!");
    }
    
}
