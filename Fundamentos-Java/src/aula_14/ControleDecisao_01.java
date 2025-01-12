package aula_14;

import java.util.Scanner;

public class ControleDecisao_01 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe a idade:");
			int idade = scan.nextInt();
			if (idade >= 18) {
				System.out.println("É maior de idade");
			} else {
				System.out.println("É menor de idade.");
			}
		}
	}

}
