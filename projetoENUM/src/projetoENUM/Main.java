package projetoENUM;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		DiaDaSemana diaEnum;
		
		FormaDePagamento formaPag = FormaDePagamento.CARTAO_CREDITO;
		
		System.out.println("Escolha o dia da semana:");
		
		for ( DiaDaSemana dia : DiaDaSemana.values())
		{
			System.out.println(dia);
		}
		
		String diaTexto = input.next();
		diaEnum = DiaDaSemana.valueOf(diaTexto.toLowerCase());
		
		System.out.println("o dia escolhido foi: "+diaEnum);
	}

}
