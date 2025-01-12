package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 26
 * 
 * Numa eleição existem três candidatos. Faça um programa que peça o 
 * número total de eleitores. Peça para cada eleitor votar e ao final 
 * mostrar o número de votos de cada candidato.
 * 
 * @author Germano
 */


public class Exercicio_26 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
		System.out.print("Digite o número total de eleitores: ");
        int tEleitores = scan.nextInt();
        scan.nextLine();

        int vC1 = 0;
        int vC2 = 0;
        int vC3 = 0;

        for (int i = 1; i <= tEleitores; i++) {
            System.out.println("Eleitor " + i + ", vote em um dos candidatos: ");
            System.out.println("1 - Candidato 1");
            System.out.println("2 - Candidato 2");
            System.out.println("3 - Candidato 3");
            int voto = scan.nextInt();
            scan.nextLine();

            switch (voto) {
                case 1:
                	vC1++;
                    break;
                case 2:
                	vC2++;
                    break;
                case 3:
                	vC3++;
                    break;
                default:
                    System.out.println("Opção inválida! Voto não computado.");
                    break;
            }
        }

        System.out.println("Votos do Candidato 1: " + vC1);
        System.out.println("Votos do Candidato 2: " + vC2);
        System.out.println("Votos do Candidato 3: " + vC3);

		}
	}
}
