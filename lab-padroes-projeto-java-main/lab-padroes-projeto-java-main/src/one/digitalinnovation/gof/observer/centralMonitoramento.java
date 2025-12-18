package one.digitalinnovation.gof.observer;

public class CentralMonitoramento implements Observador {
    @Override
    public void atualizar(String evento) {
        System.out.println("Central recebeu alerta: " + evento);
    }
}
