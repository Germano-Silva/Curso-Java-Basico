package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 21
 * 
 * Faça um programa que peça um número inteiro e determine se ele é 
 * ou não um número primo. Um número primo é aquele que é divisível 
 * somente por ele mesmo e por 1.
 * 
 * @author Germano
 */


public class Exercicio_21 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe um número: ");
			int n = scan.nextInt();
			boolean p = true;
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					System.out.println("Não é primo");
					p = false;
				}
			}
			if(p) {
				System.out.println("É primo");
			}
		}

	}

}
