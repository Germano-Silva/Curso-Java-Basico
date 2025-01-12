package aula_13.exercicios;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Informe o tamanho do arquivo:");
			double tamanhoA = scan.nextDouble();
			
			System.out.print("Informe a velocidade da internet:");
			double velocidadeI = scan.nextDouble();
			
			double tempo = tamanhoA/velocidadeI;
			
			System.out.println("Tempo de download: " + tempo);
		}

	}

}
