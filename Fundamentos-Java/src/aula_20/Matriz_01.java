package aula_20;

public class Matriz_01 {

	public static void main(String[] args) {
		double[][] notasAlunos = new double[3][4];
		
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
		
		//imprime endereço de memnoria
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.println(notasAlunos[i] + " ");
		}
		System.out.println();
		
		int cont = 1;
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.println("Aluno " + (cont++));
			for (int j = 0; j < notasAlunos[i].length; j++) {
				
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("Calculando a média de cada aluno: ");
		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.println("Aluno " + i);
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				
				System.out.println(notasAlunos[i][j]);
				soma+=notasAlunos[i][j];
			}
			System.out.println("Media do aluno " + i + " é: " + (soma/4));
			System.out.println();
		}
		
		System.out.println();
		
		double[] notas = {7,8,9,10};
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println();
		
		double[][] notas2 = {{7,8,9,10},{7,8,9,10}};
		System.out.println("Calculando a média de cada aluno: ");
		double soma2;
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
