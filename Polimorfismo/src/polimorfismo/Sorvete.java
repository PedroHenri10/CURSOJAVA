package polimorfismo;

/**
 * Implementação de todos os métodos de interface Pizza
 * @author Pedro Henrique
 * @since 30/10/2025
 */
public class Sorvete implements Pizza {

    @Override
    public void montar() {
        System.out.println("Pizza de Sorvete");
        System.out.println("Massa doce, Sorvete de creme, Calda de chocolate, Granulado colorido");
    }

    @Override
    public void assar() {
        System.out.println("Essa pizza não vai ao forno! Só geladeira por 5 minutos para firmar a base.");
    }

    @Override
    public void cobrar() {
        System.out.println("Docinha e gelada, por apenas 32 reais!");
    }
}
