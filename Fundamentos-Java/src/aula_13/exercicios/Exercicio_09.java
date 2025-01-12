package aula_13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe a temperatura em Farenheit:");
			double f = scan.nextDouble();
			double c = (5*(f-32)/9);
			System.out.println("A mesma temperatura em Celsius é: " + new DecimalFormat("#,##0.00").format(c) +"º C.");
		}
	
	}

}
