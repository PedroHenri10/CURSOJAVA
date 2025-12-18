package one.digitalinnovation.gof.factory;

public class RoboFactory {

    public static TipoRobo criarRobo(String tipo) {
        if (tipo.equalsIgnoreCase("ataque")) {
            return new RoboAtaque();
        } else if (tipo.equalsIgnoreCase("defesa")) {
            return new RoboDefesa();
        }
        throw new IllegalArgumentException("Tipo inválido");
    }
}
