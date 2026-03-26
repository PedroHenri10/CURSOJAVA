package domain.funcionario;

public class Funcionario{
    private static int contador =0;
    private int id;
    private String nome;
    private int qtdAnimaisAtentidos;

    public Funcionario(String nome, int qtdAnimaisAtentidos) {
        this.id = contador++;
        this.nome = nome;
        this.qtdAnimaisAtentidos = qtdAnimaisAtentidos;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdAnimaisAtentidos() {
        return qtdAnimaisAtentidos;
    }

    public void setQtdAnimaisAtentidos(int qtdAnimaisAtentidos) {
        this.qtdAnimaisAtentidos = qtdAnimaisAtentidos;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s | Banhos aplicados: %d",
                nome,
                qtdAnimaisAtentidos
        );
    }
}
