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

public class SomarSalarioDepartamento {
    public static void main(String[] args) {

        List<Funcionario> lista = Arrays.asList(
            new Funcionario("Pedro", "TI", 3000),
            new Funcionario("Ana", "RH", 2000),
            new Funcionario("Carlos", "TI", 4000)
        );

        Map<String, Double> resultado = lista.stream()
                .collect(Collectors.groupingBy(
                        f -> f.depto,
                        Collectors.summingDouble(f -> f.salario)
                ));

        System.out.println(resultado);
    }
}
