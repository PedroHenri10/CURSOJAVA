package domain.funcionario;

import domain.animal.Animal;

public class FuncionarioCompleto extends Funcionario implements Tosador,Lavador{
    public FuncionarioCompleto(String nome, int qtdAnimaisAtentidos) {
        super(nome, qtdAnimaisAtentidos);
    }

    @Override
    public void darBanho(Animal animal) {

    }

    @Override
    public void tosar(Animal animal) {

    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s | Tosador: sim | Lavador: sim | Banhos aplicados: %d",
                getNome(),
                getQtdAnimaisAtentidos()
        );
    }
}
