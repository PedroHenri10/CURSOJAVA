package br.com.cdb.bancodigital;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta contaCorrente = new Conta(4556565);
		contaCorrente.depositar(1000);
		
		Conta contaPoupanca = new Conta(2786565);
		contaPoupanca.depositar(500);
		
		System.out.println("Conta :"+contaCorrente.getNumero()+ " possui o saldo de R$" +contaCorrente.getSaldo());
		System.out.println("Conta :"+contaPoupanca.getNumero()+ " possui o saldo de R$" +contaPoupanca.getSaldo());
	}

}
