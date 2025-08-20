package aula_20.exercicios;

import java.util.Random;

/**
 * 1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
 * Após isso determine o maior número da matriz e a sua posição (linha, coluna).
 * 
 * @author Germano-Silva
 */

public class Exercicio_01 {

    public static void main(String[] args) {

        // Declaração de uma matriz 4x4
        int[][] matrizAleatoria = new int[4][4];

        // Objeto da classe Random para gerar números aleatórios
        Random numRandom = new Random();

        // Variáveis para armazenar o maior valor encontrado e sua posição
        int maior = Integer.MIN_VALUE;
        int linha = Integer.MIN_VALUE;
        int coluna = Integer.MIN_VALUE;

        // Percorrendo cada posição da matriz
        for (int i = 0; i < matrizAleatoria.length; i++) {
            for (int j = 0; j < matrizAleatoria[i].length; j++) {

                // Gera um número aleatório entre 0 e 9 e atribui à posição [i][j]
                matrizAleatoria[i][j] = numRandom.nextInt(10);

                // Imprime o valor gerado na mesma linha
                System.out.print(matrizAleatoria[i][j] + " ");

                // Atualiza o maior valor e sua posição, se necessário
                if (matrizAleatoria[i][j] > maior) {
                    maior = matrizAleatoria[i][j];
                    linha = i;
                    coluna = j;
                }
            }
            // Quebra de linha após cada linha da matriz para formatação correta
            System.out.println();
        }

        // Exibe o maior valor encontrado e sua posição na matriz
        System.out.println("Maior valor = " + maior);
        System.out.println("Linha do maior valor = " + linha);
        System.out.println("Coluna do maior valor = " + coluna);
    }
}
