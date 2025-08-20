package aula_20.exercicios;

import java.util.Random;

/**
 * 2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9.
 * Após isso indique qual é o maior e o menor valor da linha 5 e
 * qual é o maior e o menor valor da coluna 7.
 * 
 * @author Germano-Silva
 */

public class Exercicio_02 {
    public static void main(String[] args) {
        // Declaração de uma matriz 10x10
        int[][] matrizAleatoria = new int[10][10];

        // Objeto da classe Random para gerar números aleatórios
        Random numRandom = new Random();

        // ETAPA 1: POPULAR A MATRIZ COM VALORES ALEATÓRIOS
        System.out.println("Matriz 10x10 gerada:");
        for (int i = 0; i < matrizAleatoria.length; i++) {
            for (int j = 0; j < matrizAleatoria[i].length; j++) {
                // Gera um número aleatório entre 0 e 9 e atribui à posição [i][j]
                matrizAleatoria[i][j] = numRandom.nextInt(10);

                // Imprime o valor gerado formatado
                System.out.print(matrizAleatoria[i][j] + " ");
            }
            // Quebra de linha após cada linha da matriz
            System.out.println();
        }

        // ETAPA 2: ENCONTRAR MAIOR E MENOR VALOR DA LINHA 5
        // Inicializa com o primeiro elemento da linha 5 para garantir valores válidos
        int maiorLinha5 = matrizAleatoria[5][0];
        int menorLinha5 = matrizAleatoria[5][0];

        // Percorre todos os elementos da linha 5 (índice 5)
        for (int j = 0; j < matrizAleatoria[5].length; j++) {
            // Verifica se o elemento atual é maior que o maior encontrado até agora
            if (matrizAleatoria[5][j] > maiorLinha5) {
                maiorLinha5 = matrizAleatoria[5][j];
            }
            // Verifica se o elemento atual é menor que o menor encontrado até agora
            if (matrizAleatoria[5][j] < menorLinha5) {
                menorLinha5 = matrizAleatoria[5][j];
            }
        }

        // ETAPA 3: ENCONTRAR MAIOR E MENOR VALOR DA COLUNA 7
        // Inicializa com o primeiro elemento da coluna 7 para garantir valores válidos
        int maiorColuna7 = matrizAleatoria[0][7];
        int menorColuna7 = matrizAleatoria[0][7];

        // Percorre todos os elementos da coluna 7 (índice 7)
        for (int i = 0; i < matrizAleatoria.length; i++) {
            // Verifica se o elemento atual é maior que o maior encontrado até agora
            if (matrizAleatoria[i][7] > maiorColuna7) {
                maiorColuna7 = matrizAleatoria[i][7];
            }
            // Verifica se o elemento atual é menor que o menor encontrado até agora
            if (matrizAleatoria[i][7] < menorColuna7) {
                menorColuna7 = matrizAleatoria[i][7];
            }
        }

        // ETAPA 4: EXIBIR OS RESULTADOS
        System.out.println("\n----- RESULTADOS -----");
        System.out.println("Maior valor da linha 5 = " + maiorLinha5);
        System.out.println("Menor valor da linha 5 = " + menorLinha5);
        System.out.println("Maior valor da coluna 7 = " + maiorColuna7);
        System.out.println("Menor valor da coluna 7 = " + menorColuna7);
    }
}