package aula_14;

import java.util.Scanner;

public class ControleDecisao_02 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o preço do item:");
			double valor = scan.nextDouble();
			if (valor<=10) {
				System.out.println("Esta barato, pode comprar.");
			}else if(valor>10 && valor<15) {
				System.out.println("Você pode pedir um disconto.");
			}else if(valor >=15 && valor <17) {
				System.out.println("Pode pesquisar mais.");
			}else {
				System.out.println("Esse produto esta muito caro");
			}
		}
		

	}

}
