package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 16
 * 
 * A série de Fibonacci é formada pela seqüência
 * 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
 * que o valor seja maior que 500.
 * 
 * @author Germano
 */


public class Exercicio_16 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
/**			Outro meio de realizar por for
 * 			
 * 			int p = 1;
 * 			int s = 1;
 * 			int n2;
 *			System.out.println(p);
 *			System.out.println(s);
 *			for (int i = 3; i <= 15; i++) {
 *				n2=p+s;
 *				p=s;
 *				s=n2;
 *				
 *				System.out.println(n2);
 *				if(n2>600) {
 *					System.exit(s);
 *			}
 *			}
 */
			
			int p = 1;
			int s = 1;
			int n2 = 0;
			
			System.out.println(p);
			System.out.println(s);
			
			while (n2<=500) {
				n2=p+s;
				p=s;
				s=n2;
				
				System.out.println(n2);
				
			}
		}
	}
}
