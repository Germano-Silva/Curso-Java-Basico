package aula_13.exercicios;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("=====================================");
			System.out.println("                 Ola!\n      Vamo calcular seu salário!");
			System.out.println("=====================================");
			System.out.print("Informe o valor da sua hora trabalhada:");
			double h = scan.nextDouble();
			System.out.print("Informe quantas horas trabalhou esse mês:");
			double t = scan.nextDouble();
			System.out.println("=====================================");
			double s = h*t;
			System.out.println("         Seu salario é: R$" + s);
		}
		System.out.println("=====================================");
		

	}

}
