package aula_19.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**Exercicio_14
 * 
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa
 * que defina e escreva a média aritmética simples dos elementos
 * ímpares armazenados neste vetor.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_14 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];

			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe com o valor da posição: " + i);
				a[i] = scan.nextInt();

			}
			int soma = 0;
			int impar=0;
			
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 != 0) {
					soma += a[i];
					impar++;
					System.out.print(a[i] + " ");
				}

			}
			double media = soma/impar;
			System.out.println("Soma = " + soma);
			System.out.println("Media = " + new DecimalFormat("#,##0.00").format(media));
		}

	}

}
