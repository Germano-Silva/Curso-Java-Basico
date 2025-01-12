package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println(" Informe seu salario para ser calculado o aumento.");
			double salario = scan.nextDouble();
			
			if(salario<=280.00) {
				System.out.println("Seu salario atual é: R$" + salario + "\nO reajuste foi de 20% no valor de: R$"+(salario*(20.0/100))+"\nSeu salario com o reajiste é R$" + (salario+(salario*(20.0/100))));
			}else if(700.00>=salario && salario>280.00) {
				System.out.println("Seu salario atual é: R$" + salario + "\nO reajuste foi de 15% no valor de: R$"+(salario*(15.0/100))+"\nSeu salario com o reajiste é R$" + (salario+(salario*(15.0/100))));
			}else if(700.00 < salario && salario<=1500.00) {
				System.out.println("Seu salario atual é: R$" + salario + "\nO reajuste foi de 10% no valor de: R$"+(salario*(10.0/100))+"\nSeu salario com o reajiste é R$" + (salario+(salario*(10.0/100))));
			}else {
				System.out.println("Seu salario atual é: R$" + salario + "\nO reajuste foi de 5% no valor de: R$"+(salario*(5.0/100))+"\nSeu salario com o reajiste é R$" + (salario+(salario*(5.0/100))));
			}
		}

	}

}
