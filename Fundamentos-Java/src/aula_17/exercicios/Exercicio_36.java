package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 36
 * 
 * Desenvolva um programa que faça a tabuada de um número qualquer 
 * inteiro que será digitado pelo usuário, mas a tabuada não deve 
 * necessariamente iniciar em 1 e terminar em 10, o valor inicial e final 
 * devem ser informados também pelo usuário, conforme exemplo 
 * abaixo:
 * Montar a tabuada de: 5 
 * Começar por: 4 
 * Terminar em: 7 
 * 
 * Vou montar a tabuada de 5 começando em 4 e terminando em 7: 
 * 5 X 4 = 20 
 * 5 X 5 = 25 
 * 5 X 6 = 30 
 * 5 X 7 = 35
 * Obs: Você deve verificar se o usuário não digitou o final menor 
 * que o inicial.
 * 
 * @author Germano
 */


public class Exercicio_36 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe o número: ");
			int n = scan.nextInt();
			System.out.println("Informe o número que começa a tabuada: ");
			int c = scan.nextInt();
			System.out.println("Informe o número que deve terminar a tabuada: ");
			int t = scan.nextInt();
			if(t<c) {
				System.out.println("Número que termina a tabuada é menor que o inicial.");
			}else {
			
				System.out.println("Montar a tabuada de: " + n);
				System.out.println("Começar por: " + c);
				System.out.println("Terminar em: " + t);
				
				for (int i = c; i <=t; i++) {
					System.out.println(n + " * " + i+ " = " + (n*i));
				}
			}
		}

	}

}
