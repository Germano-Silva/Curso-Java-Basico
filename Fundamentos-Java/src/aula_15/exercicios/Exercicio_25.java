package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_25 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Responda as perguntas com s ou n:");
			System.out.print("Telefonou para a vitima? ");
			String r1 = scan.next();
			System.out.print("Esteve no local do crime? ");
			String r2 = scan.next();
			System.out.print("Mora perto da vitima? ");
			String r3 = scan.next();
			System.out.print("Devia para a vitima? ");
			String r4 = scan.next();
			System.out.print("Já trabalhou com a vitima? ");
			String r5 = scan.next();
			
			int c = 0;
			
			if(r1.equalsIgnoreCase("s")) {
				c++;
			}
			if(r2.equalsIgnoreCase("s")) {
				c++;
			}
			if(r3.equalsIgnoreCase("s")) {
				c++;
			}
			if(r4.equalsIgnoreCase("s")) {
				c++;
			}
			if(r5.equalsIgnoreCase("s")) {
				c++;
			}
			if(c==2) {
				System.out.println("Suspeita");
			}else if(c==3 || c==4) {
				System.out.println("Cúmplice");
			}else if(c==5) {
				System.out.println("Assassino");
			}else {
				System.out.println("Inocente");
			}
		}
	}

}
