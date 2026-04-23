import java.util.*;
import java.util.stream.Collectors;

class Funcionario {
    String nome;
    String depto;
    double salario;

    Funcionario(String nome, String depto, double salario) {
        this.nome = nome;
        this.depto = depto;
        this.salario = salario;
    }
}

public class MaiorSalarioDepartamento {
    public static void main(String[] args) {

        List<Funcionario> lista = Arrays.asList(
            new Funcionario("Pedro", "TI", 3000),
            new Funcionario("Ana", "TI", 5000),
            new Funcionario("Carlos", "RH", 2000)
        );

        Map<String, Optional<Funcionario>> resultado = lista.stream()
                .collect(Collectors.groupingBy(
                        f -> f.depto,
                        Collectors.reducing((f1, f2) ->
                                f1.salario > f2.salario ? f1 : f2)
                ));

        resultado.forEach((k, v) ->
                System.out.println(k + " → " + v.get().nome));
    }
}
