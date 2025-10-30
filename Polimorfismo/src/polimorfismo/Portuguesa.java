package polimorfismo;

/**
 * Implementação de todos os métodos de interface Pizza
 * @author Pedro Henrique
 * @since 30/10/2025
 */
public class Portuguesa implements Pizza {

    @Override
    public void montar() {
        System.out.println("Pizza Portuguesa");
        System.out.println("Presunto, Ovo cozido, Cebola, Pimentão, Azeitona, Mussarela, Molho de tomate, Orégano");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de preparo: 15 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Clássica e saborosa, por 39 reais!");
    }
}
