package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("=======================================================\n");
			System.out.print(" Informe o valor de A:");
			double a = scan.nextDouble();
				if(a==0) {
					System.out.println("A equação não é de segundo grau.");
					System.exit(0);
				}
			System.out.print(" Informe o valor de B:");
			double b = scan.nextDouble();
			System.out.print(" Informe o valor de C:");
			double c = scan.nextDouble();
			System.out.println("\n=======================================================\n");
			
			double delta = (b*b)-4*a*c;
			double x = ((-b)/(2*a));
			double y = ((-b+(Math.sqrt(delta)))/(2*a));
			double z = ((-b-(Math.sqrt(delta)))/(2*a));
			
				if(delta<0) {
					System.out.println("A equação não possui raizes reais.");
					System.exit(0);
				}else if(delta==0) {
					System.out.println("A equação possui somente uma raiz real.");
					System.out.println("X = " + x);
				}else if(delta>0) {
					System.out.println("A equação possui raiz real.");
					System.out.println("X' = " + y);
					System.out.println("X'' = " + z);
				}
		}
		
		
	}

}
