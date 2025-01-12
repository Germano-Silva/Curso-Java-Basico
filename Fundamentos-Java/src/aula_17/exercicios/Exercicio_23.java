package aula_17.exercicios;
import java.util.Scanner;

/**Exercicio 23
 * 
 * Faça um programa que mostre todos os primos entre 1 e N sendo N 
 * um número inteiro fornecido pelo usuário. O programa deverá mostrar 
 * também o número de divisões que ele executou para encontrar os 
 * números primos. Serão avaliados o funcionamento, o estilo e o número 
 * de testes (divisões) executados.
 * 
 * @author Germano
 */


public class Exercicio_23 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Digite um número inteiro: ");
	        int n = scan.nextInt();

	        int cont = 0;
	        for (int i = 2; i <= n; i++) {
	            boolean primo = true;
	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                cont++;
	                if (i % j == 0) {
	                    primo = false;
	                    break;
	                }
	            }
	            if (primo) {
	                System.out.println(i);
	            }
	        }

	        System.out.println("Número de divisões: " + cont);
			
		}

	}

}
