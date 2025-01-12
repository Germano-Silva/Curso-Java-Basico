package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 35
 * 
 *Encontrar números primos é uma tarefa difícil. Faça um programa que 
 *gera uma lista dos números primos existentes entre 1 e um número 
 *inteiro informado pelo usuário.
 * 
 * @author Germano
 */


public class Exercicio_35 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o número: ");
			int n = scan.nextInt();
			boolean p;
			
			for (int i = 1; i < n; i++) {
				p = true;
				for(int j=2; j<i; j++) {
					if(i%j==0) {
						p = false;
					}
				}
				if(p) {
					System.out.println("É primo " + i);
				}
			}
			
		}

	}

}
