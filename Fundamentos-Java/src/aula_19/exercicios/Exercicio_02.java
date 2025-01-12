package aula_19.exercicios;

import java.util.Scanner;

/**Exercicio_02
 * 
 * Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
 * mesmo tipo e tamanho e com os elementos do vetor A multiplicados
 * por 2, ou seja: B[i] = A[i] * 2.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_02 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[5];
			int[] b = new int[a.length];
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe com o valor da posição: " + i);
				a[i] = scan.nextInt();
				b[i] = (a[i])*2;
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
