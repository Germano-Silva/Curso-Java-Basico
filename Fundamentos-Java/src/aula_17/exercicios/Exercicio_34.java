package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 34
 * 
 * Os números primos possuem várias aplicações dentro da 
 * Computação, por exemplo na Criptografia. Um número primo é aquele 
 * que é divisível apenas por um e por ele mesmo. Faça um programa 
 * que peça um número inteiro e determine se ele é ou não um número primo.
 * 
 * @author Germano
 */


public class Exercicio_34 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe um número: ");
			int n = scan.nextInt();
			boolean p = true;
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					System.out.println("Não é primo");
					System.exit(i);
				}
			}
			if(p) {
				System.out.println("É primo");
			}
		}
	}

}
