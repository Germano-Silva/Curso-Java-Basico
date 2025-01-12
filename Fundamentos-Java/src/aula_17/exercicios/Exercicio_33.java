package aula_17.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**Exercicio 33
 * 
 * 33.O Departamento Estadual de Meteorologia lhe contratou para 
 * desenvolver um programa que leia as um conjunto indeterminado de 
 * temperaturas, e informe ao final a menor e a maior temperaturas 
 * informadas, bem como a média das temperaturas
 * 
 * @author Germano
 */


public class Exercicio_33 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com a quantidade de temperaturas: ");
			int qtdTemperaturas = scan.nextInt();
			double temperatura;
			double soma = 0;
			double menor = Double.MAX_VALUE;
			double maior = Double.MIN_VALUE;
			double media;
			for (int i = 1; i <= qtdTemperaturas; i++) {
				System.out.println("Entre com a temperatura "+i);
				temperatura = scan.nextDouble();
				soma+=temperatura;
				if (temperatura > maior) {
					maior = temperatura;
				}
				if (temperatura < menor) {
					menor = temperatura;
				}
			}
			media = soma/qtdTemperaturas;
			System.out.println("Media: "+ new DecimalFormat("#,##0.00").format(media) );
			System.out.println("Menor temperatura " + new DecimalFormat("#,##0.00").format(menor));
			System.out.println("Menor temperatura " + new DecimalFormat("#,##0.00").format(maior));
		}

	}

}
