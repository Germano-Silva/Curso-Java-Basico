package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Vamos verificar se é vogal ou consoante, digite uma letra:");
			String letra = scan.next();
			
			switch(letra) {
				case "a":System.out.println("vogal"); break;
				case "e":System.out.println("vogal"); break;
				case "i":System.out.println("vogal"); break;
				case "o":System.out.println("vogal"); break;
				case "u":System.out.println("vogal"); break;
				default: System.out.println("consoante"); break;
			}
		}

	}

}
