package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 45
 * 
 * Desenvolver um programa para verificar a nota do aluno em uma 
 * prova com 10 questões, o programa deve perguntar ao aluno a 
 * resposta de cada questão e ao final comparar com o gabarito da prova 
 * e assim calcular o total de acertos e a nota (atribuir 1 ponto por 
 * resposta certa). Após cada aluno utilizar o sistema deve ser feita uma 
 * pergunta se outro aluno vai utilizar o sistema. Após todos os alunos 
 * terem respondido informar:
 * Maior e Menor Acerto;
 * a. Total de Alunos que utilizaram o sistema;
 * b. A Média das Notas da Turma.
 * Gabarito da Prova: 
 * 01 - A 
 * 02 - B 
 * 03 - C 
 * 04 - D 
 * 05 - E 
 * 06 - E 
 * 07 - D 
 * 08 - C 
 * 09 - B 
 * 10 - A
 * Após concluir isto você poderia incrementar o programa 
 * permitindo que o professor digite o gabarito da prova antes dos 
 * alunos usarem o programa.
 * 
 * @author Germano
 */


public class Exercicio_45 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String[] gabarito = new String[10];
	        int totalAlunos = 0;
	        int maiorAcerto = 0;
	        int menorAcerto = 10;
	        int totalAcertos = 0;
	        
	        // Lendo o gabarito da prova
	        System.out.println("Digite o gabarito da prova:");
	        for (int i = 0; i < gabarito.length; i++) {
	            System.out.printf("Resposta da questão %02d: ", i+1);
	            gabarito[i] = scan.nextLine();
	        }
	        
	        // Laço para processar notas de vários alunos
	        do {
	            int acertos = 0;
	            
	            // Lendo as respostas do aluno
	            System.out.println("Digite as respostas do aluno:");
	            for (int i = 0; i < gabarito.length; i++) {
	                System.out.printf("Resposta da questão %02d: ", i+1);
	                String resposta = scan.nextLine();
	                if (resposta.equals(gabarito[i])) {
	                    acertos++;
	                }
	            }
	            
	            // Atualizando as estatísticas
	            totalAlunos++;
	            totalAcertos += acertos;
	            if (acertos > maiorAcerto) {
	                maiorAcerto = acertos;
	            }
	            if (acertos < menorAcerto) {
	                menorAcerto = acertos;
	            }
	            
	            // Perguntando se outro aluno vai utilizar o sistema
	            System.out.println("Deseja cadastrar outro aluno? (S/N)");
	        } while (scan.nextLine().equalsIgnoreCase("S"));
	        
	        // Imprimindo as estatísticas finais
	        double mediaNotas = (double) totalAcertos / (gabarito.length * totalAlunos) * 10;
	        System.out.println("Resultado:");
	        System.out.printf("Maior acerto: %d\n", maiorAcerto);
	        System.out.printf("Menor acerto: %d\n", menorAcerto);
	        System.out.printf("Total de alunos que utilizaram o sistema: %d\n", totalAlunos);
	        System.out.printf("Média das notas da turma: %.2f\n", mediaNotas);
	    }
	}

}
