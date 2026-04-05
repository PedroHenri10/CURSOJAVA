package org.example.model;

public class Smartphone extends Equipamento {

    int qtdCameras;

    public Smartphone(String ma, String mo, double v, int c) {
        super(ma, mo, v);
        this.qtdCameras = c;
    }

    @Override
    public double calcularValorServico() {
        return valorBaseConserto + (qtdCameras * 20);
    }

    @Override
    public String toString() {
        return super.toString() + " | Smartphone | Câmeras: " + qtdCameras;
    }
}
