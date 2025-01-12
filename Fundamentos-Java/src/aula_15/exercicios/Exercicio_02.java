package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe um número: ");
			int n1 = scan.nextInt();
			if(n1<0) {
				System.out.println("O numero é negativo: " + n1);
			}else {
				System.out.println("O numero é positivo: " + n1);
			}
		}
	}
}
