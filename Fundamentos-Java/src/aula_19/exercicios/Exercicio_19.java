package aula_19.exercicios;

import java.util.Scanner;

/**
 * Exercicio_19
 * 
 * Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as
 * notas informadas em dois vetores “Nota1” e “Nota2” do tipo real. Escreva um
 * programa que calcule a média aritmética simples das notas informadas
 * armazenando o resultado em um vetor “Result” de mesmo tipo e tamanho. Ao
 * mostrar os resultados exibir a situação de cada aluno. Se a média calculada
 * for superior ou igual a 7 o aluno estará “aprovado”, caso contrário, a
 * situação do aluno será “reprovado”
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_19 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double[] nota1 = new double[2];
			double[] nota2 = new double[nota1.length];
			double[] resultado = new double[nota1.length];

			for (int i = 0; i < nota1.length; i++) {
				System.out.println("Informe a primeira nota do aluno: " + (i + 1));
				nota1[i] = scan.nextDouble();

				System.out.println("Informe a segunda nota do aluno: " + (i + 1));
				nota2[i] = scan.nextDouble();

				resultado[i] = ((nota1[i] + nota2[i]) / 2);

			}

			System.out.println();
			System.out.print("Notas 1 = ");
			for (int i = 0; i < nota1.length; i++) {
				System.out.print(nota1[i] + " ");

			}

			System.out.println();
			System.out.print("Notas 2 = ");
			for (int i = 0; i < nota2.length; i++) {
				System.out.print(nota2[i] + " ");

			}

			System.out.println();
			System.out.println("Resultados = ");
			for (int i = 0; i < resultado.length; i++) {
				System.out.print("Aluno " + (i + 1) + " = ");
				if (resultado[i] >= 7) {
					System.out.println(resultado[i] + " Aprovado ");

				} else {
					System.out.println(resultado[i] + " Reprovado ");
				}
			}

		}
	}
}
