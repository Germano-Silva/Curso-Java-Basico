package aula_17.exercicios;

import java.util.Scanner;

/**
 * Exercicio 08
 * 
 * Faça um programa que leia 5 números e informe a soma e a média dos números.
 * 
 * @author Germano
 */

public class Exercicio_08 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double n;
			double s = 0;
			double m;

			for (int i = 0; i < 5; i++) {
				System.out.println("Digite um numero: ");
				n = scan.nextDouble();

				s += n;
			}
			m = s/5;
			System.out.println("A soma dos número é: " + s);
			System.out.println("A media é " + m);
		}

	}

}
