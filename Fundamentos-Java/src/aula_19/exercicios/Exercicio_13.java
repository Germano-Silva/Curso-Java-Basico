package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_13
 * 
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que
 * determine a soma dos elementos armazenados neste vetor que são múltiplos de
 * 5.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_13 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];

			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe com o valor da posição: " + i);
				a[i] = scan.nextInt();

			}
			int soma = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 5 == 0) {
					soma += a[i];
					System.out.print(a[i] + " ");
				}

			}
			System.out.println("Soma = " + soma);
		}

	}

}
