package aula_19.exercicios;

import java.util.Scanner;

/**Exercicio_42
 * 
 * Ler 10 elementos inteiros em um vetor A e colocá-los em ordem
 * crescente e apresentar os elementos ordenados.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_42 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
	        
	        for(int i = 0; i < a.length; i++) {
	            System.out.print("Digite o " + (i+1) + "º elemento: ");
	            a[i] = scan.nextInt();
	        }
	        
	        int temp;
	        for(int i = 0; i < a.length-1; i++) {
	            for(int j = i+1; j < a.length; j++) {
	                if(a[i] > a[j]) {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        
	        System.out.println("Elementos do vetor em ordem crescente:");
	        for(int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
		}

	}

}
