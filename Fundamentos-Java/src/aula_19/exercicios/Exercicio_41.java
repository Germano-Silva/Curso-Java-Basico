package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_41
 * 
 * Ler 10 elementos inteiros em um vetor A. Montar uma rotina de busca, para
 * pesquisar se um dado elemento X está armazenado em A.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_41 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
	        
	        
	        for(int i = 0; i < a.length; i++) {
	            System.out.print("Digite o " + (i+1) + "º elemento: ");
	            a[i] = scan.nextInt();
	        }
	        
	        
	        System.out.print("Digite o elemento a ser buscado: ");
	        int X = scan.nextInt();
	        
	        
	        boolean encontrado = false;
	        for(int i = 0; i < a.length; i++) {
	            if(a[i] == X) {
	                encontrado = true;
	                break;
	            }
	        }
	        
	       
	        if(encontrado) {
	            System.out.println("O elemento " + X + " foi encontrado no vetor.");
	        } else {
	            System.out.println("O elemento " + X + " não foi encontrado no vetor.");
	        }
		}
	}
}
