package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_36
 * 
 * Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada
 * elemento do vetor A é formado pela potência de base 2 elevado ao expoente
 * igual a posição do respectivo elemento, ou seja: A[i] = 2i . Sugestão int
 * A[11];
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_36 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double[] a = new double[10];
			
			for (int i = 0; i < a.length; i++) {
				a[i] = Math.pow(2, i);
			}
			
			System.out.print("Vetor A = ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}

	}

}
