/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author 2830482411031
 */
public class Caminhao extends Veiculo{
    String carroceria;
    int tara;
    int eixos;
    
    public Caminhao(String marca, String modelo, String cor, int ano, float valor, String carroceria,  int tara, int eixos){
        super(marca, modelo, cor, ano, valor);
        this.carroceria = carroceria;
        this.tara = tara;
        this.eixos = eixos;
    }
    
    //metodo comum para exibir oa dados de Caminha
    @Override
    public void exibirDadosVeiculo() {
        super.exibirDadosVeiculo(); 
        System.out.println("carroceria" + carroceria);
        System.out.println("tara" + tara);
        System.out.println("eixos" + eixos);
    }

    public Caminhao(){
        this.carroceria = JOptionPane.showInputDialog("Carroceria: ");
        this.tara = Integer.parseInt(JOptionPane.showInputDialog("Tara: "));
        this.eixos = Integer.parseInt(JOptionPane.showInputDialog("eixos: "));
    }
    
    public void exibirDadosCaminhaoGUI(){
        String msg = "Marca: " + marca;
        msg = msg + "\nModelo: "+ modelo+
                "\nCor: "+ cor+
                "\nAno: "+ ano+
                "\nValor"+ valor+
                "\nCarroceria: " + carroceria+
                "\nTara: "+ tara+
                "\nEixos: "+ eixos;
        JOptionPane.showMessageDialog(null, msg, "Dados CarrCaminhaoo: ", -1);;
    }
}
