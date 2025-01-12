package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_24
 * 
 * Números palíndromos são aqueles que escritos da direita para a esquerda têm o
 * mesmo valor quando escritos da esquerda para a direita. Exemplo: 545; 789987;
 * 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A
 * de 10 elementos inteiros é um palíndromo, ou seja, se o primeiro elemento do
 * vetor e igual ao último, se o segundo elemento do vetor é igual ao penúltimo
 * e assim por diante até verificar todos os elementos ou chegar a conclusão que
 * o vetor não é um palíndromo.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_24 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			

			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe um número para a posição: " + (i));
				a[i] = scan.nextInt();

			}
			
			boolean palindromo = true;
			for (int i = 0; i < a.length/2; i++) {
				if (a[i] != a[a.length - 1 -i]) {
					palindromo = false;
					break;
				}
			}
			
			System.out.print("Vetor A = ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			
			if(palindromo) {
				System.out.println("É palindromo.");
			}else {
				System.out.println("Não é palindromo.");
			}

			
		}

	}

}
