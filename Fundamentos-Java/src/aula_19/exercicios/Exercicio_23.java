package aula_19.exercicios;

import java.util.Scanner;

/**Exercicio_23
 * 
 * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
 * que verifique se "todos" os elementos do vetor A são pares. Se pelo
 * menos um elemento do vetor não for par o processo de repetição para
 * percorrer os elementos do vetor deve ser encerrado, como sugestão:
 * utilize uma variável do tipo flag para atingir este propósito.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_23 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			

			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe um número para a posição: " + (i));
				a[i] = scan.nextInt();
				
				if(a[i]%2!=0) {
					break;
				}

			}


			
		}

	}

}
