import java.util.*;

public class ExList {

    public static void main(String[] args) {

        List<String> alunos = new ArrayList<>();

        alunos.add("Pedro");
        alunos.add("Ana");
        alunos.add("Carlos");
        alunos.add("Maria");
        alunos.add("João");

        System.out.println("Lista de alunos:");
        for (String a : alunos) {
            System.out.println(a);
        }

        alunos.remove("Carlos");

        System.out.println("\nApós remoção:");
        System.out.println(alunos);

        if (alunos.contains("Ana")) {
            System.out.println("Ana está na lista");
        }
    }
}
