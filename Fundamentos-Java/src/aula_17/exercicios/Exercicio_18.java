package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 18
 * 
 * Faça um programa que, dado um conjunto de N números, determine o 
 * menor valor, o maior valor e a soma dos valores.
 * 
 * @author Germano
 */


public class Exercicio_18 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe o valor de números que deseja informar: ");
			int qn = scan.nextInt();
			int n;
			int maior = Integer.MIN_VALUE;
			int menor = Integer.MAX_VALUE;
			
			for (int i = 0; i < qn; i++) {
				System.out.println("Informe um número: ");
				n = scan.nextInt();
				
				if(n>maior) {
					maior = n;
					System.out.println("O numero maior mudou: " + maior);
				}
				if(n<menor) {
					menor = n;
					System.out.println("O numero maior mudou: " + menor);
				}
				
			}
			
			System.out.println("O maior número digitado foi: " + maior);
			System.out.println("O menor número digitado foi: " + menor);
			System.out.println("A soma do maior com o menor é:  " + (menor + maior));
		}

	}

}
