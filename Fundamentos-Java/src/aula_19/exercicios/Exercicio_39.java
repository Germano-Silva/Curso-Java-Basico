package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_39
 * 
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver um
 * programa que realize a interseção dos vetores A e B para produzir um vetor C.
 * Interseção de conjuntos = todos os elementos que existem em A e também
 * existem em B.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_39 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {

	        int[] a = new int[10];
	        int[] b = new int[a.length];
	        int[] c = new int[a.length];
	        int posC = 0;
	        
	        for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição A = " + i);
				a[i] = scan.nextInt();
			}
	        
	        for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição B = " + i);
				b[i] = scan.nextInt();
			}
	        
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                if (a[i] == b[j]) {
	                    c[posC] = a[i];
	                    posC++;
	                    break;
	                }
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
