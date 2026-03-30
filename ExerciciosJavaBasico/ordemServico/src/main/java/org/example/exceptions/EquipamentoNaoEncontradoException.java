package org.example.exceptions;

public class EquipamentoNaoEncontradoException extends RuntimeException {
    public EquipamentoNaoEncontradoException(String message) {
        super(message);
    }
}
