package aula_19.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**Exercicio_21
 * 
 * Implementar um programa que obtenha a cotação do dólar (U$) em
 * relação ao real (R$) e a seguir armazene em vetor A com 20
 * elementos as seguintes conversões:
 * A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_21 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double[] a = new double[20];
			double cotacao;
			
			System.out.println("Informe a cotação do dolar: ");
			cotacao = scan.nextDouble();
			
			for (int i = 0; i < a.length; i++) {
				a[i] = cotacao*(i+1);
			}
			System.out.println("Cotação dolar = ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(new DecimalFormat("#,##0.00").format(a[i]) + " - ");
			}
			System.out.println();
			
		}

	}

}
