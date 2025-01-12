package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Infome 3 numeros para saber qual é o maior");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			int n3 = scan.nextInt();
			
			if(n1>n2 && n1>n3) {
				System.out.println(n1);
				if(n2>n3) {
					System.out.println(n2);
					System.out.println(n3);
				}else {
					System.out.println(n3);
					System.out.println(n2);
				}
			}else if(n2>n1 && n2>n3) {
				System.out.println(n2);
				if(n1>n3) {
					System.out.println(n1);
					System.out.println(n3);
					
				}else {
					System.out.println(n3);
					System.out.println(n1);
				}
			}else{
				System.out.println(n3);
				if(n1>n2) {
					System.out.println(n1);
					System.out.println(n2);
				}else {
					System.out.println(n2);
					System.out.println(n1);
				}
			}
		}

	}

}
