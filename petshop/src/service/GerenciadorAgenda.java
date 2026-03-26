package service;

import domain.agenda.HorarioAgenda;
import domain.animal.Animal;
import domain.animal.Cachorro;
import domain.animal.Gato;
import domain.animal.TipoPorte;
import domain.exceptions.AnimalNaoEncontradoException;
import domain.exceptions.EspecialidadeInvalidaException;
import domain.exceptions.ForaExpedienteException;
import domain.exceptions.FuncionarioIndisponivelException;
import domain.funcionario.Funcionario;
import domain.funcionario.FuncionarioCompleto;
import domain.funcionario.Lavador;
import domain.funcionario.Tosador;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorAgenda {
    List<HorarioAgenda> horarios = new ArrayList<>();
    AnimalService animalService = new AnimalService();
    private double preco = 0;

    public List<Funcionario> buscarFuncionario(int especialidade, List<Funcionario> funcionarios, Animal animal) {
        List<Funcionario> selecionados = new ArrayList<>();
        if (especialidade == 1) {
            for (Funcionario f : funcionarios) {
                if (f instanceof Lavador || f instanceof FuncionarioCompleto) {
                    if (animal instanceof Cachorro){
                        Cachorro cao = (Cachorro) animal;
                        if(cao.getPorte() == TipoPorte.GRANDE && f.getQtdAnimaisAtentidos() < 10){
                           continue;
                        }
                }
                    selecionados.add(f);
                    return selecionados;
                }
            }
            throw new FuncionarioIndisponivelException("Nenhum lavador disponível.");
        } else if (especialidade == 2) {
            throw new EspecialidadeInvalidaException("Só tosar não é permitido.");
        } else if (especialidade == 3) {
            for (Funcionario f : funcionarios) {
                if (f instanceof FuncionarioCompleto) {
                    selecionados.add(f);
                    return selecionados;
                }
            }

            Funcionario lavador = null;
            Funcionario tosador = null;

            for (Funcionario f : funcionarios) {
                if (lavador == null && (f instanceof Lavador || f instanceof FuncionarioCompleto)) {
                    lavador = f;
                }
                if (tosador == null && (f instanceof Tosador || f instanceof FuncionarioCompleto)) {
                    tosador = f;
                }
                if (lavador != null && tosador != null) break;
            }

            if (lavador == null || tosador == null) {
                throw new FuncionarioIndisponivelException(
                        "Não há funcionários suficientes para banho + tosa nesse horário."
                );
            }

            selecionados.add(lavador);
            selecionados.add(tosador);
            return selecionados;
        } else {
            throw new EspecialidadeInvalidaException("Especialidade inválida.");
        }
    }

    public List<HorarioAgenda> getHorarios() {
        return horarios;
    }

    public int escolherEspecialidade(Scanner sc){
        System.out.println("Qual serviço deseja? \n" +
                "1-Banho\n" +
                "2-Banho e tosa");
        int opServico = sc.nextInt();
        sc.nextLine();

        if(opServico == 1){
            return 1;
        } else if (opServico == 2) {
            return 2;
        }else{
            throw new EspecialidadeInvalidaException("Especialidade inválida / não pode so tosar o animal..");
        }

    }

    public void calcularPreco(int especialidade, Animal animal, Funcionario tosador){

        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
            preco = cachorro.getTipoPelo().getPreco() * cachorro.getPorte().getAdicional();
        }else{
            Gato gato = (Gato) animal;
            if(gato.isAcostumadoAgua()){
                preco = gato.getTipoPelo().getPreco();
            }else{
                preco = gato.getTipoPelo().getPreco() + 20;
            }
        }

        preco = (especialidade == 1) ? preco : preco + 20;
        setPreco(preco);
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean continuarAgendamento(Scanner sc){
        System.out.println("O preço do atendimento será R$ " + preco+ " Deseja continuar? (true/false)");
        boolean continuar = sc.nextBoolean();
        sc.nextLine();
        if(continuar) {
            return true;
        }

        return false;
    }

    public void agendarHorario(OffsetDateTime horario, Animal animal, List<Funcionario> selecionados) {
        if (animal == null) {
            throw new AnimalNaoEncontradoException("Não é possível agendar: animal não cadastrado.");
        }

        int hora = horario.getHour();
        if ((hora < 8) || (hora >= 12 && hora < 13) || (hora >= 18)) {
            throw new ForaExpedienteException("Horário fora do expediente do Petshop (08-12 | 13-18).");
        }

        for (Funcionario f : selecionados) {
            boolean disponivel = true;
            for (HorarioAgenda h : horarios) {
                if (h.getFuncionario().equals(f)) {
                    long diferenca = Duration.between(h.getHorario(), horario).toMinutes();
                    if (Math.abs(diferenca) < 60) {
                        disponivel = false;
                        break;
                    }
                }
            }
            if (!disponivel) {
                throw new FuncionarioIndisponivelException(
                        "O funcionário " + f.getNome() + " não está disponível nesse horário."
                );
            }
        }

        for (Funcionario f : selecionados) {
            HorarioAgenda h = new HorarioAgenda(horario, animal, f);
            horarios.add(h);
        }

        System.out.println("Agendamento confirmado!");
        System.out.println("Animal: " + animal.getNome());
        System.out.println("Tutor: " + animal.getNomeDono());
        System.out.println("Horário: " + horario);
        System.out.println("Funcionário(s): ");
        for (Funcionario f : selecionados) {
            System.out.println(" - " + f.getNome());
        }
    }
}
