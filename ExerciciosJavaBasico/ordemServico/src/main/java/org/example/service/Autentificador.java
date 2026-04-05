package org.example.service;

import org.example.exceptions.LoginInvalidoException;
import org.example.exceptions.SenhaInvalidaException;

public class Autentificador {

    public void validarLogin(String login) throws LoginInvalidoException {
        if (!login.matches("^[a-zA-Z0-9@.\\-]{8,64}$")) {
            throw new LoginInvalidoException("Login inválido!");
        }
    }

    public void validarSenha(String senha) throws SenhaInvalidaException {
        if (!senha.matches("^[a-zA-Z0-9@$%&]{8,32}$")) {
            throw new SenhaInvalidaException("Senha inválida!");
        }
    }
}
