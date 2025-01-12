package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Infome 3 numeros para saber qual é o maior");
			double n1 = scan.nextDouble();
			double n2 = scan.nextDouble();
			double n3 = scan.nextDouble();
			
			if(n1<n2 && n1<n3) {
				System.out.println("O menor preço é: " + n1);
			}else if(n2<n1 && n2<n3) {
				System.out.println("O menor preço é: " + n2);
			}else{
				System.out.println("O menor preço é: " + n3);
			}
		}

	}

}
