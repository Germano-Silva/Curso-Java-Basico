package aula_17.exercicios;

import java.util.Scanner;

/**
 * Exercicio 24
 * 
 * Faça um programa que calcule o mostre a média aritmética de N notas.
 * 
 * @author Germano
 */

public class Exercicio_24 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre a quantidades de notas: ");
			double n = scan.nextInt();
			double s =0;
			double m = 0;
			double n1;
			
			for(int i=0; i<n; i++) {
				System.out.println("Informe a nota: " + (i+1));
				n1 = scan.nextDouble();
				s+=n1;
				
			}
			m =(s/n);
			System.out.println("Soma: " + s);
			System.out.println("Media: " + m);
			
		}

	}

}
