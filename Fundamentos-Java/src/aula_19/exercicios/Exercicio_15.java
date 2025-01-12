package aula_19.exercicios;

import java.util.Scanner;

/**Exercicio_15
 * 
 * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
 * que defina o percentual de elementos pares e ímpares,
 * respectivamente, armazenados neste vetor.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_15 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];

			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe com o valor da posição: " + i);
				a[i] = scan.nextInt();

			}
			int impar =0;
			System.out.print("Vetor A impares = ");
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 != 0) {
					impar++;
					System.out.print(a[i] + " ");
				}

			}
			
			System.out.println();
			System.out.print("Vetor A pares = ");
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0) {
					System.out.print(a[i] + " ");
				}

			}
			int par = a.length - impar;
			double porcPar = (par *100)/a.length;
			double porcImpar = 100-porcPar;
			System.out.println();
			System.out.println("Porcentagem números Pares "+porcPar+"%");
			System.out.println("Porcentagem números Impares "+porcImpar+"%");
		}
	}

}
