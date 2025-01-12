package aula_13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe o seu gênero para calcularmos seu peso ideal.");
			System.out.println("F para feminino e M para masculino:");
			String g = scan.next();
			if ("f".equals(g)) {
				System.out.print("Informe a a sua altura:");
				double altura = scan.nextDouble();
				double ideal = ((72.7 * altura) - 58);
				System.out.println("informe seu peso atual:");
				double peso = scan.nextDouble();
				if (ideal == peso) {
					System.out.println("Você esta dentro do pesso ideal para sua altura.");
				} else if (ideal < peso) {
					System.out.println("Você esta acima do pesso ideal para sua altura.");
				} else {
					System.out.println("Você esta abaixo do pesso ideal para sua altura.");
				}

				System.out
						.println("Com a sua altura o peso ideal é: " + new DecimalFormat("#,##0.00").format(ideal) + "kg.");

			} else {
				System.out.print("Informe a a sua altura:");
				double altura = scan.nextDouble();
				double ideal = ((62.1 * altura) - 44.7);
				System.out.println("informe seu peso atual:");
				double peso = scan.nextDouble();
				if (ideal == peso) {
					System.out.println("Você esta dentro do pesso ideal para sua altura.");
				} else if (ideal < peso) {
					System.out.println("Você esta acima do pesso ideal para sua altura.");
				} else {
					System.out.println("Você esta abaixo do pesso ideal para sua altura.");
				}
				System.out
						.println("Com a sua altura o peso ideal é: " + new DecimalFormat("#,##0.00").format(ideal) + "kg.");
			}
		}

	}

}
