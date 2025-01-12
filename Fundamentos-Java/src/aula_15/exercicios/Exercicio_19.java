package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe um numero menor que 1000: ");
			int n = scan.nextInt();
			int cent = n/100;
			int dez = n/10;
			int uni = n%10;
			if(cent==0 && dez>0) {
				System.out.println(n + " = " + dez + " dezena(s) e " + uni + " unidade(s)" );
			}else if(cent==0 && dez==0) {
				System.out.println(n + " = " + uni + " unidade(s)" );
			}else {
				System.out.println(n + " = " + cent + " centena(s), " + dez + " dezena(s) e " + uni + " unidade(s)" );
			}
		}	
		
	}

}
