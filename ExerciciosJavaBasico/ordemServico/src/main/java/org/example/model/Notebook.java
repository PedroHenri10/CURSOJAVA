package org.example.model;

public class Notebook extends Equipamento {

    boolean possuiSSD;

    public Notebook(String ma, String mo, double v, boolean ssd) {
        super(ma, mo, v);
        this.possuiSSD = ssd;
    }

    @Override
    public double calcularValorServico() {
        return possuiSSD ? valorBaseConserto + 100 : valorBaseConserto;
    }

    @Override
    public String toString() {
        return super.toString() + " | Notebook | SSD: " + possuiSSD;
    }
}