package matrizTranspostaV2;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*
 * Faça um programa que preencha uma matriz NxN
 * com valores aleatórios e exiba a matriz transposta.
*/

public class MatrizTranspostaV2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoMatriz = tamanhoMatriz(scanner);

        int[][] numeros = new int[tamanhoMatriz][tamanhoMatriz];
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDaMatriz(numeros, valoresInseridos);

        System.out.println("\nMatriz Original:");
        imprimirMatriz(numeros);

        System.out.println("\nMatriz Transposta:");
        int[][] transposta = matrizTransposta(numeros);
        imprimirMatriz(transposta);

        scanner.close();
    }

    public static int tamanhoMatriz(Scanner entrada) {
        int tamanho;
        while (true) {
            System.out.print("Digite o tamanho da matriz quadrada (N): ");
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                tamanho = Integer.parseInt(input);
                if (tamanho > 0) {
                    return tamanho;
                } else {
                    System.out.println("Entrada invalida. Digite um numero positivo e diferente de zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
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
        int[][] transposta = new int[numeros.length][numeros.length];
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
