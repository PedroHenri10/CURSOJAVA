package projetoToDoList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Tarefa> listaDeTarefas = new ArrayList();
		
		Scanner input = new Scanner(System.in);
		
		int op = -1;
		
		while(op != 0) {
			System.out.println("1 - Adicionar tarefa \n"+"2 - Remover \n"+"3 - Listar Tarefas \n"+"0 - Sair");
			op = input.nextInt();
			input.nextLine();
			switch(op) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				adicionarTarefa(listaDeTarefas, input);
				break;
			case 2:
				removerTarefas(listaDeTarefas, input);
				break;
			case 3:
				listarTarefas(listaDeTarefas, input);
				break;
			default:
				System.out.println("Opção Invalida!\n");
			}
		}
		input.close();
	}
	private static void adicionarTarefa(ArrayList<Tarefa> listaDeTarefas, Scanner input){
		Tarefa tarefa = new Tarefa();
		System.out.print("digite a tarefa: ");
		tarefa.setTarefa(input.nextLine());
        System.out.print("Digite se o status da tarefa está concluído ou em andamento: ");
        tarefa.setStatus(input.nextLine());
        listaDeTarefas.add(tarefa);
        System.out.print("Tarefa adicionada!");		
		//for (Tarefa : tarefas) {
			//if()
		}
	
	private static void listarTarefas(ArrayList<Tarefa> listaDeTarefas, Scanner input) {
		if(listaDeTarefas.isEmpty()) {
			System.out.println("A lista de tarefas está vazia.");
			return;
		}
		for(Tarefa t : listaDeTarefas) {
			System.out.println(t.getTarefa()+"- "+t.getStatus());
		}
	}
	private static void removerTarefas(ArrayList<Tarefa> listaDeTarefas, Scanner input) {
		System.out.println("digite a tarefa que deseja remover: ");
		String tarefaRemover = input.nextLine();
		
		for(Tarefa t : listaDeTarefas) {
			if( tarefaRemover.equals(t.getTarefa())) {
				listaDeTarefas.remove(t);
				 System.out.println("Tarefa removida!");
	              return;
			}
		}
        System.out.println("Tarefa não encontrada.");
	}
}

