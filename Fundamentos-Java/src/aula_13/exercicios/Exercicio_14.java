package aula_13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe a quantidade de quilos de peixe arrecadado: ");
			double peso = scan.nextDouble();
			double excesso = peso - 50.0;
			double multa = 4.0;
			double resultado = multa * excesso;
			if (resultado <= 0.0) {
				System.out.println("Você esta abaixo do valor extabelecido");
				System.out.println("pelo regulamento do estado de São Paulo");
				System.out.println("a quantidade de peso que trouxe de peixe é " + new DecimalFormat("#,##0.00").format(peso) + "kg.");
			} else {
				System.out.println("Você esta acima do valor extabelecido");
				System.out.println("pelo regulamento do estado de São Paulo");
				System.out.println("a quantidade de peso que trouxe de peixe é " + new DecimalFormat("#,##0.00").format(peso) + "kg.");
				System.out.println("a quantidade que você deve pagar é R$" + new DecimalFormat("#,##0.00").format(resultado) + ".");

			}
		}
	}

}
