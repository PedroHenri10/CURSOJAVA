package estruturaDecisao;
import java.util.Scanner;

public class EstruturaDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ola Mundo!");
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Qual a sua idade");
		
		idade = leia.nextInt();
		
		System.out.println("Minha idade é "+ idade);
		
		while(idade <18) {
			System.out.println("É menor de idade");
		}
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Qual O SEU NOME");
		
		nome = input.nextLine();
		
		while(nome.equals((""))) {
			System.out.println("Insira Novamente seu nome");
			nome = input.nextLine();
		}
		
		int contador = 1;
		while (contador <=10) {
			System.out.println("contador");
			contador++;
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		//do{
		//}while(condicao)
		
	}

}
