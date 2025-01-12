package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 25
 * 
 * Faça um programa que peça para n pessoas a sua idade, ao final o 
 * programa devera verificar se a média de idade da turma varia entre 0 e 
 * 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta 
 * ou idosa, conforme a média calculada.
 * 
 * @author Germano
 */


public class Exercicio_25 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe a quantidade de pessoas que tem na sala: ");
			double np = scan.nextDouble();
			double id;
			double s = 0;
			double m;
			
			for(int i = 0;i<np;i++) {
				System.out.println("Informe a idade das pessoas da turma: ");
				id = scan.nextDouble();
				s+=id;
				
			}
			
			m = s/np;
			
			if(m<=25) {
				System.out.println("A turma é jovem");
			}else if(m>25 && m<60) {
				System.out.println("A turma é adulta");
			}if(m > 60) {
				System.out.println("A turma é idosa");
			}
			
		}

	}

}
