package aula_17.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Exercicio 31
 * 
 * O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e
 * agora possui uma loja de conveniências. Faça um programa que implemente uma
 * caixa registradora rudimentar. O programa deverá receber um número
 * desconhecido de valores referentes aos preços das mercadorias. Um valor zero
 * deve ser informado pelo operador para indicar o final da compra. O programa
 * deve então mostrar o total da compra e perguntar o valor em dinheiro que o
 * cliente forneceu, para então calcular e mostrar o valor do troco. Após esta
 * operação, o programa deverá voltar ao ponto inicial, para registrar a próxima
 * compra. A saída deve ser conforme o exemplo abaixo: Lojas Tabajara Produto 1:
 * R$ 2.20 Produto 2: R$ 5.80 Produto 3: R$ 0 Total: R$ 9.00 Dinheiro: R$ 20.00
 * Troco: R$ 11.00 ...
 * 
 * @author Germano
 */

public class Exercicio_31 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			boolean sair = false;
			int qp;
			double p;
			double t;
			String output;
			double vp;
			double troco;

			do {
				System.out.println("Deseja informar uma nova compra? S/N");
				String novaCompra = scan.next();

				if (novaCompra.equalsIgnoreCase("s")) {

					output = "Lojas Tabajara \n";
					System.out.println("Digite a quantidade de produtos comprados: ");
					qp = scan.nextInt();
					t = 0;
					for (int i = 1; i <= qp; i++) {
						System.out.println("Informe o preço do produto " + i);
						p = scan.nextDouble();
						t+=p;
						output+= "Produto " +i + ": R$ "+p+"\n";

					}
					
					output +="Total: R$: " + new DecimalFormat("#,##0.00").format(t)+"\n";
					
					System.out.println("Informe o valor pago: ");
					vp = scan.nextDouble();
					
					output +="Dinheiro: R$ " + vp + "\n";
					
					troco = t - vp;
					
					output+="Troco: R$ " + troco;
					
					System.out.println(output);
					
				} else {
					sair = true;
				}
			} while (sair);
		}

	}

}
