package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe o dia: ");
			int dia = scan.nextInt();
			if(dia>30 || dia<0) {
					System.out.println("Dia invalido!");
					System.exit(0);
				}
			System.out.println("Informe o mês: ");
			int mes = scan.nextInt();
			if(mes>12 || mes<0) {
					System.out.println("Mês inexistente!");
					System.exit(0);
				}
			System.out.println("Informe o ano: ");
			int ano = scan.nextInt();
			if(ano>2023) {
						System.out.println("Estamos no futuro!");
						System.exit(0);
				}else if(ano<0) {
						System.out.println("Estamos entrando anos antes de Cristo");
						System.exit(0);
			}
			System.out.println("A data informada é: "+dia+"/"+mes+"/"+ano);
		}
	}

}
