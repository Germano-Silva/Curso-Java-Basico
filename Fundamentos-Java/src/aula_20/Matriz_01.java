package aula_20;

public class Matriz_01 {

	public static void main(String[] args) {
		//Instanciando um array de 3 linhas e 4 colunas
		double[][] notasAlunos = new double[3][4];
		
		//atribuindo valores
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 9;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 7;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 6;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 7;
		notasAlunos[2][2] = 6;
		notasAlunos[2][3] = 5;
		
		//imprime endereço de memnoria do array
		for (int i = 0; i < notasAlunos.length; i++) {
			//imprime endereço de memnoria do array notasAlunos[i]
			System.out.println(notasAlunos[i] + " ");
		}
		System.out.println();
		
		
		int cont = 1;
		//imprime os valores do array
		for (int i = 0; i < notasAlunos.length; i++) {
			//System.out.println("Aluno " + (cont++));
			//imprime endereço de memnoria do array notasAlunos[i]
			for (int j = 0; j < notasAlunos[i].length; j++) {
				//imprime o valor do array notasAlunos[i][j]
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();
		
		//imprime os valores do array
		System.out.println("Calculando a média de cada aluno: ");
		double soma;
		double media;
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.println("Aluno " + i);
			//Criando variáveis para somar e calcular a média
			soma = 0;
			media = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				//imprime o valor do array notasAlunos[i][j]
				System.out.println(notasAlunos[i][j]);
				//soma as notas
				soma+=notasAlunos[i][j];
				//calcula a média
				media = (soma/4);
			}
			//imprime a média
			System.out.println("Media do aluno " + i + " é: " + media);
			System.out.println();
		}
		
		System.out.println();

		//array de arrays
		double[] notas = {7,8,9,10};
		//imprime endereço de memnoria do array
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println();
		
		double[][] notas2 = {{7,8,9,10},{7,8,9,10}};
		//imprime endereço de memnoria do array
		System.out.println("Calculando a média de cada aluno: ");
		double soma2;
		//imprime os valores do array
		for (int i = 0; i < notas2.length; i++) {
			System.out.println("Aluno " + i);
			soma2 = 0;
			for (int j = 0; j < notas2[i].length; j++) {
				
				System.out.println(notas2[i][j]);
				soma2+=notas2[i][j];
			}
			System.out.println("Media do aluno " + i + " é: " + (soma2/4));
			System.out.println();
		}
		
	}

}
