package one.digitalinnovation.gof.observer;

import java.util.ArrayList;
import java.util.List;

public class RoboAlerta {

    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void detectarEvento(String evento) {
        for (Observador obs : observadores) {
            obs.atualizar(evento);
        }
    }
}
