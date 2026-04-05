package org.example.model;

public abstract class Equipamento {

    private static int contador = 1;

    private int id;
    protected String marca, modelo;
    protected double valorBaseConserto;

    public Equipamento(String marca, String modelo, double valorBase) {
        this.id = contador++;
        this.marca = marca;
        this.modelo = modelo;
        this.valorBaseConserto = valorBase;
    }

    public abstract double calcularValorServico();

    @Override
    public String toString() {
        return "[" + id + "] " + marca + " " + modelo;
    }

    public static int getContador() {
        return contador;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorBaseConserto() {
        return valorBaseConserto;
    }
}