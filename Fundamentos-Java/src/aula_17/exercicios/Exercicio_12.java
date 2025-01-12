package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 12
 * 
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
 * qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
 * numero ele deseja ver a tabuada. A saída deve ser conforme o
 * exemplo abaixo:
 * 
 * @author Germano
 */


public class Exercicio_12 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe um número: ");
			int n = scan.nextInt(); 
			
			
			System.out.println("Tabuada do número "+ n);
			for (int i = 0; i <= 10; i++) {
					System.out.println(i +" X "+n+" = " +(n*i));
				}
			
			}
		}

	}
