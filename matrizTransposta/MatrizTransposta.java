package matrizTransposta;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 * Faça um programa que preencha uma matriz 4x4
 * com valores aleotórios e exiba a matriz transposta.
*/

public class MatrizTransposta {
    private static final int TAM_MATRIZ = 4;

    public static void main(String[] args) {
        int[][] numeros = new int[TAM_MATRIZ][TAM_MATRIZ];
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDaMatriz(numeros, valoresInseridos);

        System.out.println("Matriz Original:");
        imprimirMatriz(numeros);

        System.out.println("\nMatriz Transposta:");
        int[][] transposta = matrizTransposta(numeros);
        
        imprimirMatriz(transposta);
    }

    public static void elementosDaMatriz(int[][] numeros, Set<Integer> valoresInseridos) {
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                int numero;
                do {
                    numero = random.nextInt(100) + 1;
                } while (valoresInseridos.contains(numero));
                valoresInseridos.add(numero);
                numeros[i][j] = numero;
            }
        }
    }

    public static int[][] matrizTransposta(int[][] numeros) {
        int[][] transposta = new int[TAM_MATRIZ][TAM_MATRIZ];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                transposta[j][i] = numeros[i][j];
            }
        }
        return transposta;
    }

    public static void imprimirMatriz(int[][] numeros) {
        for (int[] numero : numeros) {
            System.out.print("| ");
            for (int valor : numero) {
                System.out.printf("%3d ", valor);
            }
            System.out.println("|");
        }
    }
}
