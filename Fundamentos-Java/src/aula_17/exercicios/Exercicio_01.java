package aula_17.exercicios;
/* Exercicio_01
* Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
* caso o valor seja inválido e continue pedindo até que o usuário informe um
* valor válido.
*/
import java.util.Scanner;

public class Exercicio_01 {
		
	public static void main(String[] args) {
		
		
		try (Scanner scan = new Scanner(System.in)) {
			boolean v = false;
			
			do {
				System.out.println("Informe um numero de 0 a 10");
				int i = scan.nextInt(); 
				if(i>=0 && i<=10) {
					System.out.println("Valor valido!");
					v = true;
				}else {
					System.out.println("Valor invalido!");
				}
			} while (!v);
		}
		
		
	}

}
