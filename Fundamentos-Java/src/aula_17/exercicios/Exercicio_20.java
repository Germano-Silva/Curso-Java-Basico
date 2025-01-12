package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 20
 * 
 * Altere o programa de cálculo do fatorial, permitindo ao usuário calcular 
 * o fatorial várias vezes e limitando o fatorial a números inteiros positivos 
 * e menores que 16.
 * 
 * @author Germano
 */


public class Exercicio_20 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			boolean condition = true;
			
			while (condition) {
				System.out.println("Informe 0 para sair");
				System.out.println("Informe um número: ");
				int n1 = scan.nextInt(); 
				int n2 = 1;
				if(n1==0) {
					condition = false;
				}else if(n1>16) {
					condition = false;
				}else if(n1<0) {
					condition = false;
				}else{
					for (int i = n1; i > 0; i--) {
						n2 *= i;
						System.out.print(i + ".");
					}
					System.out.println(" = " + n2);
				}
			}
		}
			

	}

}
