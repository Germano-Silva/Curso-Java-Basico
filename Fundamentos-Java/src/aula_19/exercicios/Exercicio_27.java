package aula_19.exercicios;
import java.util.Scanner;

/**
 * Exercicio_27
 * 
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
 * tipo e tamanho, obedecendo as seguintes regras de formação: a) Bi deverá
 * receber 'a' quando Ai for menor que 7; b) Bi deverá receber 'b' quando Ai for
 * igual a 7; c) Bi deverá receber 'c' quando Ai for maior que 7 e menor que 10;
 * d) Bi deverá receber 'd' quando Ai for igual a 10; e e) Bi deverá receber 'e'
 * quando Ai for maior que 10. Sugestão: char B[10];
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_27 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] a = new int[10];
			char[] b = new char[a.length];
			
			
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("Entre com um número para a posição A = " + i);
				a[i] = scan.nextInt();
				
				if(a[i]<7) {
					b[i]='a';
				}else if(a[i] == 7) {
					b[i]='b';
				}else if(a[i] > 7 && a[i]<10) {
					b[i]='c';
				}else if(a[i] ==10) {
					b[i]='d';
				}else if(a[i] >10) {
					b[i]='e';
				}
			}
			
			
			System.out.print("Vetor A = ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			
			System.out.print("Vetor B = ");
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println();
		
		}
	}

}
