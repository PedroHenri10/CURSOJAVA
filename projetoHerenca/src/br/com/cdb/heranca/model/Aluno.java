package br.com.cdb.heranca.model;

public class Aluno extends Pessoa{
	public int matricula;
	
	public Aluno( String nome, int matricula) {
		super(nome);
		this.matricula = matricula;
	}
}
