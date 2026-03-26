package domain.animal;

public enum TipoPorte {
    PEQUENO(1, 1.0),
    MEDIO(2, 1.2),
    GRANDE(3, 1.4),
    GIGANTE(4, 1.8);

    private final int codigo;
    private final double adicional;

    TipoPorte(int codigo, double adicional) {
        this.codigo = codigo;
        this.adicional = adicional;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getAdicional() {
        return adicional;
    }

    public static TipoPorte converterCodigo(int codigo) {
        for (TipoPorte porte : values()) {
            if (porte.getCodigo() == codigo) {
                return porte;
            }
        }
        throw new IllegalArgumentException("Código de porte inválido: " + codigo);
    }
}