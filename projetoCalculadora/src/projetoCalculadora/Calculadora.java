package projetoCalculadora;

public class Calculadora {

	private int codigo;
	
	// metodo construtor
	public Calculadora(int codigo) {
		this.codigo = codigo;
	}
	
	private double soma (double v1, double v2) {
		return v1 + v2;
	}
	
	private double sub (double v1, double v2) {
		return v1 - v2;
	}
	
	private double mult (double v1, double v2) {
		return v1 * v2;
	}
	
	private double divisao (double v1, double v2) {
		 if (v2 == 0) {
	            throw new ArithmeticException("Divisão por zero");
	        }
	        return v1 / v2;
	}
	
	public double calcular(double n1, double n2, char operador) {
		double resultado =0;
		switch(operador) {
		case '+':
			resultado = soma(n1,n2);
			break;
		case '-':
			resultado = sub(n1,n2);
			break;
		case '*':
			resultado = mult(n1,n2);
			break;
		case '/':
			resultado = divisao(n1,n2);
			break;
		default:
			System.out.println("valor invalido!");
		}
		return resultado;
	}
	
	public void apresentacao() {
		System.out.println("calculadora cod " + codigo);
	}
	
}
