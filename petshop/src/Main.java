import domain.agenda.HorarioAgenda;
import domain.animal.Animal;
import domain.exceptions.AnimalNaoEncontradoException;
import domain.exceptions.EspecialidadeInvalidaException;
import domain.exceptions.ForaExpedienteException;
import domain.exceptions.FuncionarioIndisponivelException;
import domain.funcionario.Funcionario;
import service.AnimalService;
import service.FuncionarioService;
import service.GerenciadorAgenda;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnimalService animalService = new AnimalService();
        GerenciadorAgenda gerenciaAgenda = new GerenciadorAgenda();
        FuncionarioService funcionarioService = new FuncionarioService();
        List<Funcionario> funcionarios = funcionarioService.adicionarFuncionarios();

        int opcao = -1;

        do {
            mostrarMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    animalService.cadastrarAnimal(sc);
                    break;
                case 2:
                    try {
                        Animal animalSelecionado = animalService.selecionarAnimal(sc);
                        int especialidade = gerenciaAgenda.escolherEspecialidade(sc);

                        gerenciaAgenda.calcularPreco(especialidade, animalSelecionado, null);
                        if (!gerenciaAgenda.continuarAgendamento(sc)) {
                            System.out.println("Agendamento cancelado pelo cliente.");
                            break;
                        }

                        List<Funcionario> selecionados = gerenciaAgenda.buscarFuncionario(especialidade, funcionarios, animalSelecionado);

                        System.out.print("Digite a data/hora do agendamento (dd/MM/yyyy HH:mm): ");
                        String entrada = sc.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                        OffsetDateTime horario = LocalDateTime.parse(entrada, formatter).atOffset(ZoneOffset.of("-03:00"));

                        gerenciaAgenda.agendarHorario(horario, animalSelecionado, selecionados);
                    } catch (AnimalNaoEncontradoException | EspecialidadeInvalidaException |
                             FuncionarioIndisponivelException | ForaExpedienteException e) {
                        System.out.println("Erro: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Erro inesperado: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Agenda atual:");
                    for (HorarioAgenda h : gerenciaAgenda.getHorarios()) {
                        System.out.println("Animal: " + h.getAnimal().getNome() +
                                " | Tutor: " + h.getAnimal().getNomeDono() +
                                " | Horário: " + h.getHorario() +
                                " | Funcionário: " + h.getFuncionario().getNome());
                    }
                    break;
                case 0:
                    break;
                default:
            }
        } while(opcao != 0);
    }

    public static void mostrarMenu(){
        System.out.println("====================== Menu PetShop ======================");
        System.out.println("1- Cadastrar animal ");
        System.out.println("2- agendar");
        System.out.println("3- listar agenda ");
        System.out.println("0- sair");
    }
}