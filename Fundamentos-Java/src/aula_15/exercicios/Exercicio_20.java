package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe o valor da sua 1ª nota: ");
			double n1 = scan.nextDouble();
			System.out.print("Informe o valor da sua 2ª nota: ");
			double n2 = scan.nextDouble();
			System.out.print("Informe o valor da sua 3ª nota: ");
			double n3 = scan.nextDouble();
			
			double media = ((n1+n2+n3)/3.0);
			if(media==10){
				System.out.println("Aprovado com Distinção!");
			}else if(media>=7) {
				System.out.println("APROVADO!");
			}else if(media<7) {
				System.out.println("Reprovado!");
			}
		}
	}

}
