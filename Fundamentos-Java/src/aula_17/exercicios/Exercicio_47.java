package aula_17.exercicios;

import java.util.Scanner;

/**
 * Exercicio 47
 * 
 * Em uma competição de ginástica, cada atleta recebe votos de sete 
 * jurados. A melhor e a pior nota são eliminadas. A sua nota fica sendo 
 * a média dos votos restantes. Você deve fazer um programa que 
 * receba o nome do ginasta e as notas dos sete jurados alcançadas pelo 
 * atleta em sua apresentação e depois informe a sua média, conforme a 
 * descrição acima informada (retirar o melhor e o pior salto e depois 
 * calcular a média com as notas restantes). As notas não são 
 * informados ordenadas. Um exemplo de saída do programa deve ser 
 * conforme o exemplo abaixo:
 * Atleta: Aparecido Parente 
 * Nota: 9.9 
 * Nota: 7.5 
 * Nota: 9.5 
 * Nota: 8.5 
 * Nota: 9.0 
 * Nota: 8.5 
 * Nota: 9.7 
 * Resultado final: 
 * Atleta: Aparecido Parente 
 * Melhor nota: 9.9 
 * Pior nota: 7.5 
 * Média: 9,04
 * 
 * @author Germano
 */

public class Exercicio_47 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {

			System.out.print("Digite o nome do ginasta: ");
			String nome = scan.nextLine();

			double nota1;
			double nota2;
			double nota3;
			double nota4;
			double nota5;
			double nota6;
			double nota7;

			System.out.print("Digite a nota do primeiro jurado: ");
			nota1 = scan.nextDouble();
			System.out.print("Digite a nota do segundo jurado: ");
			nota2 = scan.nextDouble();
			System.out.print("Digite a nota do terceiro jurado: ");
			nota3 = scan.nextDouble();
			System.out.print("Digite a nota do quarto jurado: ");
			nota4 = scan.nextDouble();
			System.out.print("Digite a nota do quinto jurado: ");
			nota5 = scan.nextDouble();
			System.out.print("Digite a nota do sexto jurado: ");
			nota6 = scan.nextDouble();
			System.out.print("Digite a nota do sétimo jurado: ");
			nota7 = scan.nextDouble();

			// Encontra a melhor e a pior nota
			double menorNota = Math.min(nota1,
					Math.min(nota2, Math.min(nota3, Math.min(nota4, Math.min(nota5, Math.min(nota6, nota7))))));
			double maiorNota = Math.max(nota1,
					Math.max(nota2, Math.max(nota3, Math.max(nota4, Math.max(nota5, Math.max(nota6, nota7))))));

			double media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 - menorNota - maiorNota) / 5;

			// Exibe o resultado final
			System.out.println("Atleta: " + nome);
			System.out.println("Melhor nota: " + maiorNota);
			System.out.println("Pior nota: " + menorNota);
			System.out.printf("Média: %.2f", media);
		}
	}

}
