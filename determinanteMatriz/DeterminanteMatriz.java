package determinanteMatriz;

import java.util.Scanner;

/*
 * Faça um programa que leia uma matriz 3x3
 * e calcule o determinante da matriz.
*/

public class DeterminanteMatriz {
    private static final int TAM_MATRIZ = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] numeros = new int[TAM_MATRIZ][TAM_MATRIZ];

        elementosDaMatriz(numeros, entrada);

        int determinante = determinanteMatriz(numeros);

        imprimirDeterminante(numeros, determinante);

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

    public static int determinanteMatriz(int[][] numeros) {
        return numeros[0][0] * (numeros[1][1] * numeros[2][2] - numeros[1][2] * numeros[2][1])
                - numeros[0][1] * (numeros[1][0] * numeros[2][2] - numeros[1][2] * numeros[2][0])
                + numeros[0][2] * (numeros[1][0] * numeros[2][1] - numeros[1][1] * numeros[2][0]);
    }

    public static void imprimirDeterminante(int[][] numeros, int determinante) {
        System.out.println("\nMatriz Inserida:");
        for (int[] numero : numeros) {
            System.out.print("| ");
            for (int valor : numero) {
                System.out.printf("%3d ", valor);
            }
            System.out.println("|");
        }
        System.out.println("\nDeterminante da matriz: " + determinante);
    }
}
