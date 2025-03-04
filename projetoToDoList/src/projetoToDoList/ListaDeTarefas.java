package projetoToDoList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaDeTarefas {
	private ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
	
	public void adicionarTarefa(String tituloTarefa, String statusTarefa) {
		Tarefa tarefa = new Tarefa();
		tarefa.setTarefa(tituloTarefa);
		tarefa.setStatus(statusTarefa);
		listaDeTarefas.add(tarefa);
	}
	
	public void removerTarefa(Tarefa t) {
		listaDeTarefas.remove(t);
	}
	
	public ArrayList<Tarefa> getListaTarefas(){
		return listaDeTarefas;
	}
	
	public void listarAlfabetica() {
        ArrayList<Tarefa> listaOrdenada = new ArrayList<>(listaDeTarefas);
        Collections.sort(listaOrdenada, Comparator.comparing(Tarefa::getTarefa));
        imprimirLista(listaOrdenada);
    }
	
	private void imprimirLista(ArrayList<Tarefa> lista) {
        if (lista.isEmpty()) {
            System.out.println("A lista de tarefas está vazia.");
        } else {
            for (Tarefa t : lista) {
                System.out.println(t.getTarefa() + " - " + t.getStatus());
            }
        }
	}
}
