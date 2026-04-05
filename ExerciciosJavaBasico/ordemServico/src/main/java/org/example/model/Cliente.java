package org.example.model;

public class Cliente {

    private static int contador = 1;

    int id;
    String nome;
    String login;

    public Cliente(String nome, String login) {
        this.id = contador++;
        this.nome = nome;
        this.login = login;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " (" + login + ")";
    }
}
