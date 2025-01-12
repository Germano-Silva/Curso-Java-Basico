package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_24 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe um número: ");
			double n1 = scan.nextDouble();
			System.out.print("Informe outro número: ");
			double n2 = scan.nextDouble();
			System.out.print("Informe uma opeação (+)(-)(*)(/): ");
			String op = scan.next();
			
			double r = 0;
			boolean v = true;
			double d = 0;
			
			
			switch(op) {
			case "+": r = n1+n2;break;
			case "-": r = n1-n2;break;
			case "*": r = n1*n2;break;
			case "/": r = n1/n2;break;
			default: System.out.println("Operação invalida."); v = false;
			
			}
			if(v) {
				if(r>=0) {
					System.out.println("Positivo");
				}else {
					System.out.println("Negativo");
				}
				
				if(r%2==0) {
					System.out.println("Par");
				}else {
					System.out.println("Impar");
				}
				
				d = r - Math.floor(r);
				
				if(d != 0.0) {
					System.out.println("O número é descimal.");
				}else {
					System.out.println("O número é inteiro.");
				}
			}
		}
	}
}


