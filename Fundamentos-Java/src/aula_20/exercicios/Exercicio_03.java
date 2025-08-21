package aula_20.exercicios;

import java.util.Scanner;

/**
 * 3. Capture do teclado valores para preenchimento de uma matriz M 3x3.
 * Após a captura imprima a matriz criada e encontre a quantidade de
 * números pares e a quantidade de números ímpares.
 * 
 * @author Germano-Silva
 */

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Cria uma matriz 3x3 de inteiros
        int[][] num = new int[3][3];

        // Preenche a matriz com valores digitados pelo usuário
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "," + j + "]: ");
                num[i][j] = scan.nextInt();
            }
        }

        int qtdPares = 0;
        int qtdImpares = 0;

        // Percorre a matriz para contar números pares e ímpares
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) { // se for divisível por 2 → par
                    qtdPares++;
                } else { // caso contrário → ímpar
                    qtdImpares++;
                }
            }
        }

        // Imprime a matriz organizada
        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " "); // imprime na mesma linha
            }
            System.out.println(); // quebra de linha após cada linha da matriz
        }

        // Exibe os resultados finais
        System.out.println("\nQuantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);

        scan.close(); // fecha o scanner para evitar vazamentos de recurso
    }
}