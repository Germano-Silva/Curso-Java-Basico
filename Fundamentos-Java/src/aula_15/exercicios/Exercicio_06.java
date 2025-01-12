package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Infome 3 numeros para saber qual é o maior");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			int n3 = scan.nextInt();
			
			if(n1>n2 && n1>n3) {
				System.out.println("O numero maior é: " + n1);
			}else if(n2>n1 && n2>n3) {
				System.out.println("O numero maior é: " + n2);
			}else{
				System.out.println("O numero maior é: " + n3);
			}
		}

	}

}
