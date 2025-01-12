package aula_12;

import java.util.Scanner;

public class LeituraDeDados_01 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite seu nome completo: ");
			String nomeCompleto = scan.nextLine();
			System.out.println("Seu nome é: " + nomeCompleto);

			System.out.println("Digite seu primeiro nome: ");
			String primeiroNome = scan.next();
			System.out.println("Seu primeiro nome é: " + primeiroNome);

			System.out.println("Digite sua idade: ");
			int idade = scan.nextInt();
			System.out.println("Sua idade é: " + idade);

			System.out.println("Digite sua altura: ");
			double altura = scan.nextDouble();
			System.out.println("Sua altura é:" + altura);


			System.out.println(
					"Digite o seu primeiro nome , idade, quantidade de filhos, altura e se tem bixo de estimação: ");
			String nome = scan.next();
			int idade2 = scan.nextInt();
			byte qDFilhos = scan.nextByte();
			float altura2 = scan.nextFloat();
			boolean temPet = scan.nextBoolean();
			
			System.out.println("Você digitou os seguintes elementos: ");
			System.out.println(nome);
			System.out.println(idade2);
			System.out.println(qDFilhos);
			System.out.println(altura2);
			System.out.println(temPet);
		}
		

	}

}
