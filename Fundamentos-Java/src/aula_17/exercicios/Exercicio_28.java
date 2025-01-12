package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 28
 * 
 * Faça um programa que calcule o valor total investido por um 
 * colecionador em sua coleção de CDs e o valor médio gasto em cada 
 * um deles. O usuário deverá informar a quantidade de CDs e o valor 
 * para em cada um.
 * 
 * @author Germano
 */


public class Exercicio_28 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe a quantidade de CDs: ");
			int cd = scan.nextInt();
			double p;
			double s = 0;
			for (int i = 0; i < cd; i++) {
				System.out.println("Informe o valor do CD: ");
				p = scan.nextDouble();
				s +=p;
				
			}
			double m = s/cd;
			System.out.println("Media gasta com cada CD: " + m);
			
		}

	}

}
