package domain.exceptions;

public class FuncionarioIndisponivelException extends RuntimeException {
    public FuncionarioIndisponivelException(String message) {
        super(message);
    }
}
