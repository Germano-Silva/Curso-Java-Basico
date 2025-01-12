package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_30
 * 
 * Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos
 * vetor B e C serão armazenados o valores pares e ímpares de A,
 * respectivamente.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_30 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[20];
			int[] pares = new int[a.length];
			int[] impares = new int[a.length];
			
			int posPares = 0;
			int posImpares = 0;
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição A = " + i);
				a[i] = scan.nextInt();
			}
			
			for (int i = 0; i < a.length; i++) {
				if(a[i]%2 == 0) {
					pares[posPares] = a[i];
					posPares++;
				}else {
					impares[posImpares] = a[i];
					posImpares++;
				}
			}
			
			System.out.print("Vetor A = ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			
			System.out.print("Vetor B = ");
			for (int i = 0; i < posPares; i++) {
				System.out.print(pares[i] + " ");
			}
			System.out.println();
			
			System.out.print("Vetor C = ");
			for (int i = 0; i < posImpares; i++) {
				System.out.print(impares[i] + " ");
			}
			System.out.println();
		}

	}

}
