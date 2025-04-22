public class Main {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente();
        Conta conta2 = new ContaPoupanca();

        conta1.depositar(1000);
        conta2.depositar(500);

        System.out.println("Após depósitos:");
        System.out.println(conta1);
        System.out.println(conta2);

        conta1.sacar(200);
        conta1.transferir(300, conta2);

        System.out.println("\nApós saque e transferência:");
        System.out.println(conta1);
        System.out.println(conta2);
    }
}
