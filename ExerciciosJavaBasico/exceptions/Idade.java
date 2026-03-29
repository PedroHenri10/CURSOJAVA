class IdadeInvalidaException extends Exception {

    public IdadeInvalidaException(String msg) {
        super(msg);
    }
}

public class Idade {

    public static void verificarIdade(int idade) throws IdadeInvalidaException {

        if (idade < 0) {
            throw new IdadeInvalidaException("Idade não pode ser negativa");
        }

        System.out.println("Idade válida");
    }

    public static void main(String[] args) {

        try {
            verificarIdade(-5);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
