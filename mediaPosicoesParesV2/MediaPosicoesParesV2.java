package mediaPosicoesParesV2;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia uma matriz NxN e
 * calcule a média dos valores presentes nas posições
 * pares (soma dos índices pares) da matriz.
*/

public class MediaPosicoesParesV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoMatriz = tamanhoMatriz(entrada);

        int[][] numeros = new int[tamanhoMatriz][tamanhoMatriz];

        elementosDaMatriz(numeros, entrada);

        double media = calcularMediaPosicoesPares(numeros);

        imprimirMatriz(numeros, media);

        entrada.close();
    }

    public static int tamanhoMatriz(Scanner entrada) {
        return solicitarValor("Digite o tamanho da matriz quadrada (N >= 1): ", entrada);
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
                if (numero >= 1) {
                    return numero;
                } else {
                    System.out.println("Entrada invalida. Digite um numero positivo maior que zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void elementosDaMatriz(int[][] numeros, Scanner entrada) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = solicitarValor("Digite o valor para a posicao [" + i + "][" + j + "]: ", entrada);
            }
        }
    }

    public static double calcularMediaPosicoesPares(int[][] numeros) {
        int soma = 0;
        int contador = 0;

        System.out.println("\nValores considerados para a media:");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.printf("Posicao [%d][%d]: %d%n", i, j, numeros[i][j]);
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
                System.out.printf("%3d ", valor);
            }
            System.out.println("|");
        }
        System.out.printf(Locale.US,"%nMedia dos valores nas posicoes pares: %.2f%n", media);
    }
}
