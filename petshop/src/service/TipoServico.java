package service;

public enum TipoServico {
    BANHO(1),
    TOSA(2),
    BANHO_TOSA(3);

    private final int codigo;

    TipoServico(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static TipoServico converterodigo(int codigo) {
        for (TipoServico tipo : values()) {
            if (tipo.getCodigo() == codigo) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código de serviço inválido: " + codigo);
    }
}