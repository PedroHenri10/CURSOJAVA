package projetoLivraria;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		Livro livroFisico = new LivroFisico("titulo", "AUTOR", "123456789", 30.0, 0.7, 11.5);
		Livro livroEBook = new EBook("titulo", "AUTOR", "123456789", 30.0, 0.7, 22);

		carrinho.livros.add(livroFisico);
		carrinho.livros.add(livroEBook);
		
		/*
		 * mais rapido
		 * for( Livro l : carrinho.livros) {
			System.out.println(l);
			} */
		
		for( Livro l : carrinho.livros) {
			System.out.println("Titulo: " +l.getTitulo()); 
			System.out.println("Autor: " +l.getAutor()); 
			System.out.println("ISBN" +l.getIsbn()); 
			System.out.println("Preco" +l.getPreco());
			
			if(l instanceof LivroFisico) {
				System.out.println("Peso: " +((LivroFisico)l).getPeso()); 
				System.out.println("Frete: " +((LivroFisico)l).getFrete()); 
			}else if(l instanceof EBook){
				System.out.println("Peso: " +((EBook)l).getTamanhoEmMb()); 
			}
		}
	}

}
