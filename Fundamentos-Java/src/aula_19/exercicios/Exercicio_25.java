package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_25
 * 
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
 * tipo e tamanho, obedecendo as seguintes regras de formação: a) Bi deverá
 * receber 1 quando Ai for par; b) Bi deverá receber 0 quando Ai for ímpar.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_25 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			int[] b = new int[a.length];

			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe um número para a posição: " + (i));
				a[i] = scan.nextInt();
				
				b[i] = (a[i]%2 == 0)?1:0;
			}
			
			System.out.print("Vetor A = ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			
			System.out.print("Vetor B = ");
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
		}
	}

}
