package aula_13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe a a sua altura:");
			double altura = scan.nextDouble();
			double ideal = ((72.7*altura)-58);
			System.out.println("Com a sua altura o peso ideal é: " + new DecimalFormat("#,##0.00").format(ideal) +"kg.");
		}
	

	}

}
