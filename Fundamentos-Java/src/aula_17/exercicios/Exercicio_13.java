package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 13
 * 
 * Faça um programa que peça dois números, base e expoente, calcule e
 * mostre o primeiro número elevado ao segundo número. Não utilize a
 * função de potência da linguagem.
 * 
 * @author Germano
 */


public class Exercicio_13 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe o número que representa a base: ");
			int n1 = scan.nextInt(); 
			System.out.println("Informe o número que representa o expoente: ");
			int n2 = scan.nextInt(); 
			
			int potencia = n1; 
			
			if(n2==0) {
				System.out.println("1");
			}else if(n2==1) {
				System.out.println(n1);
			}else if(n2>=2) {
				for (int i = 1; i < n2; i++) {
					potencia *= n1;
					System.out.println(potencia);
				}
			}
			}
		}

	}

