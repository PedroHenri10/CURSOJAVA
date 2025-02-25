package projetoForEach;

import java.util.ArrayList;

public class ProjetoForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listaDeNotas = new ArrayList<>();
		listaDeNotas.add(8);
		listaDeNotas.add(6);
		listaDeNotas.add(4);
		listaDeNotas.add(7);
		
		//for(int i =0; i<listaDeNotas.size(); i++) {
			//System.out.println(listaDeNotas.get(i));
	//	}
		
		//corrach
		for (Integer nota : listaDeNotas) {
			System.out.println(nota);
		}
	}

}
