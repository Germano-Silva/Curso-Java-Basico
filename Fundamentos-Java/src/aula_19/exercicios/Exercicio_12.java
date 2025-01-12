package aula_19.exercicios;

import java.util.Scanner;

/**Exercicio_12
 * 
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa
 * que defina e escreva a soma de todos os elementos armazenados
 * neste vetor
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_12 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe com o valor da posição: " + i);
				a[i] = scan.nextInt();
				
			}
			int soma = 0;
			for(int i = 0; i<a.length; i++) {
				soma += a[i];
				System.out.print(a[i] + " ");
				
				
			}
			System.out.println("Soma = " + soma);
		}

	}

}
