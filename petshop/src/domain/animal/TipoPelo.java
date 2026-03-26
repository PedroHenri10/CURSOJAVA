package domain.animal;

public enum TipoPelo {
    SEMPELO(1, 10),
    CURTO(2, 30),
    MEDIO(3, 40),
    LONGO(4, 60);

    private final int codigo;
    private final double preco;

    TipoPelo(int codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public static TipoPelo converterCodigo(int codigo) {
        for (TipoPelo tipo : values()) {
            if (tipo.getCodigo() == codigo) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código de pelagem inválido: " + codigo);
    }
}