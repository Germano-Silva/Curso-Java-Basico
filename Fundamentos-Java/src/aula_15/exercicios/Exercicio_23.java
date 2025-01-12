package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_23 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe um numero qualquer:");
			double n = scan.nextDouble();
			double d = n - Math.floor(n);
			if(d != 0.0) {
				System.out.println("O número é descimal.");
			}else {
				System.out.println("O número é inteiro.");
			}
		}

	}

}
