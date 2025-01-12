package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 19
 * 
 * Altere o programa anterior para que ele aceite apenas números entre 0 
 * e 1000.
 * 
 * @author Germano
 */


public class Exercicio_19 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe o valor de números que deseja informar: ");
			int qn = scan.nextInt();
			int n;
			int maior = Integer.MIN_VALUE;
			int menor = Integer.MAX_VALUE;
			
			for (int i = 0; i < qn; i++) {
				System.out.println("Informe um número: ");
				n = scan.nextInt();
				
					if(n<0 || n>1000){
						System.out.println("Número informado é invalido");
						System.out.println("informe números de 0 a 1000");
						System.exit(i);
					}else if(n>=0 && n<=1000) {
						if(n>maior) {
							maior = n;
							System.out.println("O numero maior mudou: " + maior);
						}
						if(n<menor) {
							menor = n;
							System.out.println("O numero maior mudou: " + menor);
						}
					}
			}
			
			System.out.println("O maior número digitado foi: " + maior);
			System.out.println("O menor número digitado foi: " + menor);
			System.out.println("A soma do maior com o menor é:  " + (menor + maior));
		}

	}

	}

