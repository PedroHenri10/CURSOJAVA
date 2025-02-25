package arrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> listaDeCompras = new ArrayList<>();
		
		listaDeCompras.add("Arroz");
		listaDeCompras.add("feijão");
		listaDeCompras.add("farinha");
		listaDeCompras.add("sal");
		
		System.out.println(listaDeCompras.get(1));
		listaDeCompras.remove(1);
		System.out.println(listaDeCompras.get(1));
		
		ArrayList<Integer> listaDeNotas = new ArrayList<>();
		//wrappers, empacotadores, arraylist nao aceita tipos primitivos, aceita Integer, Double,

}
}




	

