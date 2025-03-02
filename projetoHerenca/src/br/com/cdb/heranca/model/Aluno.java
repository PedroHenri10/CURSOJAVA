package br.com.cdb.heranca.model;

public class Aluno extends Pessoa{
	public int matricula;
	
	public Aluno( String nome, int matricula) {
		super(nome);
		this.matricula = matricula;
	}
	
	@Override
	public void apresentacao() {
		System.out.println("Olá, eu sou o aluno "+nome+ " e minha matricula é "+matricula);
	}
	
}
