package aula_13.exercicios;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print(" Informe o valor da altura ou base do quadrado: ");
			double lado = scan.nextDouble();
			double area = lado*lado*lado*lado;
			System.out.println(" A area do quadrado é " + area + "\n O dobro da area é: " + (area*2));
		}

	}

}
