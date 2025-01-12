package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_29
 * 
 * Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, sendo
 * este a junção dos dois outros vetores. Os primeiros 10 elementos de C deverão
 * receber os elementos de A e os últimos elementos C deverão receber os
 * elementos de B. Desta forma, C deverá ter o dobro de elementos de A e B, ou
 * seja, 20 elementos.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_29 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			int[] b = new int[a.length];
			int[] c = new int[a.length*2];
			
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição A = " + i);
				a[i] = scan.nextInt();
				c[i] = a[i];
			}
			
			for (int i = 0; i < b.length; i++) {
				System.out.println("Entre com um número para a posição A = " + i);
				b[i] = scan.nextInt();
				c[a.length+i] = a[i];
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
			
			System.out.print("Vetor C = ");
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i] + " ");
			}
			System.out.println();
		
		}

	}

}
