package aulaArray;
import java.util.Scanner;

public class AulaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array de Strings (nomes dos alunos)
        String[] alunos = new String[4];
        
        //alunos[0] = "jose";
        //alunos[1] = "joão";
        //alunos[2] = "Maria";
        //System.out.printLn(alunos[0]);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os nomes dos alunos:");
        for (int i = 0; i < 4; i++) {
            alunos[i] = input.nextLine();
        }
        
        for (int i = 0; i < 4; i++) {
        	System.out.println(alunos[i]);
        }

        int[] notas = {5, 7, 8, 4, 9, 5, 6, 7, 2, 10};

        int maior = notas[0];
        int menor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if(notas[i]<menor) {
            	menor = notas[i];
            }
        }
        System.out.println("Maior nota: " + maior);
        System.out.println("menor nota: " + menor);

        
        int n = notas.length;
        int[] notasCrescente = new int[n];
        for (int i = 0; i < n; i++) {
            notasCrescente[i] = notas[i]; 
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (notasCrescente[j] > notasCrescente[j + 1]) {
                    int temp = notasCrescente[j];
                    notasCrescente[j] = notasCrescente[j + 1];
                    notasCrescente[j + 1] = temp;
                }
            }
        }
        System.out.print("Notas em ordem crescente: ");
        for (int i = 0; i < n; i++) {
            System.out.print(notasCrescente[i] + (i < n - 1 ? ", " : "")); 
        }
        System.out.println();
        
        
        int[] notasDecrescente = new int[n];
        for (int i = 0; i < n; i++) {
            notasDecrescente[i] = notas[i]; 
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (notasDecrescente[j] < notasDecrescente[j + 1]) {
                    int temp = notasDecrescente[j];
                    notasDecrescente[j] = notasDecrescente[j + 1];
                    notasDecrescente[j + 1] = temp;
                }
            }
        }
        System.out.print("Notas em ordem decrescente: ");
        for (int i = 0; i < n; i++) {
            System.out.print(notasDecrescente[i] + (i < n - 1 ? ", " : "")); 
        }
        System.out.println();

        double soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        System.out.println("Média das notas: " + media);

        input.close();
	}

}
