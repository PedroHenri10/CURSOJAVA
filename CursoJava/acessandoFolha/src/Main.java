import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int tentativas = 3;

        logar(tentativas);
    }

    static void logar(int tentativas){
        Scanner sc = new Scanner(System.in);

        String senhaBD = "senhacorreta";
        String usuarioBD = "usuario1";

        if(tentativas == 0){
            System.out.println("Conta bloqueada! volte mais tarde!");
            return;
        }

        System.out.println("Digite o nome de usuário: ");
        String usuario = sc.nextLine();

        System.out.println("Senha: ");
        String senha = sc.nextLine();

        if(usuario.equals(usuarioBD) && senha.equals(senhaBD)){
            System.out.println("Acessando folha de pagamento");
            return;
        }else{
            System.out.println("Usuário ou senha erradas");
            System.out.println();
            tentativas--;
        }

        logar(tentativas);
    }
}