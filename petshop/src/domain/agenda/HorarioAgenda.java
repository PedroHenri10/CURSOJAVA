package domain.agenda;

import domain.animal.Animal;
import domain.funcionario.Funcionario;

import java.time.OffsetDateTime;

public class HorarioAgenda {
    private static int contador =0;
    private int id;
    private OffsetDateTime horario;
    private final Animal animal;
    private final Funcionario funcionario;

    public Animal getAnimal() {
        return animal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public HorarioAgenda(OffsetDateTime horario, Animal animal, Funcionario funcionario) {
        this.id = contador++;
        this.horario = horario;
        this.animal = animal;
        this.funcionario = funcionario;
    }


    public int getId() {
        return id;
    }

    public OffsetDateTime getHorario() {
        return horario;
    }
}
