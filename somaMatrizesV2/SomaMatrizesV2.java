package somaMatrizesV2;

import java.util.Scanner;

/*
 * Faça um programa que leia matrizes
 * NxN e exiba a soma das duas matrizes.
*/

public class SomaMatrizesV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoMatriz = tamanhoMatriz(entrada);

        int[][] matriz1 = new int[tamanhoMatriz][tamanhoMatriz];
        int[][] matriz2 = new int[tamanhoMatriz][tamanhoMatriz];

        System.out.println("MATRIZ 1");
        lerMatriz(matriz1, entrada);

        System.out.println("\nMATRIZ 2");
        lerMatriz(matriz2, entrada);

        int[][] soma = somarMatrizes(matriz1, matriz2);

        System.out.println("\nSoma das Matrizes:");
        imprimirMatriz(soma);

        entrada.close();
    }

    public static int tamanhoMatriz(Scanner entrada) {
        return solicitarValor("Digite o tamanho da matriz quadrada (N): ", entrada);
    }

    public static void lerMatriz(int[][] matriz, Scanner entrada) {
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
                if (numero > 0) {
                    return numero;
                } else {
                    System.out.println("Entrada invalida. Digite um numero positivo e diferente de zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] soma = new int[matriz1.length][matriz1.length];
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
