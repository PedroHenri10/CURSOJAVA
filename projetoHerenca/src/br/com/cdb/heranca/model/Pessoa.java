package br.com.cdb.heranca.model;

public abstract class Pessoa {
	//propriedades
	public String nome;
	public long cpf;
	
	//metodos
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public abstract void apresentacao();
	@Override
		public String toString() {
			return this.nome +" - "+this.cpf;
		}
	
}
