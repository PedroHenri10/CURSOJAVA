/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/** implementacao de todos os metodos de interface pizza
 *
 * @author 2830482411031
 * @Since 30/10/2025
 */
public class RomeuJulieta implements Pizza{
    
     @Override
    public void montar() {
        System.out.println("Pizza sabor Romeu e Julieta");
        System.out.println("Queijo, Goiabada, Orégano, Leite Condesado, leite ninho");
    }

    @Override
    public void assar() {
         System.out.println("Tempo de preparo: 5 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Me de os 45 reais, salafrario!");
    }
    
    public void adicionarIngredientes(){
        
    }
}
