package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 14
 * 
 * Faça um programa que peça 10 números inteiros, calcule e mostre a
 * quantidade de números pares e a quantidade de números impares.
 * 
 * @author Germano
 */


public class Exercicio_14 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			int n1;
			int par = 0;
			int imp =0;
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Informe um número: ");
				n1 = scan.nextInt();
				if(n1%2 ==0) {
					//numero par
					par++;
				}else if(n1%2!=0) {
					//numero impar
					imp++;
				}
				}
			System.out.println("A quantidade de números pares é "+ par);
			System.out.println("A quantidade de números impares é "+ imp);
		}

	}

}
