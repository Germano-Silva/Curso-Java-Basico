package aula_17.exercicios;
/* Exercicio_02
* Faça um programa que leia um nome de usuário e a sua senha e não aceite a
* senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
* pedir as informações.
*/
import java.util.Scanner;

public class Exercicio_02 {
	

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			boolean v = false;
			do {
				System.out.print("Informe o nome do usuario: ");
				String name = scan.next();
				System.out.print("Informe a senha: ");
				String senha = scan.next();

				if (name.equalsIgnoreCase(senha)) {
					System.out.println("Senha invalida!\nDigite outra senha!");
					v = false;
				} else {
					System.out.println("Senha valida!\nSeja bem vindo");
					v = true;
				}

			} while (!v);
		}

	}

}
