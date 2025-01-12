package aula_17.exercicios;

/**Exercicio 05
 * 
 * Altere o programa anterior permitindo ao usuário informar 
 * as populações e as taxas de crescimento iniciais. 
 * Valide a entrada e permita repetir a operação.
 * 
 * @author Germano
 */

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double a;
			double b;
			double t1;
			double t2;
			boolean v;
			int cont;

			v = false;
			do {
				System.out.println("Entre com a população A");
				a = scan.nextDouble();
				if (a > 0) {
					v = true;
				} else {
					System.out.println("A população precisa ser maior que 0!");
				}

			} while (!v);

			v = false;
			do {
				System.out.println("Entre com a população B");
				b = scan.nextDouble();
				if (b > 0) {
					v = true;
				} else {
					System.out.println("A população precisa ser maior que 0!");
				}

			} while (!v);

			v = false;
			do {
				System.out.println("Entre com a Taxa da popilação A");
				t1 = scan.nextDouble();
				if (t1 > 0) {
					v = true;
				} else {
					System.out.println("A taxa de crescimento da população precisa ser maior que 0!");
				}

			} while (!v);

			v = false;
			do {
				System.out.println("Entre com a Taxa da popilação A");
				t2 = scan.nextDouble();
				if (t2 > 0) {
					v = true;
				} else {
					System.out.println("A taxa de crescimento da população precisa ser maior que 0!");
				}

			} while (!v);

			cont = 0;

			while (a <= b) {
				a += (a / 100) * t1;
				b += (b / 100) * t2;
				cont++;

			}

			System.out.println("População A: " + a);
			System.out.println("População B: " + b);
			System.out.println("Quantidade de anos: " + cont);
		}

	}

}
