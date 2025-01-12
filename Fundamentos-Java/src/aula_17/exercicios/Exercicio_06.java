package aula_17.exercicios;

/**Exercicio 
 * 
 * Faça um programa que imprima na tela os números de 1 a 20, um
 * abaixo do outro. Depois modifique o programa para que ele mostre os
 * números um ao lado do outro.
 * 
 * @author Germano
 */

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			for (int i = 0; i <= 20; i++) {
				System.out.println(i);
			}
			for (int i = 0; i <= 20; i++) {
				System.out.print(i+ " ");
			}
			
		}

	}

}
