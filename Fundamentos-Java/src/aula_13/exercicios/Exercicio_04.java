package aula_13.exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe a nota do 1º bimestre");
			double n1 = scan.nextDouble();
			
			System.out.println("Informe a nota do 2º bimestre");
			double n2 = scan.nextDouble();
			
			System.out.println("Informe a nota do 3º bimestre");
			double n3 = scan.nextDouble();
			
			System.out.println("Informe a nota do 4º bimestre");
			double n4 = scan.nextDouble();
			System.out.println("====================================\n");
			System.out.println("A sua média é: " + ((n1+n2+n3+n4)/4) + "\n");
		}
		System.out.println("====================================");

	}

}
