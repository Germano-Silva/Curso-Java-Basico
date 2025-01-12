package aula_15.exercicios;

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Bem vindo ao caixa quanto deseja sacar.");
			System.out.println("O valor mínimo de saque é de 10 reais.");
			System.out.println("O valor maximo de saque é de 600 reais.");
			int saque = scan.nextInt();
			if (saque < 10 || saque > 600) {
				System.out.println("Saque invalido o valor é muito pequeno ou exede o limite.");
				System.exit(0);
			}
			int cent = (saque/100);
			int cin = (saque%100)/50;
			int dez = ((saque%100)%50)/10;
			int cinc = (((saque%100)%50)%10)/5;
			int uni = ((((saque%100)%50)%10)%5)/1;

			if (cent > 0 && cin == 0 && dez == 0 && cinc == 0 && uni == 0) {
				System.out.println("Foi realizado o saque de: R$" + saque);
				System.out.println("fornecido " + cent + " notas de 100");

			} else if (cent > 0 && cin > 0 && dez == 0 && cinc == 0 && uni == 0) {
				System.out.println("Foi realizado o saque de: R$" + saque);
				System.out.println("fornecido " + cent + " notas de 100");
				System.out.println("fornecido " + cin + " notas de 100");
			} else if (cent > 0 && cin > 0 && dez > 0 && cinc == 0 && uni == 0) {
				System.out.println("Foi realizado o saque de: R$" + saque);
				System.out.println("fornecido " + cent + " notas de 100");
				System.out.println("fornecido " + cin + " notas de   50");
				System.out.println("fornecido " + dez + " notas de   10");
			} else if (cent > 0 && cin > 0 && dez > 0 && cinc > 0 && uni == 0) {
				System.out.println("Foi realizado o saque de: R$" + saque);
				System.out.println("fornecido " + cent + " notas de 100");
				System.out.println("fornecido " + cin + " notas de   50");
				System.out.println("fornecido " + dez + " notas de   10");
				System.out.println("fornecido " + cinc + " notas de   5");
			} else if (cent > 0 && cin > 0 && dez > 0 && cinc > 0 && uni > 0) {
				System.out.println("Foi realizado o saque de: R$" + saque);
				System.out.println("fornecido " + cent + " notas de 100");
				System.out.println("fornecido " + cin + " notas de   50");
				System.out.println("fornecido " + dez + " notas de   10");
				System.out.println("fornecido " + cinc + " notas de   5");
				System.out.println("fornecido " + uni + " notas de   1");
			}
		}
	}

}
