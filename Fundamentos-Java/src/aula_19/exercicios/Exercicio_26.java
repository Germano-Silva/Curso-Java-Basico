package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_26
 * 
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um
 * vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
 * a) Ci deverá receber 1 quando Ai for maior que Bi; b) Ci deverá receber 0
 * quando Ai for igual a Bi; c) Ci deverá receber -1 quando Ai for menor que Bi.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_26 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			int[] b = new int[a.length];
			int[] c = new int[a.length];
			
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição A = " + i);
				a[i] = scan.nextInt();
			}
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição B = " + i);
				b[i] = scan.nextInt();
				
				if(a[i]==b[i]) {
					c[i] = 0;
				}else if(a[i]>b[i]) {
					c[i]=1;
				}else {
					c[i] = -1;
				}
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
			
			System.out.print("Vetor C = ");
			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i] + " ");
			}
			System.out.println();
		}

	}

}
