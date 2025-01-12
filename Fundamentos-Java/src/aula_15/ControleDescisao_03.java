package aula_15;

import java.util.Scanner;

public class ControleDescisao_03 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informa com um dia da semana (1-7).");
			int diaS = scan.nextInt();
			
			switch(diaS) {
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:System.out.println("Dia útil"); break;
				case 1:
				case 7:System.out.println("Fim de semana"); break;
				default: System.out.println("Não é um dia valido."); break;
			}
		}
	}

}
