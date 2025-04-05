package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Iniciando processo seletivo...\n");

        // Testando análise de salário
        analisarCandidato(1400);
        analisarCandidato(2200);
        analisarCandidato(2000);

        // Seleção de candidatos
        System.out.println("\n-- Seleção de candidatos --");
        selecionarCandidatos();

        // Imprimir todos os candidatos com índice
        System.out.println("\n-- Lista completa de candidatos --");
        imprimirCandidatos();

        // Simular contato com candidatos
        System.out.println("\n-- Tentativa de contato --");
        String[] candidatos = {"Piquerez", "Gomez", "Ana", "Kaka", "clarice", "mauricio", "Carol", "veiga", "barbara", "Gustavo"};
        for (String candidato : candidatos) {
            tentarContato(candidato);
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioPretendido < salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO (pretensão: " + salarioPretendido + ")");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("LIGAR COM CONTRAPROPOSTA (pretensão: " + salarioPretendido + ")");
        } else {
            System.out.println("AGUARDAR OUTROS CANDIDATOS (pretensão: " + salarioPretendido + ")");
        }
    }

    static void selecionarCandidatos() {
        String[] candidatos = {"Piquerez", "Gomez", "Ana", "Kaka", "clarice", "mauricio", "Carol", "veiga", "barbara", "Gustavo"};
        double salarioBase = 2000.0;
        int selecionados = 0;

        for (int i = 0; i < candidatos.length && selecionados < 5; i++) {
            String candidato = candidatos[i];
            double valorPretendido = gerarSalarioAleatorio();

            System.out.printf("Candidato %s - Pretensão: %.2f\n", candidato, valorPretendido);

            if (valorPretendido <= salarioBase) {
                System.out.println("-> " + candidato + " foi selecionado.");
                selecionados++;
            }
        }
    }

    static void imprimirCandidatos() {
        String[] candidatos = {"Piquerez", "Gomez", "Ana", "Kaka", "clarice", "mauricio", "Carol", "veiga", "barbara", "Gustavo"};
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + candidatos[i]);
        }
    }

    static double gerarSalarioAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1500, 2500);
    }

    static boolean atenderLigacao() {
        return new Random().nextInt(3) == 1; // chance de 1 em 3 de atender
    }

    static void tentarContato(String candidato) {
        int tentativas = 0;
        boolean atendeu = false;

        while (tentativas < 3 && !atendeu) {
            tentativas++;
            atendeu = atenderLigacao();

            if (atendeu) {
                System.out.println("Contato com " + candidato + " realizado na tentativa " + tentativas + "!");
            } else if (tentativas == 3) {
                System.out.println("Não conseguimos contato com " + candidato + " após 3 tentativas.");
            }
        }
    }
}
