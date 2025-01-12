package aula_17.exercicios;

/**Exercicio 09
 * 
 * Faça um programa que imprima na tela apenas os números ímpares
 * entre 1 e 50.
 * 
 * @author Germano
 */


public class Exercicio_09 {

	public static void main(String[] args) {
		for (int i = 0; i <= 50; i++) {
			if(i%2!=0) {
				System.out.println(i+" ");
			}
			
			
			if(i%2==0) {
				System.out.println(i+" ");
			}
		}

	}

}
