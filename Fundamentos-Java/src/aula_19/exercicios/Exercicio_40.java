package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_40
 * 
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver um
 * programa que crie um vetor C que é a diferença dos conjuntos formados pelos
 * elementos dos vetores A e B. Diferença de conjuntos = todos os elementos do
 * conjunto A que não existem no conjunto B.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_40 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			int[] a = new int[10];
	        int[] b = new int[a.length];
	        int[] c = new int[a.length];
	        int cont = 0;
	        
	        for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição A = " + i);
				a[i] = scan.nextInt();
			}
	        
	        for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição B = " + i);
				b[i] = scan.nextInt();
			}
	        
	        for(int i = 0; i < a.length; i++) {
	            boolean encontrado = false;
	            for(int j = 0; j < b.length; j++) {
	                if(a[i] == b[j]) {
	                    encontrado = true;
	                    break;
	                }
	            }
	            if(!encontrado) {
	                c[cont] = a[i];
	                cont++;
	            }
	        }
	        if(cont == 0) {
	            System.out.println("Não há diferenças entre os vetores.");
	        } else {
	            System.out.print("Vetor C: {");
	            for(int i = 0; i < cont; i++) {
	                System.out.print(c[i]);
	                if(i < cont - 1) {
	                    System.out.print(", ");
	                }
	            }
	            System.out.println("}");
	        }
		}

	}

}
