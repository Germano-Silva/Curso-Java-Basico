package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_03 {
	public static void main(String[] args) {
		System.out.println("Informe seu sexo F (feminino) M (masculino):");
		try (Scanner scan = new Scanner(System.in)) {
			String letra = scan.next();
			switch (letra) {
			case "F":System.out.println("Feminino"); break;
			case "M":System.out.println("Masculino"); break;
			default: System.out.println("Sexo invalido."); break;
			}
		}
	}

}
