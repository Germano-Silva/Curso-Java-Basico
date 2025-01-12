package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe a 1ª nota:");
			double n1 = scan.nextDouble();
			System.out.println("Informe a 2ª nota:");
			double n2 = scan.nextDouble();
			
			double media = (n1+n2)/2;
			
			if(media==10) {
				System.out.println("Aprovado com distinção!");
			}else if (media>=7) {
				System.out.println("Aprovado!");
			}else {
				System.out.println("Reprovado!");
			}
		}
		

	}

}
