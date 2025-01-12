package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_37
 * 
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
 * tamanho, sendo que cada elemento do vetor B seja o fatorial do elemento
 * correspondente em A.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_37 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[15];
			int[] b = new int[a.length];
			
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição A = " + i);
				a[i] = scan.nextInt();
			}
			
			for (int i = 0; i < a.length; i++) {
				b[i] = 1;
				for (int j = 1; j < a[i]; j++) {
					b[i] *= j;
					
				}
			}
			System.out.print("Vetor A = ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			
			System.out.print("Vetor B = ");
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
		}

	}

}
