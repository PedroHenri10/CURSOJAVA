package domain.animal;

public class Cachorro extends Animal{
    private TipoPorte porte;

    public Cachorro(String nome, int idade, TipoPelo tipoPelo, String nomeDono, TipoPorte porte) {
        super(nome, idade, tipoPelo, nomeDono);
        this.porte = porte;
    }

    public TipoPorte getPorte() {
        return porte;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Porte: %s", porte.name());
    }
}