package somaDiagonalPrincipal;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Faça um programa que preencha uma matriz
 * 3x3 com valores informados pelo usuário e exiba a
 * soma dos valores da diagonal principal.
*/

public class SomaDiagonalPrincipal {
    private static final int TAM_MATRIZ = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] numeros = new int[TAM_MATRIZ][TAM_MATRIZ];
        Set<Integer> valoresInseridos = new HashSet<>();

        elementosDaMatriz(numeros, entrada, valoresInseridos);

        int soma = somaDiagonal(numeros);

        imprimirResultados(numeros, soma);

        entrada.close();
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

    public static void elementosDaMatriz(int[][] numeros, Scanner entrada, Set<Integer> valoresInseridos) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = solicitarValor("Digite o valor para a posicao [" + i + "][" + j + "]: ", entrada, valoresInseridos);
            }
        }
    }

    public static int somaDiagonal(int[][] numeros) {
        int somaDiagonal = 0;
        for (int i = 0; i < TAM_MATRIZ; i++) {
            somaDiagonal += numeros[i][i];
        }
        return somaDiagonal;
    }

    public static void imprimirResultados(int[][] numeros, int soma) {
        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < TAM_MATRIZ; i++) {
            System.out.print("| ");
            for (int j = 0; j < TAM_MATRIZ; j++) {
                System.out.printf("%2d ", numeros[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("\nSoma da diagonal principal: " + soma);
    }
}
