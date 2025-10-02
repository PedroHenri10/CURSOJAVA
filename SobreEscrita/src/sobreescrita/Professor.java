/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescrita;

/**
 *
 * @author 2830482411031
 */
public class Professor extends Pessoa{
    
    private int codigo;
    private String disciplina;
    private Float salario;
    
    
    public Professor(String nome, int idade, Float altura, int codigo, String disciplina, Float salario){
        super(nome, idade, altura);
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.salario = salario;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("O professor "+ nome+ " ministra a disciplina "+disciplina+ " e ganha R$ "+salario);
    }
    
    public void exibirDados(boolean resp){
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Codigo: " + codigo);
        System.out.println("salario: " + salario);
    }
    
    public void exibirDados(int x){
        System.out.println("Disciplina: " + disciplina);
        System.out.println("salario: " + salario);
    }
}
