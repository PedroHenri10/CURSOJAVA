import java.util.*;

public class ExMap {

    public static void main(String[] args) {

        Map<String, String> agenda = new HashMap<>();

        agenda.put("Pedro", "9999-1111");
        agenda.put("Ana", "8888-2222");
        agenda.put("Carlos", "7777-3333");

        String nome = "Ana";

        if (agenda.containsKey(nome)) {
            System.out.println("Telefone de " + nome + ": " + agenda.get(nome));
        }

        System.out.println("\nAgenda completa:");
        for (String key : agenda.keySet()) {
            System.out.println(key + " - " + agenda.get(key));
        }
    }
}
