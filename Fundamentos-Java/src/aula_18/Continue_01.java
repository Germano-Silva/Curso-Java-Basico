package aula_18;

import java.util.Scanner;

public class Continue_01 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Informe um número");
			int n1 = scan.nextInt();
			System.out.println("Informe um número para limite");
			int n2 = scan.nextInt();
			
			for (int i = n1; i <= n2; i++) {
				if(i%7==0) {
					System.out.println("O valor de i é: "+ i);
					continue;
				}
				
			}
		}

	}

}
