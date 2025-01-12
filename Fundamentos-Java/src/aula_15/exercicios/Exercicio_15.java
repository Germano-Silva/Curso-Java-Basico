package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("=======================================================\n");
			System.out.print(" Informe o valor do 1º lado:");
			double l1 = scan.nextDouble();
			System.out.print(" Informe o valor do 2º lado:");
			double l2 = scan.nextDouble();
			System.out.print(" Informe o valor do 3º lado:");
			double l3 = scan.nextDouble();
			System.out.println("\n=======================================================\n");

			if(l1==l2 && l1 ==l3 || l2==l3 && l2==l1 || l3==l2 && l3==l1) {
				System.out.print(" O triangulo é Equilátero");
			}else if(l1==l2 && l1 !=l3 || l2==l3 && l2!=l1 || l3==l2 && l3!=l1 || l1!=l2 && l1 ==l3 || l2!=l3 && l2==l1 || l3!=l2 && l3==l1) {
				System.out.print(" O triangulo é Isósceles");
			}else if(l1!=l2 && l1 !=l3 && l2!=l3) {
				System.out.print(" O triangulo é Escaleno");
			}else {
				System.out.println("não é um triangulo");
			}
		}
	}

}
