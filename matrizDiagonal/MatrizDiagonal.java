package matrizDiagonal;

import java.util.Scanner;

/*
 * Faça um programa que leia uma matriz 4x4 e
 * verifique se ela é uma matriz diagonal, isto é, se todos os
 * elementos fora da diagonal principal são iguais a zero.
*/

public class MatrizDiagonal {
    private static final int TAM_MATRIZ = 4;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[TAM_MATRIZ][TAM_MATRIZ];

        criarMatriz(matriz, entrada);

        boolean diagonal = verificarDiagonal(matriz);

        imprimirResultados(matriz, diagonal);

        entrada.close();
    }

    public static void criarMatriz(int[][] matriz, Scanner entrada) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = solicitarValor("Digite o valor para a posicao [" + i + "][" + j + "]: ", entrada);
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
                    System.out.println("Entrada invalida. Digite um numero positivo maior que zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static boolean verificarDiagonal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void imprimirResultados(int[][] matriz, boolean diagonal) {
        System.out.println("\nMatriz Inserida:");
        for (int[] numero : matriz) {
            System.out.print("| ");
            for (int valor : numero) {
                System.out.printf("%3d ", valor);
            }
            System.out.println("|");
        }
        System.out.println("\n" + (diagonal ? "A matriz e uma matriz diagonal." : "A matriz nao e uma matriz diagonal."));
    }
}
