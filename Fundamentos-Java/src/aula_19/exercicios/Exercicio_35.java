package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_35
 * 
 * Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima
 * cada elemento do vetor A e a relação de todos os divisores do respectivo
 * elemento.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_35 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição A = " + i);
				a[i] = scan.nextInt();
			}
			for (int i = 0; i < a.length; i++) {
				System.out.println("Analizando o número " + a[i]);
				for (int j = 1; j < a[i]; j++) {
					if (a[i]%j==0) {
						System.out.println(j + " - É divisor. ");
						
					}
					
				}
				System.out.println();
			}
		}

	}

}
