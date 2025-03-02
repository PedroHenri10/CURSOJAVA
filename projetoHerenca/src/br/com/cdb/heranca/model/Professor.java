package br.com.cdb.heranca.model;

public class Professor extends Funcionario{
	public int numeroDeAulas;
	
	public Professor(String nome) {
		super(nome);
	}
	
	//sobrecarga de metodos
	
	public void novoSalario(double novoSalario) {
		this.salario = novoSalario;
	}
	
	public void novoSalario(double novoSalario, int nAulasAdicional) {
		this.salario = novoSalario;
		this.numeroDeAulas += nAulasAdicional;
	}
	
	@Override
	public void apresentacao() {
		System.out.println("Olá, eu sou o professor "+nome);
	}
}
