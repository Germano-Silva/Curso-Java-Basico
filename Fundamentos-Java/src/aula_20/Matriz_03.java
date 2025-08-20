package aula_20;

import java.util.Scanner;

/**
 * Matriz Irregular
 * 
 * Escreva um programa para guardar dados de uma pesquisa feita com uma amostra
 * de pessoas da avenida mais movimentada da cidade onde você mora.
 * A pesquisa consiste em perguntar ao cidadão a quantidade de filhos e o nome
 * de cada filho.
 * Guarde essas informações em uma matriz de forma que cada pessoa entrevista
 * ocupe somente o
 * espaço necessário na memória para guardar os nomes dos filhos.
 * Imprima a quantidade de pessoas entrevistadas, a quantidade de filhos de cada
 * entrevistado e os resnectivos nomes dos filhos.
 */

public class Matriz_03 {

	public static void main(String[] args) {

		// Cria um objeto Scanner para ler entrada do usuário
		Scanner scan = new Scanner(System.in);

		// Solicita e lê o número de pessoas que serão entrevistadas
		System.out.println("Entre com o número de pessoas que serão entrevistadas:");
		int numEntrevistados = scan.nextInt();

		// Cria uma matriz de strings para armazenar os nomes dos filhos de cada
		// entrevistado
		// A primeira dimensão representa cada pessoa entrevistada
		// A segunda dimensão será definida dinamicamente com base no número de filhos
		// de cada pessoa
		String[][] nomesFilhos = new String[numEntrevistados][];

		// Loop para percorrer cada pessoa entrevistada
		for (int i = 0; i < nomesFilhos.length; i++) {

			// Solicita e lê a quantidade de filhos da pessoa atual
			System.out.println("Entre com a quantidade de filhos");
			int qtdFilhos = scan.nextInt();

			// Inicializa o array de nomes dos filhos para a pessoa atual
			nomesFilhos[i] = new String[qtdFilhos];

			// Loop para percorrer cada filho da pessoa atual
			for (int j = 0; j < nomesFilhos[i].length; j++) {

				// Solicita e lê o nome do filho atual
				System.out.println("Digite o nome do filho " + (j + 1));
				nomesFilhos[i][j] = scan.next();
			}
		}

		// Loop para exibir os resultados da pesquisa
		for (int i = 0; i < nomesFilhos.length; i++) {
			// Mostra quantos filhos a pessoa tem
			System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");

			// Loop para mostrar o nome de cada filho
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}
	}

}
