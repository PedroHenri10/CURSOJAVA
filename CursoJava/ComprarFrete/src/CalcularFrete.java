import java.util.Scanner;
public class CalcularFrete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite valor compra: ");

        int compra = scanner.nextInt();
        System.out.print("Digite uma opção: \n" +
                "1: Continuar compra\n" +
                "2: Finalizar compra");

        int op = scanner.nextInt();

        if (op == 1) {
            System.out.println("Continuar comprando...");
        } else if (op == 2) {
            int frete = 10;
            System.out.println("Valor frete: " + frete);
            int valorTotal = frete + compra;
        }else{
            System.out.println("Não existe essa opção...");
        }

        //System.out.println("Valor frete: " + frete);
        //tentar usar o frete fora do escopo aparece esse mensagem de erro: Cannot resolve symbol 'frete'
    }
}