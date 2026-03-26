package domain.funcionario;

import domain.animal.Animal;

public class TosadorEspecializado extends Funcionario implements Tosador{

    public TosadorEspecializado(String nome, int qtdAnimaisAtentidos) {
        super(nome, qtdAnimaisAtentidos);
    }

    @Override
    public void tosar(Animal animal) {

    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s | Tosador: sim | Lavador: não | Banhos aplicados: %d",
                getNome(),
                getQtdAnimaisAtentidos()
        );
    }
}
