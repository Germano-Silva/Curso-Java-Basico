package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 40
 * 
 * Foi feita uma estatística em cinco cidades brasileiras para coletar 
 * dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
 * A. Código da cidade;
 * B. Número de veículos de passeio (em 1999);
 * C. Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
 * D. Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
 * E. Qual a média de veículos nas cinco cidades juntas;
 * F. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
 * 
 * @author Germano
 */


public class Exercicio_40 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
	        int codCidade;
	        int nVeiculos;
	        int nAcidentes;
	        int maiorIndiceAcidentes = 0;
	        int menorIndiceAcidentes = Integer.MAX_VALUE;
	        int sVeiculos = 0;
	        int nCidadesMenos2000 = 0;
	        int sAcidentesMenos2000 = 0;
	        
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Cidade " + i + ":");
	            
	            System.out.print("Código da cidade: ");
	            codCidade = scan.nextInt();
	            
	            System.out.print("Número de veículos de passeio (em 1999): ");
	            nVeiculos = scan.nextInt();
	            sVeiculos += nVeiculos;
	            
	            System.out.print("Número de acidentes de trânsito com vítimas (em 1999): ");
	            nAcidentes = scan.nextInt();
	            
	            if (nAcidentes > maiorIndiceAcidentes) {
	                maiorIndiceAcidentes = nAcidentes;
	                System.out.println("Nova cidade com o maior índice de acidentes de trânsito: " + codCidade);
	            }
	            
	            if (nAcidentes < menorIndiceAcidentes) {
	                menorIndiceAcidentes = nAcidentes;
	                System.out.println("Nova cidade com o menor índice de acidentes de trânsito: " + codCidade);
	            }
	            
	            if (nVeiculos < 2000) {
	                nCidadesMenos2000++;
	                sAcidentesMenos2000 += nAcidentes;
	            }
	        }
	        
	        double mVeiculos = (double) sVeiculos / 5;
	        System.out.println("Média de veículos nas cinco cidades: " + mVeiculos);
	        
	        double mAcidentesMenos2000 = (nCidadesMenos2000 == 0) ? 0 : (double) sAcidentesMenos2000 / nCidadesMenos2000;
	        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + mAcidentesMenos2000);
	    }

	}

}
