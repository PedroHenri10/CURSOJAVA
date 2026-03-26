package domain.exceptions;

public class AnimalNaoEncontradoException extends RuntimeException {
    public AnimalNaoEncontradoException(String message) {
        super(message);
    }
}
