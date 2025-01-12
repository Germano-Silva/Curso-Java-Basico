package aula_13.exercicios;

import java.util.Scanner;

public class Exercicio_03 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe dois numero entre 1 á 100:");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			System.out.println("A soma dos números informados é: " + (n1+n2));
		}
		
		
		
	}

}
