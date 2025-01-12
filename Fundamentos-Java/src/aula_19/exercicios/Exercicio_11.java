package aula_19.exercicios;

import java.util.Scanner;

/**Exercicio_11
 * 
 * Criar um vetor A com 10 elementos inteiros. Implementar um programa
 * que defina e escreva a quantidade de elementos armazenados neste
 * vetor que são pares.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_11 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe com o valor da posição: " + i);
				a[i] = scan.nextInt();
				
			}
			int qtdPares = 0;
			System.out.print("Vetor A = ");
			for(int i = 0; i<a.length; i++) {
				if (a[i]%2 ==0) {
					System.out.print(a[i] + " ");
					qtdPares++;
				}
				
			}
			System.out.println("Quantidade de valores pares = " + qtdPares);
		}
	}
}
