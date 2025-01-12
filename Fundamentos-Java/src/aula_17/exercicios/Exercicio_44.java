package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 44
 * 
 * Em uma eleição presidencial existem quatro candidatos. Os votos são 
 * informados por meio de código. Os códigos utilizados são:
 *  1, 2, 3, 4 - Votos para os respectivos candidatos 
 *  (você deve montar a tabela ex: 1 - Jose/ 2- João/etc) 
 *  5 - Voto Nulo 
 *  6 - Voto em Branco
 * Faça um programa que calcule e mostre:
 *  O total de votos para cada candidato;
 *  O total de votos nulos;
 *  O total de votos em branco;
 *  A percentagem de votos nulos sobre o total de votos;
 *  A percentagem de votos em branco sobre o total de votos. Para 
 * finalizar o conjunto de votos tem-se o valor zero.
 * 
 * @author Germano
 */


public class Exercicio_44 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int vCandidato1 = 0;
	        int vCandidato2 = 0;
	        int vCandidato3 = 0;
	        int vCandidato4 = 0;
	        int vNulos = 0;
	        int vEmBranco = 0;
	        int voto;
	        
	        do {
	            System.out.println("Digite o código do candidato (1 a 4), ou 5 para voto nulo, ou 6 para voto em branco:");
	            voto = scan.nextInt();
	            
	            switch(voto) {
	                case 1:
	                    vCandidato1++;
	                    break;
	                case 2:
	                    vCandidato2++;
	                    break;
	                case 3:
	                    vCandidato3++;
	                    break;
	                case 4:
	                    vCandidato4++;
	                    break;
	                case 5:
	                    vNulos++;
	                    break;
	                case 6:
	                    vEmBranco++;
	                    break;
	                default:
	                    System.out.println("Código inválido! Digite novamente.");
	            }
	        } while (voto != 0);
	        
	        int totalVotos = vCandidato1 + vCandidato2 + vCandidato3 + vCandidato4 + vNulos + vEmBranco;
	        double percentualNulos = (double) vNulos / totalVotos * 100;
	        double percentualEmBranco = (double) vEmBranco / totalVotos * 100;
	        
	        System.out.println("Resultado da eleição:");
	        System.out.println("Candidato 1: " + vCandidato1 + " votos");
	        System.out.println("Candidato 2: " + vCandidato2 + " votos");
	        System.out.println("Candidato 3: " + vCandidato3 + " votos");
	        System.out.println("Candidato 4: " + vCandidato4 + " votos");
	        System.out.println("Votos nulos: " + vNulos);
	        System.out.println("Votos em branco: " + vEmBranco);
	        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
	        System.out.printf("Percentual de votos em branco: %.2f%%\n", percentualEmBranco);
	    }
	}

}
