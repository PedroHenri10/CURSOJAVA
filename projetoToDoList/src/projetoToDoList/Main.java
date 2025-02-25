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
			switch(op) {
			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				adicionarTarefa(listaDeTarefas, input);
				break;
			case 2:
				break;
			case 3:
				listarTarefas(listaDeTarefas, input);
				break;
			default:
				System.out.println("Opção Invalida!\n");
			}
		}
	}
	private static void adicionarTarefa(ArrayList<Tarefa> listaDeTarefas, Scanner input){
		Tarefa tarefa = new Tarefa();
		System.out.print("digite a tarefa: ");
		tarefa.setTarefa(input.nextLine());
        System.out.print("Digite se o status da tarefa está concluído ou em andamento: ");
        tarefa.setStatus(input.nextLine());
        listaDeTarefas.add(tarefa);
        System.out.print("Tarefa adicionada!");
		listaDeTarefas.add(tarefa);
		
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
}

