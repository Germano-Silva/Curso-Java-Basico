package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_28
 * 
 * .Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e
 * tamanho e com os mesmos elementos de A, sendo que estes deverão estar
 * invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o
 * segundo elemento de A passa a ser o penúltimo de B e assim por diante.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_28 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			int[] b = new int[a.length];
			
			
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição A = " + i);
				a[i] = scan.nextInt();
				
				b[a.length - i -1] = a[i];
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
