package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_22 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe um numero qualquer: ");
			int n = scan.nextInt();
			if(n%2 == 0) {
				System.out.println("Par");
			}else {
				System.out.println("Inpar");
			}
		}
	}

}
