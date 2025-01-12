package aula_19.exercicios;

import java.util.Scanner;

/**Exercicio_16
 * 
 * .Criar um vetor A com 10 elementos inteiros. Escrever um programa
 * que calcule e escreva: a) a soma de elementos armazenados neste
 * vetor que são inferiores a 15; b) a quantidade de elementos
 * armazenados no vetor que são iguais a 15; e c) a média dos
 * elementos armazenados no vetor que são superiores a 15.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_16 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];

			for (int i = 0; i < a.length; i++) {
				System.out.println("Informe com o valor da posição: " + i);
				a[i] = scan.nextInt();

			}
			int elementos =0;
			int iguais = 0;
			int maior = 0;
			int somaMaior = 0;
			
			for (int i = 0; i < a.length; i++) {
				if (a[i] <15) {
					elementos+=a[i];
				}
				if (a[i]==15) {
					iguais++;
				}
				if (a[i]>15) {
					maior++;
					somaMaior+=a[i];
				}

			}
			
			System.out.println();
			System.out.print("Vetor A = ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");

			}
			
			System.out.println();
			System.out.println("Quantidade números igual a 15 é: "+iguais);
			System.out.println("Soma dos números maior que 15 é: "+somaMaior);
			System.out.println("Soma dos números menor que 15 é: "+elementos);
			System.out.println("Media dos números maior que 15 é: "+(somaMaior/maior));
		}
	}
}
