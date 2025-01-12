package aula_17.exercicios;

import java.util.Scanner;

/* Exercicio_03
* Faça um programa que leia e valide as seguintes informações: 
* a. Nome: maior que 3 caracteres; 
* b. Idade: entre 0 e 150; 
* c. Salário: maior que zero; 
* d. Sexo: 'f' ou 'm'; 
* e. Estado Civil: 's', 'c', 'v', 'd';
*/

public class Exercicio_03 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			boolean v = false;
			String nome;
			int idade;
			double salario;
			String sexo;
			String civil;

			do {
				System.out.print("Informe o nome do usuario: ");
				nome = scan.next();
				if (nome.length() > 3) {
					System.out.println("Seu nome é " + nome);
					v = true;
				} else {
					System.out.println("Nome com tamanho insuficiente!");
				}
			} while (!v);

			v = false;

			do {
				System.out.print("Informe a idade: ");
				idade = scan.nextInt();
				if (idade >= 0 && idade <= 150) {
					v = true;
				} else {
					System.out.println("Sua idade presisa estar entre 0 a 150!");
				}
			} while (!v);

			v = false;

			do {
				System.out.print("Informe o salario: ");
				salario = scan.nextInt();
				if (salario > 0) {
					v = true;
				} else {
					System.out.println("Salario precisa ser maior que 0!");
				}

			} while (!v);

			v = false;

			do {
				System.out.print("Informe o seu genero: ");
				sexo = scan.next();
				if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
					v = true;
				} else {
					System.out.println("Genero informado é invalido!");
				}
			} while (!v);

			v = false;

			do {
				System.out.print("Informe o seu estado civil: ");
				civil = scan.next();
				if (civil.equalsIgnoreCase("s") || civil.equalsIgnoreCase("c") || civil.equalsIgnoreCase("v")
						|| civil.equalsIgnoreCase("d")) {
					v = true;
				} else {
					System.out.println("Estado civil informado é invalido!");
				}
			} while (!v);
			
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Genero: " + sexo);
			System.out.println("Estado civil: " + civil);
			System.out.println("Salario: " + salario);
		}

	}

}
