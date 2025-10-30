package polimorfismo;

/**
 * Implementação de todos os métodos de interface Pizza
 * @author Pedro Henrique
 * @since 30/10/2025
 */
public class Marguerita implements Pizza {

    @Override
    public void montar() {
        System.out.println("Pizza Marguerita");
        System.out.println("Mussarela, Tomate, Manjericão, Molho de tomate, Azeite");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de preparo: 10 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Essa sai por 38 reais, direto do forno!");
    }
}
