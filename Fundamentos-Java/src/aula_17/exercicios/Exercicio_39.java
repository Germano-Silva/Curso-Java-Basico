package aula_17.exercicios;


import java.text.DecimalFormat;
import java.util.Scanner;

/**Exercicio 39
 * 
 * Faça um programa que leia dez conjuntos de dois valores, o primeiro 
 * representando o número do aluno e o segundo representando a sua 
 * altura em centímetros. Encontre o aluno mais alto e o mais baixo. 
 * Mostre o número do aluno mais alto e o número do aluno mais baixo, 
 * junto com suas alturas.
 * 
 * @author Germano
 */


public class Exercicio_39 {



	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
	        int numAlunoMaisAlto = 0;
	        int numAlunoMaisBaixo = 0;
	        double alturaMaisAlta = 0;
	        double alturaMaisBaixa = Double.MAX_VALUE;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o número do " + i + "º aluno: ");
	            int numAluno = scan.nextInt();
	            System.out.print("Digite a altura do " + i + "º aluno: ");
	            double altura = scan.nextDouble();
	            scan.nextLine();

	            if (altura > alturaMaisAlta) {
	                numAlunoMaisAlto = numAluno;
	                alturaMaisAlta = altura;
	            }

	            if (altura < alturaMaisBaixa) {
	                numAlunoMaisBaixo = numAluno;
	                alturaMaisBaixa = altura;
	            }
	        }

	        System.out.println("O aluno mais alto é o número " + numAlunoMaisAlto + " com " + new DecimalFormat("#,##0.00").format(alturaMaisAlta) + "cm.");
	        System.out.println("O aluno mais baixo é o número " + numAlunoMaisBaixo + " com " + new DecimalFormat("#,##0.00").format(alturaMaisBaixa) + "cm.");
	    }

	}

}
