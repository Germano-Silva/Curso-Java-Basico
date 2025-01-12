package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe 2 numeros.");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			if(n1>n2) {
				System.out.println("O numero maior é: " + n1);
			}else {
				System.out.println("O numero maior é: " + n2);
			}
		}
	}
}
