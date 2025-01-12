package aula_15;

import java.util.Scanner;

public class ControleDescisao_01 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informa com um dia da semana (1-7).");
			int diaS = scan.nextInt();
			
			if(diaS==1) {
				System.out.println("Domingo");
			}else if(diaS==2) {
				System.out.println("Segunda");
			}else if(diaS==3) {
				System.out.println("Terça");
			}else if(diaS==4) {
				System.out.println("Quarta");
			}else if(diaS==5) {
				System.out.println("Quinta");
			}else if(diaS==6) {
				System.out.println("Sexta");
			}else if(diaS==7){
				System.out.println("Sábado");
			}else {
				System.out.println("Não é um dia valido.");
			}
		}

	}

}
