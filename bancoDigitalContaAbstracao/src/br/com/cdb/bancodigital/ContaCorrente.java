package br.com.cdb.bancodigital;

public class ContaCorrente implements ContaBancaria{
	
	private double saldo;
	
	private final long numero; // final, somente leitura, valor final, constante, colocar um final no eemplo anterior 
	//na apresentacao do funcionario, o override da classe faineiro e professor, nao ira sobrescrever, dará erro
	// isso serve para a e
	public ContaCorrente(long numero){
		this.numero = numero;
	}
	
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
