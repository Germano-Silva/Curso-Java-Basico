package aula_13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe a temperatura em Celsius: ");
			double c = scan.nextDouble();
			double f = (c*1.8+32);
			System.out.println("A mesma temperatura em Farenheit é: " + new DecimalFormat("#,##0.00").format(f) +"ºF.");
		}
	

	}

}
