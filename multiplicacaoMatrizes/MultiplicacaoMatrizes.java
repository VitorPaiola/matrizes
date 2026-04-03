package multiplicacaoMatrizes;

import java.util.Scanner;

/*
 * Faça um programa que leia duas matrizes e dê como resposta
 * a multiplicação entre elas. O programa deverá observar se é
 * possível ou não realizar a multiplicação entre as duas matrizes.
*/

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matrizA = criarMatriz("primeira", entrada);
        int[][] matrizB = criarMatriz("segunda", entrada);

        if (verificarMultiplicacao(matrizA, matrizB)) {
            int[][] produto = multiplicarMatrizes(matrizA, matrizB);
            imprimirResultados(matrizA, matrizB, produto);
        } else {
            System.out.println("\nMultiplicacao impossivel! O numero de colunas da primeira matriz deve ser igual ao numero de linhas da segunda.");
        }

        entrada.close();
    }

    public static int[][] criarMatriz(String nome, Scanner entrada) {
        System.out.println("\nDefinicao da " + nome + " matriz:");
        int linhas = solicitarValor("Digite o numero de linhas: ", entrada);
        int colunas = solicitarValor("Digite o numero de colunas: ", entrada);

        int[][] matriz = new int[linhas][colunas];
        System.out.println("\nPreenchendo a " + nome + " matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = solicitarValor("Digite o valor para a posicao [" + i + "][" + j + "]: ", entrada);
            }
        }
        return matriz;
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

    public static boolean verificarMultiplicacao(int[][] matrizA, int[][] matrizB) {
        return matrizA[0].length == matrizB.length;
    }

    public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhaA = matrizA.length;
        int colunaA = matrizA[0].length;
        int colunaB = matrizB[0].length;
        int[][] produto = new int[linhaA][colunaB];

        for (int i = 0; i < linhaA; i++) { // Percorre cada linha da matriz A.
            for (int j = 0; j < colunaB; j++) { // Percorre cada coluna da matriz B.
                for (int k = 0; k < colunaA; k++) { // Percorre cada elemento da linha A e da coluna B.
                    // ! matrizA[i][k] → Pega um elemento da linha da matriz A.
                    // ! matrizB[k][j] → Pega um elemento da coluna da matriz B.
                    produto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return produto;
    }

    public static void imprimirResultados(int[][] matrizA, int[][] matrizB, int[][] produto) {
        System.out.println("\nMatriz A:");
        imprimirMatriz(matrizA);
        System.out.println("\nMatriz B:");
        imprimirMatriz(matrizB);
        System.out.println("\nMatriz Produto (A x B):");
        imprimirMatriz(produto);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] numero : matriz) {
            System.out.print("| ");
            for (int valor : numero) {
                System.out.printf("%4d ", valor);
            }
            System.out.println("|");
        }
    }
}
