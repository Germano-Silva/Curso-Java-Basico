package aula_17.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**Exercicio 51
 * 
 * Faça um programa que mostre os n termos da Série a seguir:
 * S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 
 * Imprima no final a soma da série.
 * 
 * @author Germano
 */


public class Exercicio_51 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o valor de N: ");
			double n= scan.nextDouble();
			double total = 0;
			for (double i = 1, j = 1; i <=n; i++, j+=2) {
				System.out.print( i + "/"+ j + " + ");
				total += (i/j);
			}
			System.out.println("\nO total é: " + new DecimalFormat("#,##0.00").format(total));
		}

	}

}
