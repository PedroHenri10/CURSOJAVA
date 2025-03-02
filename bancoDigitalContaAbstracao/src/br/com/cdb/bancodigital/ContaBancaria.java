package br.com.cdb.bancodigital;
//x
public interface ContaBancaria {
	
	public double getSaldo();
	public void depositar(double valor);
	public boolean sacar(double valor);
	public void transferir(double valor, ContaBancaria destino);
	
}
