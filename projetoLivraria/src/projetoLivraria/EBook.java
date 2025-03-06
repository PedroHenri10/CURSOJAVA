package projetoLivraria;

public class EBook extends Livro{
	private double tamanhoEmMb;

	public double getTamanhoEmMb() {
		return tamanhoEmMb;
	}

	public void setTamanhoEmMb(double tamanhoEmMb) {
		this.tamanhoEmMb = tamanhoEmMb;
	}

	public EBook(String titulo, String autor, String isbn, double preco, double peso, double tamanhoEmMb) {
		super(titulo, autor, isbn, preco);
		this.tamanhoEmMb = tamanhoEmMb;
	}

	@Override
	public double calcularPrecoTotal() {
		return getPreco();
	}
	
}
