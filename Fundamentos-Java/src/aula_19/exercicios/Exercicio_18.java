package aula_19.exercicios;
import java.util.Scanner;

/**Exercicio_18
 * 
 * Ler um vetor A com 10 elementos inteiros correspondentes as idades
 * de um grupo de pessoas. Escreva um programa que determine e
 * escreva a menor e a maior idades e suas respectivas posições.
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_18 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] idades = new int[10];
			
			
			for (int i = 0; i < idades.length; i++) {
				System.out.println("Informe com o valor da posição: " + (i+1));
				idades[i] = scan.nextInt();

			}
			
			int menor = idades[0];
			int indexMenor = 0;
			int maior = idades[0];
			int indexMaior = 0;
			
			for (int i = 1; i < idades.length; i++) {
				if (idades[i] >maior) {
					maior = idades[i];
					indexMaior = i;
				}else if(idades[i]<menor) {
					menor = idades[i];
					indexMenor = i;
				}
			}
			
			System.out.println();
			System.out.print("Vetor A = ");
			for (int i = 0; i < idades.length; i++) {
				System.out.print(idades[i] + " ");

			}
			
			System.out.println();
			System.out.println("A pessoa mais velha tem: " + maior);
			System.out.println("A pessoa mais velha esta na posição: " + indexMaior);
			System.out.println("A pessoa mais nova tem: " + menor);
			System.out.println("A pessoa mais nova esta na posição: " + indexMenor);
		}
		
	}
}
