package aula_19.exercicios;

import java.util.Scanner;

/**Exercicio_05
 * 
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
 * mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
 * ser o respectivo elemento de A multiplicado por sua posição (ou
 * índice), ou seja:
 * B[i] = A[i] * i.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_05 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			int[] b = new int[a.length];
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe com o valor da posição: " + i);
				a[i] = scan.nextInt();
				b[i] = (a[i])*i;
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
		}

	}

}
