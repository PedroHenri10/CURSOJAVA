package projetoDaLampada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lampada() e o metodo construtor
		Lampada minhaLampada = new Lampada(30);
		Lampada minhaLampada2 = new Lampada(40);
		Lampada minhaLampada3 = new Lampada(50);
		Lampada outraLampada = new Lampada(20);
		
		minhaLampada.ligar();
		
		System.out.println("Minha lampada de "+minhaLampada.getPotencia() +"esta ligada "+minhaLampada.isLigado());
		
		outraLampada.desligar();
	}

}
