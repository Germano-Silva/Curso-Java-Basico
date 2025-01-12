package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 15
 * 
 * A série de Fibonacci é formada pela seqüência
 * 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
 * até o n−ésimo termo.
 * 
 * @author Germano
 */


public class Exercicio_15 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe o n-ésimo termo de fibonacci:: ");
			int n = scan.nextInt(); 
			int p = 1;
			int s = 1;
			int n2;
			
			for (int i = 3; i <= n; i++) {
				n2=p+s;
				p=s;
				s=n2;
				
				System.out.println(n2);
			}
		}

	}

}
