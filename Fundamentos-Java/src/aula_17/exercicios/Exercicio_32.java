package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 32
 * 
 * Faça um programa que calcule o fatorial de um número inteiro 
 * fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser 
 * conforme o exemplo abaixo:
 * Fatorial de: 5 
 * 5! = 5 . 4 . 3 . 2 . 1 = 120
 * 
 * @author Germano
 */


public class Exercicio_32 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			int n = scan.nextInt();
			
			System.out.println("Fatorial de "+ n);
			System.out.print(n +" : = ");
			int f = 1;
			for (int i = n; i >1; i--) {
				f*=i;
				System.out.print(i + " . ");
				
			}
			System.out.print("1 = " + f);
			
		}

	}

}
