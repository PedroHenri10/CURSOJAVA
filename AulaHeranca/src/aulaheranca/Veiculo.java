/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaheranca;

import javax.swing.JOptionPane;

/**
 *
 * classe criada para demonstrar 
 * @author pedro henrique
 * @since classe criada en 11/09
 */
public class Veiculo {
    String marca;
    String modelo;
    String cor;
    int ano;
    float valor;
    
    //metodo constructor responsavel por criado objeto em memoria
    public Veiculo(String marca, String modelo, String cor, int ano, float valor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    } // constructor gerar onjeto na memoria
    
    
    //metodo comum para exibir dados veiculos
    public void exibirDadosVeiculo(){
        System.out.println("Marca" + marca);
        System.out.println("modelo" + modelo);
        System.out.println("cor" + cor);
        System.out.println("ano" + ano);
        System.out.println("Valor em reais" + valor);
    }
    
    public Veiculo(){
        this.marca = JOptionPane.showInputDialog("Marca ");
        this.modelo = JOptionPane.showInputDialog("modelo ");
        this.cor = JOptionPane.showInputDialog("cor ");
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano fabricação: "));
        this.valor = Float.parseFloat(JOptionPane.showInputDialog("Valor: "));
    }
    
    public void exibirDadosVeiculoGUI(){
        String msg = "Marca: " + marca;
        msg = msg + "\nModelo: "+ modelo+
                "\nCor: "+ cor+
                "\nAno: "+ ano+
                "\nValor"+ valor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public float getValor() {
        return valor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
    
}//fim da classe


