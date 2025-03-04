package projetoToDoList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ListaDeTarefas gerenciadorDeTarefas = new ListaDeTarefas();
		
		Scanner input = new Scanner(System.in);
		
		int op = -1;
		
		while(op != 0) {
			System.out.println("1 - Adicionar tarefa \n"+"2 - Remover \n"+"3 - Listar Tarefas \n"+"4 - Lista alfabetica \n"+"0 - Sair");
			op = input.nextInt();
			input.nextLine();
			switch(op) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				adicionarTarefa(gerenciadorDeTarefas, input);
				break;
			case 2:
				removerTarefas(gerenciadorDeTarefas, input);
				break;
			case 3:
				listarTarefas(gerenciadorDeTarefas, input);
				break;
			case 4:
                gerenciadorDeTarefas.listarAlfabetica(); 
                break;
			default:
				System.out.println("Opção Invalida!\n");
			}
		}
		input.close();
	}
	
	private static void adicionarTarefa(ListaDeTarefas gerenciadorDeTarefas, Scanner input) {
	    String tituloTarefa;
	    boolean tarefaExiste;

	    do {
	        tarefaExiste = false;
	        System.out.print("Digite o título da tarefa: ");
	        tituloTarefa = input.nextLine();

	        for (Tarefa t : gerenciadorDeTarefas.getListaTarefas()) {
	            if (tituloTarefa.equalsIgnoreCase(t.getTarefa())) {
	                System.out.println("Tarefa já existe! Insira um título diferente.");
	                tarefaExiste = true; 
	                break;
	            }
	        }
	    } while (tarefaExiste);

	    System.out.print("Digite o status da tarefa (concluído/em andamento): ");
	    String statusTarefa = input.nextLine();
	    gerenciadorDeTarefas.adicionarTarefa(tituloTarefa, statusTarefa);
	    System.out.println("Tarefa adicionada!");
	}

	 private static void listarTarefas(ListaDeTarefas gerenciadorDeTarefas, Scanner input) {
	        if (gerenciadorDeTarefas.getListaTarefas().isEmpty()) { 
	            System.out.println("A lista de tarefas está vazia.");
	            return;
	        }
	        for (Tarefa t : gerenciadorDeTarefas.getListaTarefas()) { 
	            System.out.println(t.getTarefa() + " - " + t.getStatus());
	        }
	    }
	
	private static void removerTarefas(ListaDeTarefas gerenciadorDeTarefas, Scanner input) {
		System.out.println("digite a tarefa que deseja remover: ");
		String tituloTarefa = input.nextLine();
		
		for(Tarefa t : gerenciadorDeTarefas.getListaTarefas()) {
			if( t.getTarefa().equalsIgnoreCase(tituloTarefa)) {
				System.out.println("Tem certeza que deseja remover (s*n)");
				char confirmar = input.next().charAt(0);
				if(confirmar == 's' || confirmar == 'S')
				{
					gerenciadorDeTarefas.removerTarefa(t);
				 System.out.println("Tarefa removida!");
	             break;
				}else {
					System.out.println("cancelado");
				}
			}
		}
	}
	
}

