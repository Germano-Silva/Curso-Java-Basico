package aula_13.exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe a quantidade de metros que você quer em centimetros:");
			double m = scan.nextDouble();
			System.out.println("A quantidade informada é: " + m + "m" + " em centimetros é: " + (m*100)+ "cm");
		}
		

	}

}
