package br.com.cdb.bancodigital;

public class ContaPoupanca implements ContaBancaria{
	private double saldo;
	
	private double rendimento;
	
	@Override
	public double getSaldo() {
		return saldo;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public boolean sacar(double valor) {
		valor += 1;
		if(saldo < valor)
			return false;
		else {
			saldo -=valor;
			return true;
		}
	}

	@Override
	public void transferir(double valor, ContaBancaria destino) {
		if(sacar (valor) == true) {
			destino.depositar(valor);
		}
	}
}
