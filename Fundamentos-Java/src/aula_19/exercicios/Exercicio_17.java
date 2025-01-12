package aula_19.exercicios;

import java.util.Scanner;

/**Exercicio_17
 * 
 * Ler um vetor A com 10 elementos inteiros correspondentes as idades
 * de um grupo de pessoas. Escreva um programa que determine e
 * escreva a quantidade de pessoas que possuem idade superior a 35
 * anos.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_17 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			int qtdIdade =0;
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe com o valor da posição: " + i);
				a[i] = scan.nextInt();

			}
			for (int i = 0; i < a.length; i++) {
				if (a[i] >35) {
					qtdIdade++;
				}
			}
			System.out.println();
			System.out.print("Vetor A = ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");

			}
			System.out.println();
			System.out.println("A quantidade de pessoas maior que 35 anos é: " + qtdIdade);
		}

	}

}
