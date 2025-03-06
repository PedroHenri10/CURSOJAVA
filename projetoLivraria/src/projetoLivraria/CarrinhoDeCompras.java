package projetoLivraria;
import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	List<Livro> livros = new ArrayList();
	
	public double calcularTotal() {
		double total = 0;
		
		for( Livro l : livros) {
			total += l.calcularPrecoTotal();
		}
		
		return total;
	}
	
}
