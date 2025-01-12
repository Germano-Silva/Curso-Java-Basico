package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_31
 * 
 * Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A
 * utilizando apenas um vetor extra B. Sugestão: no início do vetor B armazene
 * os elementos pares de A e nas posições restantes do vetor B armazene os
 * elementos de A que são ímpares.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_31 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[20];
			int[] b = new int[a.length];
			
			int posB = 0;
			
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição A = " + i);
				a[i] = scan.nextInt();
			}
			
			for (int i = 0; i < a.length; i++) {
				if(a[i]%2 == 0) {
					b[posB] = a[i];
					posB++;
				}
			}
			
			for (int i = 0; i < a.length; i++) {
				if(a[i]%2 != 0) {
					b[posB] = a[i];
					posB++;
				}
			}
			
			System.out.print("Vetor A = ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			
			System.out.print("Vetor B = ");
			for (int i = 0; i < posB; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			
		}

	}

}
