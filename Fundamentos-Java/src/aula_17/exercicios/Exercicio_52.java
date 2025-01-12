package aula_17.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**Exercicio 52
 * 
 * Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que 
 * calcule o valor de H com N termos.
 * 
 * @author Germano
 */


public class Exercicio_52 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o valor de N: ");
			double n= scan.nextDouble();
			double total = 0;
			for (double i = 1; i <=n; i++) {
				System.out.print("1/" + new DecimalFormat("#").format(i) + " + ");
				total += (1/i);
			}
			System.out.println("\nO total é: " + new DecimalFormat("#,##0.00").format(total));
		}

	}

}
