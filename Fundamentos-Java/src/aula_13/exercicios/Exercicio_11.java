package aula_13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe dois numeros inteiros e um real: ");
			double n1 = scan.nextDouble();
			double n2 = scan.nextDouble();
			double n3 = scan.nextDouble();
			
			double a = ((n1*2)+(n2/2));
			double b = ((n1*3)+n3);
			double c = n3*n3*n3;
			
			System.out.println("O dobro do primeiro mais metade do segundo: " + new DecimalFormat("#,##0.00").format(a));
			System.out.println("O triplo do primeiro mais o terceiro: " + new DecimalFormat("#,##0.00").format(b));
			System.out.println("O terceiro elevado ao cubo: " + new DecimalFormat("#,##0.00").format(c));
		}

	}

}
