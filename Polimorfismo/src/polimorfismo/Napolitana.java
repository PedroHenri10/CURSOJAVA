package polimorfismo;

/**
 * Implementação de todos os métodos de interface Pizza
 * @author Pedro Henrique
 * @since 30/10/2025
 */
public class Napolitana implements Pizza {

    @Override
    public void montar() {
        System.out.println("Pizza Napolitana");
        System.out.println("Mussarela, Tomate fatiado, Alho picado, Manjericão fresco, Molho de tomate, Azeite de oliva");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de preparo: 12 min");
    }

    @Override
    public void cobrar() {
        System.out.println("Uma clássica italiana por 37 reais!");
    }
}
