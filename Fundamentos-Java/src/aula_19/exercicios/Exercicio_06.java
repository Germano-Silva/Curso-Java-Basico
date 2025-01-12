package aula_19.exercicios;

import java.util.Scanner;

/**Exercicio_06
 * 
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
 * um vetor C, onde cada elemento de C é a soma dos respectivos
 * elementos em A e B, ou seja:
 * C[i] = A[i] + B[i].
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_06 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			int[] b = new int[a.length];
			int[] c = new int[a.length];
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe com o valor da posição: " + i);
				a[i] = scan.nextInt();
				b[i] = a[i];
				c[i] = a[i]+b[i];
			}
			System.out.print("Vetor A = ");
			for(int i = 0; i<a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			
			System.out.print("Vetor B = ");
			for(int i = 0; i<b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
			
			System.out.print("Vetor C = ");
			for(int i = 0; i<c.length; i++) {
				System.out.print(c[i] + " ");
			}
			System.out.println();
		}
	}
}
