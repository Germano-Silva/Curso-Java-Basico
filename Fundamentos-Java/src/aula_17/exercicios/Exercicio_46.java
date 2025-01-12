package aula_17.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**Exercicio 46
 * 
 * Em uma competição de salto em distância cada atleta tem direito a 
 * cinco saltos. No final da série de saltos de cada atleta, o melhor e o 
 * pior resultados são eliminados. O seu resultado fica sendo a média 
 * dos três valores restantes. Você deve fazer um programa que receba o 
 * nome e as cinco distâncias alcançadas pelo atleta em seus saltos e 
 * depois informe a média dos saltos conforme a descrição acima 
 * informada (retirar o melhor e o pior salto e depois calcular a média). 
 * Faça uso de uma lista para armazenar os saltos. Os saltos são 
 * informados na ordem da execução, portanto não são ordenados. O 
 * programa deve ser encerrado quando não for informado o nome do 
 * atleta. A saída do programa deve ser conforme o exemplo abaixo:
 * Atleta: Rodrigo Curvêllo 
 * Primeiro Salto: 6.5 m 
 * Segundo Salto: 6.1 m 
 * Terceiro Salto: 6.2 m 
 * Quarto Salto: 5.4 m 
 * Quinto Salto: 5.3 m 
 * Melhor salto: 6.5 m 
 * Pior salto: 5.3 m 
 * Média dos demais saltos: 5.9 m 
 * Resultado final: 
 * Rodrigo Curvêllo: 5.9 m
 * 
 * @author Germano
 */


public class Exercicio_46 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
	        double melhorSalto;
	        double piorSalto;
	        double somaSaltos;
	        double distancia;
	        int contSaltos;
	        String nomeAtleta;
	        
	        while (true) {
	            System.out.print("Nome do atleta: ");
	            nomeAtleta = scan.nextLine();
	            
	            if (nomeAtleta.isEmpty()) {
	                break;
	            }
	            
	            contSaltos = 1;
	            somaSaltos = 0;
	            melhorSalto = 0;
	            piorSalto = Double.MAX_VALUE;
	            
	            while (contSaltos <= 5) {
	                System.out.printf("Digite a distância do %dº salto: ", contSaltos);
	                distancia = scan.nextDouble();
	                
	                if (distancia > melhorSalto) {
	                    melhorSalto = distancia;
	                }
	                
	                if (distancia < piorSalto) {
	                    piorSalto = distancia;
	                }
	                
	                somaSaltos += distancia;
	                contSaltos++;
	            }
	            
	            double mediaSaltos = (somaSaltos - melhorSalto - piorSalto) / 3;
	            
	            System.out.println("Resultado final:");
	            System.out.println("Atleta: "+ nomeAtleta);
	            System.out.println("Melhor salto: " + new DecimalFormat("#,##0.00").format(melhorSalto) + "m");
	            System.out.println("Pior salto: "+ new DecimalFormat("#,##0.00").format(piorSalto) +"m");
	            System.out.println("Média dos demais saltos: "+ new DecimalFormat("#,##0.00").format(mediaSaltos)+ "m");
	            System.out.println("Resultado final: "+ new DecimalFormat("#,##0.00").format(mediaSaltos)+ "m");
	            
	        }
	    }
	}

}
