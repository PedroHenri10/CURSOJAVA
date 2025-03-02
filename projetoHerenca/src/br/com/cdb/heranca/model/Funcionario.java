package br.com.cdb.heranca.model;

public class Funcionario extends Pessoa{
	
	public double salario;
	
	public Funcionario(String nome) {
		super(nome);
	}
	
	@Override
	public void apresentacao() {
		System.out.println("Olá, eu sou o funcionario "+nome);
	}
}
