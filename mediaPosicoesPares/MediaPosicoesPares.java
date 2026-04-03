package mediaPosicoesPares;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia uma matriz 3x3 e
 * calcule a média dos valores presentes nas posições
 * pares (soma dos índices pares) da matriz.
*/

public class MediaPosicoesPares {
    private static final int TAM_MATRIZ = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] numeros = new int[TAM_MATRIZ][TAM_MATRIZ];

        elementosDaMatriz(numeros, entrada);

        double media = calcularMediaPosicoesPares(numeros);

        imprimirMatriz(numeros, media);

        entrada.close();
    }

    public static void elementosDaMatriz(int[][] numeros, Scanner entrada) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = solicitarValor("Digite o valor para a posicao [" + i + "][" + j + "]: ", entrada);
            }
        }
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int numero;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                numero = Integer.parseInt(input);
                if (numero >= 0) {
                    return numero;
                } else {
                    System.out.println("Entrada invalida. Digite um numero positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static double calcularMediaPosicoesPares(int[][] numeros) {
        int soma = 0;
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    soma += numeros[i][j];
                    contador++;
                }
            }
        }
        return (contador > 0) ? (double) soma / contador : 0;
    }

    public static void imprimirMatriz(int[][] numeros, double media) {
        System.out.println("\nMatriz:");
        for (int[] numero : numeros) {
            System.out.print("| ");
            for (int valor : numero) {
                System.out.printf("%3d", valor);
            }
            System.out.println("|");
        }
        System.out.printf(Locale.US,"\nMedia dos valores nas posicoes pares: %.2f\n", media);
    }
}
