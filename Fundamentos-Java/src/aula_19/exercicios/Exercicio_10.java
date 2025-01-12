package aula_19.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**Exercicio_10
 * 
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
 * mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
 * ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
 * seja: B[i] := A[i] % 2.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_10 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			double[] b = new double[a.length];
			
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe com o valor da posição: " + i);
				a[i] = scan.nextInt();
				b[i] = a[i]%2;
				
			}
			
			System.out.print("Vetor A = ");
			for(int i = 0; i<a.length; i++) {
				System.out.print(a[i] + " ");
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
