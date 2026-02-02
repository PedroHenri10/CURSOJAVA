import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Locale.setDefault(new Locale("pt", "BR"));
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.getDefault());

            String pesoString = sc.nextLine();
            String limpa = pesoString.replaceAll("[^0-9,]", "");
            String pesoPadrao = limpa.replaceAll(",", ".");
            float peso = Float.parseFloat(pesoPadrao);

            String alturaString = sc.nextLine();
            String limpa2 = alturaString.replaceAll("[^0-9,]", "");
            String alturaPadrao = limpa2.replaceAll(",", ".");
            float altura = Float.parseFloat(alturaPadrao);

            float imc = peso / (altura * altura);
            System.out.printf("IMC: %.2f\n", imc);

            if (imc < 18.5) {
                System.out.println("Classificação: Abaixo do peso");
            } else if (imc >= 18.5 && imc < 25) {
                System.out.println("Classificação: Peso normal");
            } else if (imc >= 25 && imc < 30) {
                System.out.println("Classificação: Sobrepeso");
            } else if (imc >= 30 && imc < 35) {
                System.out.println("Classificação: Obesidade grau I");
            }else if( imc >= 35 && imc < 40){
                System.out.println("Classificação: Obesidade grau II");
            }else{
                System.out.println("Classificação: Obesidade grau III");
            }

    }
    }
