package br.com.cdb.bancoDigitalTeste.entity;

public class Cliente {
	private String nome;
	private long cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public Cliente(String nome, long cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
}
