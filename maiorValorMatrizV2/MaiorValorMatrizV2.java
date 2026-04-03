package maiorValorMatrizV2;

import java.util.Scanner;

/*
 * Faça um programa que preencha uma matriz
 * NxN com números inteiros e exiba o maior valor
 * da matriz e a posição em que ele se encontra.
*/

public class MaiorValorMatrizV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoMatriz = tamanhoMatriz(entrada);

        int[][] numeros = new int[tamanhoMatriz][tamanhoMatriz];

        elementoDaMatriz(numeros, entrada);

        int[] maiorValorPosicao = maiorValorPosicao(numeros);

        imprimirMatriz(numeros, maiorValorPosicao);

        entrada.close();
    }

    public static int tamanhoMatriz(Scanner entrada) {
        return solicitarValor("Digite o tamanho da matriz quadrada (N): ", entrada);
    }

    public static void elementoDaMatriz(int[][] numeros, Scanner entrada) {
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

    public static int[] maiorValorPosicao(int[][] numeros) {
        int maiorValor = numeros[0][0];
        int[] posicao = new int[2];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] > maiorValor) {
                    maiorValor = numeros[i][j];
                    posicao[0] = i;
                    posicao[1] = j;
                }
            }
        }
        return posicao;
    }

    public static void imprimirMatriz(int[][] numeros, int[] maiorValorPosicao) {
        System.out.println("\nMatriz:");
        for (int[] numero : numeros) {
            System.out.print("| ");
            for (int valor : numero) {
                System.out.printf("%3d ", valor);
            }
            System.out.println("|");
        }
        System.out.println("\nMaior valor da matriz: " + numeros[maiorValorPosicao[0]][maiorValorPosicao[1]]);
        System.out.println("Posicao: [" + maiorValorPosicao[0] + "][" + maiorValorPosicao[1] + "]");
    }
}
