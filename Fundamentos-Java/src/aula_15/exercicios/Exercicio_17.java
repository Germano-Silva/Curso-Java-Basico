package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Insira o ano: ");
			int ano = scan.nextInt();
			//multiplo ou divisivel utliza-se %
			if((ano%400 == 0)||(ano%4 ==0 && ano%100 !=0)) {
				System.out.println("Bissexto!");
			}else {
				System.out.println("Ano "+ano+ " não é bissexto.");
			}
		}
		

	}

}
