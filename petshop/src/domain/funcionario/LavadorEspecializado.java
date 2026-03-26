package domain.funcionario;

import domain.animal.Animal;

public class LavadorEspecializado extends Funcionario implements Lavador{
    public LavadorEspecializado(String nome, int qtdAnimaisAtentidos) {
        super(nome, qtdAnimaisAtentidos);
    }

    @Override
    public void darBanho(Animal animal) {

    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s | Tosador: não | Lavador: sim | Banhos aplicados: %d",
                getNome(),
                getQtdAnimaisAtentidos()
        );
    }
}
