/*//
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaulapoo;

import javax.swing.JOptionPane;

/**
 *
 * Classe criada para
 * @author Pedro Henrique
 * @since classe criada 04/09/2025
 *
 */
public class Pessoa {
    String nome;
    int idade;
    float altura;
    float peso;
    
    //metodo constructor de objeto em memoria
    
    // o atributo verde recebe o parametro
    public Pessoa(String nome, int idade, float altura, float peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    //metodo comum para exibir dados das pessoas
    public void exibirDadosPessoa(){
        System.out.println("Nome: " + nome + " | idade: "+ idade + " | altura: " +altura+ " | Peso: "+ peso);
        System.err.println("IMC: " + calcularIMC()+ " | " + classificarIMC());
    }
    
    //metodo comum para calcular o imc de uma Pessoa 
    public float calcularIMC(){
        return peso/(altura * altura);
    }
    
    //metodo comum para clasificar o imc
    public String classificarIMC(){
        float imc = calcularIMC();
        
        if(imc<16.0){
            return "Muito abaixo do peso";
        }else if(imc <18.0){
            return "Magro";
        }else if(imc < 25.0){
            return "Peso Normal";
        }else if(imc < 30.0){
            return "Acima do peso";
        }else if(imc < 35.0){
            return "Obesidade 1";
        }else if (imc < 40.0){
            return "Obesidade 2 - Severa";
    }else{
            return "Obersidade Morbida";
        }
    }
    
    //metodo constructor para entrada de dados por meio de interface grafica
    public Pessoa(){
        nome = JOptionPane.showInputDialog("Nome: ", nome);
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("idade: ", idade));
        this.altura = Float.parseFloat(JOptionPane.showInputDialog("altura: ", altura));
        this.peso = Float.parseFloat(JOptionPane.showInputDialog("peso: ", peso));
    }
    
    
    //metodo comum para exibir dados pessoas por meio GUI
    public void exibirDadosPessoaGUI(){
        String msg = "nome "+ this.nome;
        msg = msg + "\nidade "+this.idade;
        msg = msg + "\npeso "+this.peso;
        msg = msg + "\naltura "+this.altura;
        msg = msg + "\nIMC: "+ calcularIMC()+ " " + classificarIMC();
        JOptionPane.showMessageDialog(null, msg, "Dados Pessoais", -1);
    }

}
