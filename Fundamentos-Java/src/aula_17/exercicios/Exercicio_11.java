package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 11
 * 
 * Altere o programa anterior para mostrar no final a soma dos números.
 * 
 * @author Germano
 */


public class Exercicio_11 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe um número: ");
			int n1 = scan.nextInt(); 
			System.out.println("Informe um número: ");
			int n2 = scan.nextInt(); 
			
			if(n1<n2) {
				for (int i = n1; i <= n2; i++) {
					System.out.println(i);
				}
			}else {
				for (int i = n2; i <= n1; i++) {
					System.out.println(i);
					
				}
			}
			System.out.println(n1+n2);
		}

	}

}
