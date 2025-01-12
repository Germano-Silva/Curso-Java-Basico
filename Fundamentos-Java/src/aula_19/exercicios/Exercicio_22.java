package aula_19.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**Exercicio_22
 * 
 * Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
 * 0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
 * para implementar um programa que determine o percentual de
 * números 0's e 1's existentes no vetor A.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_22 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double[] a = new double[10];
			int qtd0 = 0;
			int qtd1 = 0;
			
			for (int i = 0; i < a.length; i++) {
				
				a[i] = (int)Math.round(Math.random() * 1);
				
				if (a[i] == 0) {
					qtd0++;
					
				}else {
					qtd1++;
				}
			}
			double porc0 = ((qtd0 *100)/a.length);
			double porc1 = ((qtd1 *100)/a.length);
			
			System.out.println("Vetor A = ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " - ");
			}
			System.out.println();
			
			System.out.println();
			System.out.println("Porcentagem de números 0  "+new DecimalFormat("#,##0.00").format(porc0)+"%");
			System.out.println("Porcentagem de números 0  "+new DecimalFormat("#,##0.00").format(porc1)+"%");
			
			
		}

	}

}
