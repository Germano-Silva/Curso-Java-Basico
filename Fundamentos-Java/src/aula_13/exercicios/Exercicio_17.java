package aula_13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_17 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe a quantidade de metros quadrados que vai ser pintado:");
			double metrosQ = scan.nextDouble();
			
			double litros = metrosQ/3;
			int latas = (int)litros/18;
			double valor = latas*80.0;
			if(latas<=1.0) {
				System.out.println("Será preciso comprar somente 1 lata de tinta no valor de R$80,00.");
			}else {
				System.out.println("Será preciso comprar " + latas + " latas de tinta no valor de R$" + new DecimalFormat("#,##0.00").format(valor));
			}
		}
	}

}
