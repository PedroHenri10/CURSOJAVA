package projetoDaLampada;

public class Lampada {

	//propriedades
	private int potencia;
	private boolean ligado;
	
	//metodo getters and setters
	
	//metodos construtor (int pot)
	public Lampada(int potencia ) {
		// potencia = pot;
		this.potencia = potencia;
		this.desligar();
	}
	
	public int getPotencia() {
		return potencia;
	}

	public boolean isLigado() {
		return ligado;
	}
	
	//metodos
	void ligar() {
		ligado = true;
	}
	
	void desligar() {
		ligado = false;
	}
}
