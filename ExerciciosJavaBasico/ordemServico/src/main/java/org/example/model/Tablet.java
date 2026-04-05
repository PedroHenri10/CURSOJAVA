package org.example.model;

public class Tablet extends Equipamento {

    boolean possuiCaneta;

    public Tablet(String ma, String mo, double v, boolean c) {
        super(ma, mo, v);
        this.possuiCaneta = c;
    }

    @Override
    public double calcularValorServico() {
        return possuiCaneta ? valorBaseConserto + 50 : valorBaseConserto;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tablet | Caneta: " + possuiCaneta;
    }
}
