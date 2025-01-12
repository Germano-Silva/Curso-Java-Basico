package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 22
 * 
 * Altere o programa de cálculo dos números primos, informando, caso o 
 * número não seja primo, por quais número ele é divisível.
 * 
 * @author Germano
 */


public class Exercicio_22 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe um número: ");
			int n = scan.nextInt();
			boolean p = true;
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					System.out.println("O número "+n+" não é primo");
					for (int j = 1; j <= n; j++) {
						if(n%j==0) {
							System.out.println("é divisivel por: " + j);
						}
						p = false;
					}
				}
			}
			if(p) {
				System.out.println("É primo");
			}
			
		}
		

	}

}
