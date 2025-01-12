package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 17
 * 
 * Faça um programa que calcule o fatorial de um número inteiro
 * fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
 * 
 * @author Germano
 */


public class Exercicio_17 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe um número: ");
			int n1 = scan.nextInt(); 
			int n2 = 1;
			
			for (int i = n1; i > 0; i--) {
				n2 *= i;
				System.out.print(i + ".");
			}
			System.out.println(" =  " + n2);
		}

	}

}
