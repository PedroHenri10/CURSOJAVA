package tratamentoDeErros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double resultado =0;
		try {
			resultado = divisao(10,0);
		}catch(DivisaoZeroException e) {
			resultado = 10/e.getValorPadrao();
		}finally {
			System.out.println(resultado);
		}
		
		
		/*int numero = 10;
		int divisor = input.nextInt();
		int resultado = 0;
		
		try {
			resultado = 10/divisor;
		}catch(ArithmeticException e) { // pode ter varios catch
			resultado = 10/1;
		}finally {
			System.out.println("O resultado é "+resultado); // executando bloco independente de qualquer coisa0 
		}
		
		System.out.println("Seguindo o programa...");
	
		*/
	}

	private static double divisao(int valor, int denominador) throws DivisaoZeroException{
		double result = 0;
		
		if(denominador ==0) {
			throw new DivisaoZeroException("Divisão por zero");
		}
		
		result= valor/denominador;
		return result;
	}
}
