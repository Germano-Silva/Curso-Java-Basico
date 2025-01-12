package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 42
 * 
 * Faça um programa que leia uma quantidade indeterminada de 
 * números positivos e conte quantos deles estão nos seguintes 
 * intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados 
 * deverá terminar quando for lido um número negativo.
 * 
 * @author Germano
 */


public class Exercicio_42 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
	        int n;
	        int i1 = 0;
	        int i2 = 0;
	        int i3 = 0;
	        int i4 = 0;
	
	        System.out.print("Digite um número positivo ou um número negativo para sair: ");
	        n = scan.nextInt();
	
	        while (n >= 0) {
	            if (n >= 0 && n <= 25) {
	                i1++;
	            } else if (n >= 26 && n <= 50) {
	                i2++;
	            } else if (n >= 51 && n <= 75) {
	                i3++;
	            } else if (n >= 76 && n <= 100) {
	                i4++;
	            }
	
	            System.out.print("Digite um número positivo ou um número negativo para sair: ");
	            n = scan.nextInt();
	        }
	
	        System.out.println("Intervalo entre 0 a 25: " + i1);
	        System.out.println("Intervalo entre 26 a 50: " + i2);
	        System.out.println("Intervalo entre 51 a 75: " + i3);
	        System.out.println("Intervalo entre 76 a 100: " + i4);
	    }
	}

}
