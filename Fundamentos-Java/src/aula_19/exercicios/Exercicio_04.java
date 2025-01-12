package aula_19.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**Exercicio_04
 * 
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
 * mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
 * raiz quadrada do respectivo elemento de A, ou seja:
 * B[i] = sqrt(A[i]). 
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_04 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double[] a = new double[15];
			double[] b = new double[a.length];
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe com o valor da posição: " + i);
				a[i] = scan.nextDouble();
				b[i] = (double) Math.sqrt(a[i]);
			}
			System.out.print("Vetor A = ");
			for(int i = 0; i<a.length; i++) {
				System.out.print(new DecimalFormat("#,##0.00").format(a[i]) + " ");
			}
			System.out.println();
			
			System.out.print("Vetor B = ");
			for(int i = 0; i<b.length; i++) {
				System.out.print(new DecimalFormat("#,##0.00").format(b[i]) + " ");
			}
			System.out.println();
		}

	}

}
