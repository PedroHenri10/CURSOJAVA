import java.util.regex.Pattern;
import java.util.regex.Matcher;
class HelloWorld {
    public static void main(String[] args) {
        int valorTotal = 1391;
        //1391 / 200 = 6 | 191
        int qtdNota200 = valorTotal / 200;
        //191
        int restoNota200 = valorTotal % 200;
        //191 / 100 = 1 | 91
        int qtdNota100 = restoNota200 / 100;
        int restoNota100 = restoNota200 % 100;

        int qtdNota50 = restoNota100 / 50;
        int restoNota50 = restoNota100 % 50;
        int qtdNota20 = restoNota50 / 20;
        int restoNota20 = restoNota50 % 20;
        int qtdNota10 = restoNota20 / 10;
        int restoNota10 = restoNota20 % 10;
        int qtdNota5 = restoNota10 / 5;
        int restoNota5 = restoNota10 % 5;
        int qtdNota2 = restoNota5 / 2;
        int restoNota2 = restoNota5 % 2;
        int qtdNota1 = restoNota2 / 1;
        System.out.printf("Notas 200 = %d, Notas 100 = %d, Nota 50 = %d, notas 20 = %d, notas 10 = %d, notas 5 = %d, notas 2 = %d, notas 1 = %d",
                qtdNota200,
                qtdNota100,
                qtdNota50,
                qtdNota20,
                qtdNota10,
                qtdNota5,
                qtdNota2,
                qtdNota1
        );
    }
}