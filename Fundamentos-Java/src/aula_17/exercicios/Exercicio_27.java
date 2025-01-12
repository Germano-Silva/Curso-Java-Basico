package aula_17.exercicios;

import java.util.Scanner;

/**
 * Exercicio 27
 * 
 * Faça um programa que calcule o número médio de alunos por turma. Para isto,
 * peça a quantidade de turmas e a quantidade de alunos para cada turma. As
 * turmas não podem ter mais de 40 alunos.
 * 
 * @author Germano
 */

public class Exercicio_27 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("Informe a quantidade de turmas: ");
			double t = scan.nextDouble();

			double a;
			double s = 0;
			double m;
			boolean v = true;

			for (int i = 1; i <= t; i++) {
				v = true;
				do {
					System.out.println("Informe a quantidade de alunos da turma " + i);
					a = scan.nextDouble();
					if (a > 0 && a <= 40) {
						v = false;
					} else {
						System.out.println("A turma não pode ter mais que 40 alunos.");
					}
				} while (v);

				s += a;

			}
			m = s / t;
			System.out.println("a medias de alunos por turma é: " + m);

		}

	}

}
