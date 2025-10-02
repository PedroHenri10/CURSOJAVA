/*
 * To change this license hea[der, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescrita;

/**
 *
 * @author 2830482411031
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private Float altura;

    public Pessoa() {
    }
    
    public Pessoa(String nome, int idade, Float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
    
    
    
    public void exibirDados(){
        System.out.println("Nome da pessoa: "+ nome);
        System.out.println("idade da pessoa: "+ idade);
        System.out.println("altura da pessoa: "+ altura);
    }
    
}
