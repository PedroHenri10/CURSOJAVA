package org.example.app;
import java.util.Scanner;
import java.util.LinkedList;

import org.example.model.Cliente;
import org.example.model.Equipamento;
import org.example.model.Notebook;
import org.example.model.OrdemServico;
import org.example.model.Smartphone;
import org.example.model.Tablet;
import org.example.service.Autentificador;
import org.example.pagamento.*;
import org.example.exceptions.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Autentificador auth = new Autentificador();

        LinkedList<OrdemServico> listaOS = new LinkedList<>();

        try {
            System.out.print("Login: ");
            String log = sc.nextLine();
            auth.validarLogin(log);

            System.out.print("Senha: ");
            String sen = sc.nextLine();
            auth.validarSenha(sen);

            int opcao;

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1 - Abrir nova ordem");
                System.out.println("2 - Adicionar equipamento");
                System.out.println("3 - Listar ordens");
                System.out.println("4 - Encerrar ordem");
                System.out.println("5 - Cancelar ordem");
                System.out.println("0 - Sair");

                opcao = sc.nextInt();

                switch (opcao) {

                    case 1:
                        OrdemServico nova = new OrdemServico();
                        listaOS.add(nova);
                        System.out.println("Ordem criada com ID: " + nova.getId());
                        break;

                    case 2:
                        System.out.print("ID da ordem: ");
                        int idAdd = sc.nextInt();
                        sc.nextLine();

                        OrdemServico osAdd = buscarOS(listaOS, idAdd);

                        System.out.println("1-Notebook 2-Smartphone 3-Tablet");
                        int tipo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Marca: ");
                        String marca = sc.nextLine();

                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();

                        System.out.print("Valor base: ");
                        double valor = sc.nextDouble();

                        if (tipo == 1) {
                            System.out.print("Tem SSD? (true/false): ");
                            boolean ssd = sc.nextBoolean();

                            osAdd.adicionarEquipamento(
                                    new Notebook(marca, modelo, valor, ssd)
                            );

                        } else if (tipo == 2) {
                            System.out.print("Quantidade de chips: ");
                            int chips = sc.nextInt();

                            osAdd.adicionarEquipamento(
                                    new Smartphone(marca, modelo, valor, chips)
                            );

                        } else {
                            System.out.print("Tem caneta? (true/false): ");
                            boolean caneta = sc.nextBoolean();

                            osAdd.adicionarEquipamento(
                                    new Tablet(marca, modelo, valor, caneta)
                            );
                        }

                        break;

                    case 3:
                        for (OrdemServico os : listaOS) {
                            System.out.println("\nID: " + os.getId() + " | Status: " + os.getStatus());
                            os.listarEquipamentos();
                        }
                        break;

                    case 4:
                        System.out.print("ID da ordem: ");
                        int idEnc = sc.nextInt();

                        OrdemServico osEnc = buscarOS(listaOS, idEnc);
                        osEnc.encerrar(new PagamentoPix());
                        break;

                    case 5:
                        System.out.print("ID da ordem: ");
                        int idCan = sc.nextInt();

                        OrdemServico osCan = buscarOS(listaOS, idCan);
                        osCan.cancelar();
                        break;
                }

            } while (opcao != 0);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }

    public static OrdemServico buscarOS(LinkedList<OrdemServico> lista, int id)
            throws EquipamentoNaoEncontradoException {

        for (OrdemServico os : lista) {
            if (os.getId() == id) {
                return os;
            }
        }

        throw new EquipamentoNaoEncontradoException("Ordem não encontrada!");
    }
}