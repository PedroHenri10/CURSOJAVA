import java.util.Scanner;
public class DesafioJavaSemana1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char op;
		int resultado = 0;
		
		do {
			System.out.println("Digite 0 para sair ou algumas dessas operações +, -, *,/ : ");
			
			op = input.next().charAt(0);
			
			if (op == '0') break; 
			
			int valor1, valor2;
			
			System.out.println("digite o primeiro valor: ");
			
			valor1 = input.nextInt();
			
			
			System.out.println("digite o segundo valor: ");
			
			valor2 = input.nextInt();
			
			 switch (op) {
	            case '+':
	                resultado = valor1 + valor2;
	                break;
	            case '-':
	            	resultado = valor1 - valor2;
	                break;
	            case '*':
	            	resultado = valor1 * valor2;
	                break;
	            case '/':
	            	if (valor2 == 0) {
                        System.out.println("Erro: Divisão por zero.");
                    } else {
                        resultado = valor1 / valor2;
                    }
	                break;
	            default:
	            	System.out.println("opcao invalida");
			 }
			 
			 
			 if (op != '0') {
			 System.out.println(valor1+ " "+op +" "+valor2 +" = " + resultado);
			 }
			 
		}while(op != '0');
	}

}
