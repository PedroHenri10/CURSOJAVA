package sistemaSoma;
import java.util.Scanner;

public class SistemaSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int valor1, valor2;
		
		System.out.println("Insira o primeiro valor: ");
		valor1 = input.nextInt();
		
		System.out.println("Insira o segundo valor: ");
		valor2 = input.nextInt();
		
		int resultado = valor1 + valor2;
		
		System.out.println("O resultado da soma de "+ valor1 + " + "+valor2+" é igual a " +resultado);
		
		if(valor1 > valor2) {
			System.out.println(valor1 +" é maior do que "+ valor2);
		}else if(valor2 > valor1){
			System.out.println(valor2 +" é maior do que "+ valor1);
		}else {
			System.out.println(valor1 +" é igual ao "+ valor2);
		}
	}

}
