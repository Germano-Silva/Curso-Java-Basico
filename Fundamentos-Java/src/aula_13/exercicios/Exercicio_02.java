package aula_13.exercicios;

import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println(" =============================== ");
			System.out.print(" Informe um número ente 1 e 100: ");
			int numero = scan.nextInt();
			System.out.println(" O número informado foi: " + numero );
		}
		System.out.println(" =============================== ");
		
		
	}

}
