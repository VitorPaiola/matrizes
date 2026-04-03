package somaLinhasColunas;

import java.util.Random;

/*
 * Faça um programa que preencha uma matriz 4x4
 * com números aleatórios e exiba a soma dos valores
 * presentes em cada linha e em cada coluna.
*/

public class SomaLinhaColunas {
    private static final int TAM_MATRIZ = 4;

    public static void main(String[] args) {
        int[][] numeros = new int[TAM_MATRIZ][TAM_MATRIZ];

        elementosDaMatriz(numeros);

        int[] somarLinhas = somarLinhasMatriz(numeros);
        int[] somarColunas = somarColunasMatriz(numeros);

        imprimirMatriz(numeros);

        imprimirSoma(somarLinhas, somarColunas);
    }

    public static void elementosDaMatriz(int[][] numeros) {
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    public static int[] somarLinhasMatriz(int[][] numeros) {
        int[] somarLinhas = new int[TAM_MATRIZ];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                somarLinhas[i] += numeros[i][j];
            }
        }
        return somarLinhas;
    }

    public static int[] somarColunasMatriz(int[][] numeros) {
        int[] somarColunas = new int[TAM_MATRIZ];
        for (int j = 0; j < numeros.length; j++) {
            for (int i = 0; i < numeros[j].length; i++) {
                somarColunas[j] += numeros[i][j];
            }
        }
        return somarColunas;
    }

    public static void imprimirMatriz(int[][] numeros) {
        System.out.println("Matriz Gerada:");
        for (int[] numero : numeros) {
            System.out.print("| ");
            for (int valor : numero) {
                System.out.printf("%3d ", valor);
            }
            System.out.println("|");
        }
    }

    public static void imprimirSoma(int[] somarLinhas, int[] somarColunas) {
        System.out.println("\nSoma das linhas:");
        for (int i = 0; i < somarLinhas.length; i++) {
            System.out.printf("Linha %d: %d%n", i, somarLinhas[i]);
        }

        System.out.println("\nSoma das Colunas:");
        for (int j = 0; j < somarLinhas.length; j++) {
            System.out.printf("Coluna %d: %d%n", j, somarColunas[j]);
        }
    }
}
