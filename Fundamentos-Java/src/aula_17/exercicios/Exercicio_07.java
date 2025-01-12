package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 07
 * 
 * Faça um programa que leia 5 números e informe o maior número.
 * 
 * @author Germano
 */


public class Exercicio_07 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			int n;
			int maior = Integer.MIN_VALUE;
			
			for (int i = 0; i < 5; i++) {
				System.out.println("Informe um número: ");
				n = scan.nextInt();
				
				if(n>maior) {
					maior = n;
					System.out.println("O numero maior mudou: " + maior);
				}
				
			}
			
			System.out.println("O maior número digitado foi: " + maior);
		}

	}

}
