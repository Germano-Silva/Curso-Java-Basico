package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_32
 * 
 * Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a
 * tabuada de cada um dos elementos do vetor A
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_32 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[5];
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição A = " + i);
				a[i] = scan.nextInt();
			}
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Tabuada de  " + a[i]);
				for (int j = 0; j <= 10; j++) {
					System.out.println(j + " X " + a[i] + " = " + (a[i]*j));
					
				}
			}
			System.out.println();
			
			
		}

	}

}
