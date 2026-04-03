package somaMatrizes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Faça um programa que leia duas matrizes
 * 2x2 e exiba a soma das duas matrizes.
*/

public class SomaMatrizes {
    private static final int TAM_MATRIZ = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz1 = new int[TAM_MATRIZ][TAM_MATRIZ];
        int[][] matriz2 = new int[TAM_MATRIZ][TAM_MATRIZ];
        Set<Integer> valoresInseridos = new HashSet<>();

        System.out.println("MATRIZ 1");
        lerMatriz(matriz1, entrada, valoresInseridos);

        System.out.println("\nMATRIZ 2");
        lerMatriz(matriz2, entrada, valoresInseridos);

        int[][] soma = somarMatrizes(matriz1, matriz2);

        System.out.println("\nSoma das Matrizes:");
        imprimirMatriz(soma);

        entrada.close();
    }

    public static void lerMatriz(int[][] matriz, Scanner entrada, Set<Integer> valoresInseridos) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = solicitarValor("Digite o valor para a posicao [" + i + "][" + j + "]: ", entrada, valoresInseridos);
            }
        }
    }

    public static int solicitarValor(String mensagem, Scanner entrada, Set<Integer> valoresInseridos) {
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
                if (numero <= 0) {
                    System.out.println("Entrada invalida. Digite um numero positivo e diferente de zero.");
                    continue;
                }
                if (valoresInseridos.contains(numero)) {
                    System.out.println("Numero duplicado! Digite um numero diferente.");
                    continue;
                }
                valoresInseridos.add(numero);
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] soma = new int[TAM_MATRIZ][TAM_MATRIZ];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return soma;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] numero : matriz) {
            System.out.print("| ");
            for (int valor : numero) {
                System.out.printf("%3d ", valor);
            }
            System.out.println("|");
        }
    }
}
