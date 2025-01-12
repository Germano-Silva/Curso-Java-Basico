package aula_13.exercicios;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("================================================\n");
			System.out.print("Informa o raio para calcular a area do circulo: ");
			double raio = scan.nextDouble();
			double area = 3.14*(raio*raio);
			System.out.println("A area do circulo é: " + area + "\n");
		}
		System.out.print("================================================\n");
	}

}
