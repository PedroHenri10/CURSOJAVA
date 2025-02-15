package projetoCalculadora;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		char op;
		
		System.out.println("insira um valor: ");
		num1 = input.nextDouble();
		System.out.println("Insira o segundo valor: ");
        num2 = input.nextDouble();
        System.out.println("Insira o operador (+, -, *, /): ");
        op = input.next().charAt(0);
		
		Calculadora calc2000 = new Calculadora(555);
		calc2000.apresentacao();
		
		input.close();
		
		double result = calc2000.calcular(num1, num2, op);
		System.out.println(result);
	}

}
