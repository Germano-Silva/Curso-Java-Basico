package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informa com um dia da semana (1-7).");
			int diaS = scan.nextInt();
			
			switch(diaS) {
				case 1:System.out.println("Domingo"); break;
				case 2:System.out.println("Segunda"); break;
				case 3:System.out.println("Terça"); break;
				case 4:System.out.println("Quarta"); break;
				case 5:System.out.println("Quinta"); break;
				case 6:System.out.println("Sexta"); break;
				case 7:System.out.println("Sábado"); break;
				default: System.out.println("Não é um dia valido."); break;
			}
		}

	}

}