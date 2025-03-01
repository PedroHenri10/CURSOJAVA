package br.com.cdb.heranca.model;

public class Pessoa {
	//propriedades
	public String nome;
	public long cpf;
	
	//metodos
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public void apresentacao() {
		System.out.println("Olá, meu nome é "+nome);
	}
	
}
