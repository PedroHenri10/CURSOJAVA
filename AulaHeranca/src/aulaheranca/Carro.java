/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaheranca;

import javax.swing.JOptionPane;

/**
 *Classe criada para herdar TODOS os atributos e metodos da superclasse veiculo.
 * @author Pedro Henrique
 * @Since 11/09/2025
 */
public class Carro extends Veiculo{
    boolean conversivel;
    int volPortaMalas;

    public Carro(String marca, String modelo, String cor, int ano, float valor, boolean conversivel, int volPortaMalas) {
        super(marca, modelo, cor, ano, valor);
        this.conversivel = conversivel;
        this.volPortaMalas = volPortaMalas;
    }// constructor para objeto do tipo carro em memoria
    
    public Carro(){
        this.volPortaMalas = Integer.parseInt(JOptionPane.showInputDialog("Volume Porta Malas "));
        int resposta = JOptionPane.showConfirmDialog(null, "O carro é conversível?", "Conversível", JOptionPane.YES_NO_OPTION);
        this.conversivel = (resposta == JOptionPane.YES_OPTION);
    }
    
    //metodo comum para exibir oa dados de Carro
    @Override
    public void exibirDadosVeiculo() {
        super.exibirDadosVeiculo(); 
        System.out.println("volume porta malas" + volPortaMalas);
        System.out.println("É conversivel: " + (conversivel?"SIM":"Nao"));
    }
     
    
    public void exibirDadosCarroGUI(){
        String msg = "Marca: " + marca;
        msg = msg + "\nModelo: "+ modelo+
                "\nCor: "+ cor+
                "\nAno: "+ ano+
                "\nValor"+ valor+
                "\nConversivel: " + (conversivel?"SIM":"Nao")+
                "\nVolume porta malas: "+ volPortaMalas;
        JOptionPane.showMessageDialog(null, msg, "Dados Carro: ", -1);;
    }
}
