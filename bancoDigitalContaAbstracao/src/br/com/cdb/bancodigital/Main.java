package br.com.cdb.bancodigital;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria cc = new ContaCorrente(1553553);
		cc.depositar(1000.0);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.depositar(500.0);
		
		cc.depositar(500.0);
		cp.sacar(200.0);
		cc.transferir(300.0, cp);
		
		System.out.println("Saldo da conta corrente: "+cc.getSaldo());
		System.out.println("Saldo da conta poupanca: "+cp.getSaldo());
	}

}
