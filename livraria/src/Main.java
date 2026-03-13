import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int lerOpMenu(Scanner sc){
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    public static final int REGISTRAR_LIVRO = 1;
    public static final int REGISTRAR_REVISTA = 2;
    public static final int REGISTRAR_DVD = 3;
    public static final int EMPRESTAR_ITEM = 4;
    public static final int DEVOLVER_ITEM_INFO_DIAS_ATRASO = 5;
    public static final int LISTAR_ITENS = 6;
    public static final int MOSTRAR_VALOR_ARRECARDADO = 7;
    public static final int MOSTRAR_TOTAL_ITENS = 8;
    public static final int ENCERRAR = 0;

    public static void mostrarMenu(){
        System.out.println("================================================================");
        System.out.println("1- Registrar livro (Código, Título ,Ano de publicação, Autor)");
        System.out.println("2- Registrar revista (Código, Título ,Ano de publicação, Edição)");
        System.out.println("3- Registrar DVD(Código, Título ,Ano de publicação, Duração em minutos)");
        System.out.println("4- Emprestar item por código ");
        System.out.println("5- Devolver item e informar dias de atraso");
        System.out.println("6- Listar itens cadastrados");
        System.out.println("7- Mostrar valor total arrecadado com multas");
        System.out.println("8- Mostrar total de itens cadastrados");
        System.out.println("0- Encerrar");
    }

    public static String[] lerValoresItens(Scanner sc){
        System.out.println("Digite o código do item");
        String codigo = sc.nextLine();
        System.out.println("Digite o titulo do item");
        String titulo = sc.nextLine();
        System.out.println("Digite o ano de publicação do item");
        String anoPublicado = sc.nextLine();

        return new String[]{codigo, titulo, anoPublicado};
    }

    public static void executarMenu(Biblioteca biblioteca, Scanner sc){
        int op = -1;
        do{
            mostrarMenu();
            op = lerOpMenu(sc);
            String codigoRecebido;
            String tituloRecebido;
            int anoRecebido;

            switch (op){

                case REGISTRAR_LIVRO:
                    String[] dadosLivro = lerValoresItens(sc);

                    codigoRecebido = dadosLivro[0];
                    tituloRecebido = dadosLivro[1];
                    anoRecebido = Integer.parseInt(dadosLivro[2]);
                    System.out.println("Digite o nome do autor");
                    String autor = sc.nextLine();
                    ItemBiblioteca livro = new Livro(codigoRecebido, tituloRecebido, anoRecebido, autor);
                    biblioteca.cadastrarItem(livro);
                    break;
                case REGISTRAR_REVISTA:
                    String[] dadosRevista = lerValoresItens(sc);
                    codigoRecebido = dadosRevista[0];
                    tituloRecebido = dadosRevista[1];
                    anoRecebido = Integer.parseInt(dadosRevista[2]);
                    System.out.println("Digite a edição");
                    int edicaoRecebida = sc.nextInt();
                    sc.nextLine();
                    ItemBiblioteca revista = new Revista(codigoRecebido, tituloRecebido, anoRecebido, edicaoRecebida);
                    biblioteca.cadastrarItem(revista);
                    break;
                case REGISTRAR_DVD:
                    String[] dados = lerValoresItens(sc);
                    codigoRecebido = dados[0];
                    tituloRecebido = dados[1];
                    anoRecebido = Integer.parseInt(dados[2]);
                    System.out.println("Digite a duração em minutos do dvd");
                    int duracaoMinutos = sc.nextInt();
                    sc.nextLine();
                    ItemBiblioteca dvd = new Dvd(codigoRecebido, tituloRecebido, anoRecebido, duracaoMinutos);
                    biblioteca.cadastrarItem(dvd);
                    break;
                case EMPRESTAR_ITEM:
                    System.out.println("Quantida de itens para emprestimo");
                    int qtdItensEmprestado = sc.nextInt();
                    sc.nextLine();

                    if(qtdItensEmprestado == 1) {
                        System.out.println("Insira o código do item para emprestar");
                        String codigoParaEmprestar = sc.nextLine();
                        biblioteca.emprestarItem(codigoParaEmprestar);
                        break;
                    }else{
                        String[] codigos = new String[qtdItensEmprestado];
                        for(int i = 0; i<qtdItensEmprestado;i++){
                            System.out.println("Insira o código do item para emprestar");
                            codigos[i] = sc.nextLine();
                        }
                        biblioteca.emprestarItem(codigos);
                    }
                    break;
                case DEVOLVER_ITEM_INFO_DIAS_ATRASO:
                    System.out.println("Digite o código do produto a ser devolvido");
                    String codigo = sc.nextLine();
                    int diasAtraso = -1;
                    do {
                        System.out.println("Digite 0 se foi entregue no dia ou antes, se não, digite os dias de atraso");
                        diasAtraso = sc.nextInt();
                        sc.nextLine();
                    }while (diasAtraso < 0);
                    biblioteca.devolverItem(codigo, diasAtraso);
                    break;
                case LISTAR_ITENS:
                        biblioteca.listarIItens();
                    break;
                case MOSTRAR_VALOR_ARRECARDADO:
                        System.out.printf("Total arrecardado: R$ %.2f", biblioteca.getTotalMultasArrecadadas());
                        System.out.println();
                    break;
                case MOSTRAR_TOTAL_ITENS:
                        System.out.println("Total de itens cadastrados: " + ItemBiblioteca.getTotalItensCadastrados());
                    break;
                case ENCERRAR:
                    System.out.println("encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(op !=0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarMenu();
        Biblioteca biblioteca = new Biblioteca();
        executarMenu(biblioteca, sc);
    }
}