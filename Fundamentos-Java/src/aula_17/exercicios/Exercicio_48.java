package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 48
 * 
 * Faça um programa que peça um numero inteiro positivo e em seguida mostre este 
 * numero invertido.
 * Exemplo:
 * 12376489 
 * => 98467321
 * 
 * @author Germano
 */


public class Exercicio_48 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
	        System.out.print("Digite um número inteiro positivo: ");
	        int n = scan.nextInt();
	        scan.nextLine();
	
	        String nString = Integer.toString(n);
	        String nIString = "";
	
	        for (int i = nString.length() - 1; i >= 0; i--) {
	            nIString += nString.charAt(i);
	        }
	
	        int nInvertido = Integer.parseInt(nIString);
	
	        System.out.println("O número " + n + " invertido é " + nInvertido + ".");
    }
	}

}
