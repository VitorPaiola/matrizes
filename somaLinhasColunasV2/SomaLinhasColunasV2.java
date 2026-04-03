package somaLinhasColunasV2;

import java.util.Random;
import java.util.Scanner;

/*
 * Faça um programa que preencha uma matriz NxN
 * com números aleatórios e exiba a soma dos valores
 * presentes em cada linha e em cada coluna.
*/

public class SomaLinhasColunasV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoMatriz = tamanhoMatriz(entrada);

        int[][] numeros = new int[tamanhoMatriz][tamanhoMatriz];

        elementosDaMatriz(numeros);

        int[] somarLinhas = somarLinhasMatriz(numeros);
        int[] somarColunas = somarColunasMatriz(numeros);

        imprimirMatriz(numeros);

        imprimirSoma(somarLinhas, somarColunas);

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

    public static void elementosDaMatriz(int[][] numeros) {
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    public static int[] somarLinhasMatriz(int[][] numeros) {
        int[] somarLinhas = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                somarLinhas[i] += numeros[i][j];
            }
        }
        return somarLinhas;
    }

    public static int[] somarColunasMatriz(int[][] numeros) {
        int[] somarColunas = new int[numeros.length];
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
