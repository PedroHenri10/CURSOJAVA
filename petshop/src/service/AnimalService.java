package service;

import domain.animal.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalService {

    private List<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }

        System.out.println("=== Animais Cadastrados ===");
        for (int i = 0; i < animais.size(); i++) {
            System.out.println((i + 1) + " - " + animais.get(i));
        }
    }

    public Animal selecionarAnimal(Scanner sc) {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return null;
        }

        listarAnimais();

        int escolha = -1;
        do {
            System.out.print("Escolha o animal pelo número: ");
            if (sc.hasNextInt()) {
                escolha = sc.nextInt();
                sc.nextLine();
                if (escolha >= 1 && escolha <= animais.size()) {
                    return animais.get(escolha - 1);
                } else {
                    System.out.println("Número inválido, tente novamente.");
                }
            } else {
                sc.nextLine();
                System.out.println("Entrada inválida, digite um número.");
            }
        } while (true);
    }

    public void cadastrarAnimal(Scanner scanner) {

        System.out.println("=== Cadastro de Animal ===");
        System.out.print("Escolha o tipo de animal (1 - Gato | 2 - Cachorro): ");
        int tipoAnimalSelecionado = scanner.nextInt();
        scanner.nextLine();

        Animal animalCadastrado = null;

        if (tipoAnimalSelecionado == 1) {
            animalCadastrado = cadastrarGato(scanner);
        } else if (tipoAnimalSelecionado == 2) {
            animalCadastrado = cadastrarCachorro(scanner);
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        adicionarAnimal(animalCadastrado);
        System.out.println("\nAnimal cadastrado com sucesso!");
    }

    private Gato cadastrarGato(Scanner scanner) {
        System.out.println("\n--- Cadastro de Gato ---");

        String nomeAnimal = lerNomeAnimal(scanner);
        int idadeAnimal = lerIdade(scanner);
        TipoPelo tipoPelagem = lerTipoPelagem(scanner);
        String nomeDono = lerNomeDono(scanner);

        System.out.print("O gato é acostumado com água? (true/false): ");
        boolean gostaDeAgua = scanner.nextBoolean();
        scanner.nextLine();

        return new Gato(nomeAnimal, idadeAnimal, tipoPelagem, nomeDono, gostaDeAgua);
    }

    private Cachorro cadastrarCachorro(Scanner scanner) {
        System.out.println("\n--- Cadastro de Cachorro ---");

        String nomeAnimal = lerNomeAnimal(scanner);
        int idadeAnimal = lerIdade(scanner);
        TipoPelo tipoPelagem = lerTipoPelagem(scanner);
        String nomeDono = lerNomeDono(scanner);

        System.out.println("Informe o porte do cachorro:");
        System.out.println("1 - Pequeno");
        System.out.println("2 - Médio");
        System.out.println("3 - Grande");
        System.out.println("4 - Gigante");

        int codigo = scanner.nextInt();
        scanner.nextLine();
        TipoPorte porte = TipoPorte.converterCodigo(codigo);

        return new Cachorro(nomeAnimal, idadeAnimal, tipoPelagem, nomeDono, porte);
    }


    private String lerNomeAnimal(Scanner scanner) {
        System.out.print("Nome do animal: ");
        return scanner.nextLine();
    }

    private int lerIdade(Scanner scanner) {
        System.out.print("Idade do animal: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        return idade;
    }

    private TipoPelo lerTipoPelagem(Scanner scanner) {
        System.out.println("Tipo de pelagem:");
        System.out.println("1 - Sem pelo");
        System.out.println("2 - Curto");
        System.out.println("3 - Médio");
        System.out.println("4 - Longo");

        int tipoPelagem = scanner.nextInt();
        scanner.nextLine();
        return TipoPelo.converterCodigo(tipoPelagem);
    }

    private String lerNomeDono(Scanner scanner) {
        System.out.print("Nome do dono: ");
        return scanner.nextLine();
    }
}