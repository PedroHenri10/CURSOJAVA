package domain.animal;

public class Gato extends Animal{
    private boolean acostumadoAgua;

    public Gato(String nome, int idade, TipoPelo tipoPelo, String nomeDono, boolean acostumadoAgua) {
        super(nome, idade, tipoPelo, nomeDono);
        this.acostumadoAgua = acostumadoAgua;
    }

    public boolean isAcostumadoAgua() {
        return acostumadoAgua;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Acostumado com água: %s", acostumadoAgua ? "Sim" : "Não");
    }
}
