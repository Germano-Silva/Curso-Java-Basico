package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 10
 * 
 * Faça um programa que receba dois números inteiros e gere os
 * números inteiros que estão no intervalo compreendido por eles.
 * 
 * @author Germano
 */


public class Exercicio_10 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe um número: ");
			int n1 = scan.nextInt(); 
			System.out.println("Informe um número: ");
			int n2 = scan.nextInt(); 
			
			if(n1<n2) {
				for (int i = n1; i <= n2; i++) {
					System.out.println(i);
				}
			}else {
				for (int i = n2; i <= n1; i++) {
					System.out.println(i);
					
				}
			}
		}

	}

}
