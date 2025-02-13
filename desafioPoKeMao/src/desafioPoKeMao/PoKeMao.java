package desafioPoKeMao;

import java.util.Scanner;

public class PoKeMao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite Número de doces disponíveis entre 1 a 1000: ");
        int N = scanner.nextInt(); 
        System.out.println("digite Doces necessários para a evolucao primeira pô-que-mão entre 1 a 1000: ");
        int X = scanner.nextInt(); 
        System.out.println("digite Doces necessários para a evolucao segunda pô-que-mão entre 1 a 1000: ");
        int Y = scanner.nextInt(); 
        System.out.println("digite Doces necessários para a evolucao terceira pô-que-mão entre 1 a 1000: ");
        int Z = scanner.nextInt(); 

        int pokemao = 0; 

        
        if (X <= Y) {
            if (X <= Z) {
                if (N >= X) {
                    N -= X;
                    pokemao++;
                }
                if (Y <= Z) {
                    if (N >= Y) {
                        N -= Y;
                        pokemao++;
                    }
                    if (N >= Z) {
                        N -= Z;
                        pokemao++;
                    }
                } else {
                    if (N >= Z) {
                        N -= Z;
                        pokemao++;
                    }
                    if (N >= Y) {
                        N -= Y;
                        pokemao++;
                    }
                }
            }
        }

        if (Y <= X) {
            if (Y <= Z) {
                if (N >= Y) {
                    N -= Y;
                    pokemao++;
                }
                if (X <= Z) {
                    if (N >= X) {
                        N -= X;
                        pokemao++;
                    }
                    if (N >= Z) {
                        N -= Z;
                        pokemao++;
                    }
                } else {
                    if (N >= Z) {
                        N -= Z;
                        pokemao++;
                    }
                    if (N >= X) {
                        N -= X;
                        pokemao++;
                    }
                }
            }
        }

        if (Z <= X) {
            if (Z <= Y) {
                if (N >= Z) {
                    N -= Z;
                    pokemao++;
                }
                if (X <= Y) {
                    if (N >= X) {
                        N -= X;
                        pokemao++;
                    }
                    if (N >= Y) {
                        N -= Y;
                        pokemao++;
                    }
                } else {
                    if (N >= Y) {
                        N -= Y;
                        pokemao++;
                    }
                    if (N >= X) {
                        N -= X;
                        pokemao++;
                    }
                }
            }
        }

        System.out.println(pokemao);
    }
}