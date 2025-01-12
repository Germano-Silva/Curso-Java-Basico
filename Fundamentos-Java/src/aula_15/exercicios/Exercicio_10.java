package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println(" Qual turno você trabalha:\n(M) matutino (V) vespertino (N) noturno");
			String letra = scan.next();
			
			switch(letra) {
				case "M":System.out.println("Bom dia!"); break;
				case "V":System.out.println("Boa Tarde!"); break;
				case "N":System.out.println("Boa noite!"); break;
				default: System.out.println("Valor invalido!"); break;
			}
		}

	}

}
