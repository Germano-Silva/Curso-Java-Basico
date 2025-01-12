package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_38
 * 
 * Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo e
 * tamanho, sendo que cada elemento de B deverá ser o seguinte somatório: Bi =
 * Somatório de Aj, para todo j variando de i até 10.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_38 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
        int[] a = new int[10];
        int[] b = new int[a.length];
        
        for (int i = 0; i < a.length; i++) {
			System.out.println("Entre com um número para a posição A = " + i);
			a[i] = scan.nextInt();
		}
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                b[i] += a[j];
            }
        }
        
        System.out.print("Vetor A = ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		}
	}

}
