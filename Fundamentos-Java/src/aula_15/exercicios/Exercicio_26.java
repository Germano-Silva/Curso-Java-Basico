package aula_15.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_26 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe qual combustivel deseja adicionar ao seu carro:");
			System.out.println("O valor da gasolina é R$2,50");
			System.out.println("O valor da álcool é R$1,90");
			System.out.println("Gasolina (G) Álcool (A)");
			String c = scan.next();
			System.out.println("Informe a quantidade de litros que irá abastecer:");
			double l = scan.nextDouble();
			
			double g = 2.50;
			double a = 1.90;
			double v = 0.0;
			
			switch (c) {
			case "g": 
				System.out.println("Você escoleu Gasolina.");
				if(l<=0) {
					System.out.println("Vamos abastecer e receber um desconto :P");
				}else if(l<=20) {
					v = (l*g) - ((l*g)*(4.0/100.0));
					System.out.println("Como você abasteceu até 20 litros recebeu um desconto de 3%");
					System.out.println("O valor a pagar pelos " + l + " litros é R$" + new DecimalFormat("#,##0.00").format(v));
				}else {
					v = (l*g) - ((l*g)*(6.0/100.0));
					System.out.println("Como você abasteceu até 20 litros recebeu um desconto de 6%");
					System.out.println("O valor a pagar pelos " + l + " litros é R$" + new DecimalFormat("#,##0.00").format(v));
				}
				break;
			
			case "a":
				if(l<=0) {
					System.out.println("Vamos abastecer e receber um desconto :P");
				}else if(l<=20){
					v = (l*a) - ((l*a)*(3.0/100.0));
					System.out.println("Como você abasteceu até 20 litros recebeu um desconto de 3%");
					System.out.println("O valor a pagar pelos " + l + " litros é R$" + new DecimalFormat("#,##0.00").format(v));
				}else {
					v = (l*g) - ((l*g)*(5.0/100.0));
					System.out.println("Como você abasteceu até 20 litros recebeu um desconto de 6%");
					System.out.println("O valor a pagar pelos " + l + " litros é R$" + new DecimalFormat("#,##0.00").format(v));
				}
				break;
			
			default:
				System.out.println("Informe um combustivel valido.");
				break;
			}
		}

	}

}
