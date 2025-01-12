package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("=======================================================\n");
			System.out.print(" Informe o valor da sua 1ª nota:");
			double n1 = scan.nextDouble();
			System.out.print(" Informe o valor da sua 2ª nota:");
			double n2 = scan.nextDouble();
			System.out.println("\n=======================================================\n");
			
			double media = ((n1+n2)/2);
			
			if (media>9.0 && media<=10.0) {
				System.out.println("A 1ª nota é: " + n1);
				System.out.println("A 2ª nota é: " + n2);
				System.out.println("A média é: "+n1+" + "+n2+" = " + media);
				System.out.println("As notas estão entre 9.0 e 10.0");
				System.out.println("O conceito é: A");
				System.out.println("APROVADO");
				
			} else if (media<=9.0 && media>7.5) {
				System.out.println("A 1ª nota é: " + n1);
				System.out.println("A 2ª nota é: " + n2);
				System.out.println("A média é: "+n1+" + "+n2+" = " + media);
				System.out.println("As notas estão entre 7.5 e 9.0");
				System.out.println("O conceito é: B");
				System.out.println("APROVADO");
				
			} else if (media<=7.5 && media>6.0) {
				System.out.println("A 1ª nota é: " + n1);
				System.out.println("A 2ª nota é: " + n2);
				System.out.println("A média é: "+n1+" + "+n2+" = " + media);
				System.out.println("As notas estão entre 6.0 e 7.5");
				System.out.println("O conceito é: C");
				System.out.println("APROVADO");
				
			} else if (media<=6.0 && media>4.0) {
				System.out.println("A 1ª nota é: " + n1);
				System.out.println("A 2ª nota é: " + n2);
				System.out.println("A média é: "+n1+" + "+n2+" = " + media);
				System.out.println("As notas estão entre  4.0 e 6.0");
				System.out.println("O conceito é: D");
				System.out.println("REPROVADO");
				
			} else if (media<=4.0 && media>=0) {
				System.out.println("A 1ª nota é: " + n1);
				System.out.println("A 2ª nota é: " + n2);
				System.out.println("A média é: "+n1+" + "+n2+" = " + media);
				System.out.println("As notas estão entre 4.0 e 0.0");
				System.out.println("O conceito é: E");
				System.out.println("REPROVADO");
				
			}
		}
	}

}
