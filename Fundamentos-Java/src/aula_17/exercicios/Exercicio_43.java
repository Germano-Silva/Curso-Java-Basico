package aula_17.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**Exercicio 43
 * 
 * O cardápio de uma lanchonete é o seguinte:
 *  Especificação Código Preço 
 *  Cachorro Quente 100 R$ 1,20 
 *  Bauru Simples 101 R$ 1,30 
 *  Bauru com ovo 102 R$ 1,50 
 *  Hambúrguer 103 R$ 1,20 
 *  Cheeseburguer 104 R$ 1,30 
 *  Refrigerante 105 R$ 1,00
 * Faça um programa que leia o código dos itens pedidos e as 
 * quantidades desejadas. Calcule e mostre o valor a ser pago por 
 * item (preço * quantidade) e o total geral do pedido. Considere 
 * que o cliente deve informar quando o pedido deve ser 
 * encerrado.
 * 
 * @author Germano
 */


public class Exercicio_43 {



	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			boolean naoTerminar = true;
			double cod, qtd;
			double total = 0;
			String output = null;
			
			do {
				
				System.out.println("Digite o codigo e a quantidade. \nDigite 0 0 para sair.");
				cod = scan.nextDouble();
				qtd = scan.nextDouble();
				if (cod == 0 && qtd == 0) {
					naoTerminar = false;
				}else {
					if(cod ==100) {
						output+= "Cachorro Quente R$ 1,20 * "+qtd+ " = "+(qtd*1.20)+ "\n";
						total += qtd*1.20;
					}else if(cod == 101) {
						output+= "Bauru Simples   R$ 1,30  * "+qtd+ " = "+(qtd*1.30)+ "\n";
						total += qtd*1.30;
					}else if(cod ==102 ) {
						output+= "Bauru com ovo   R$ 1,50  * "+qtd+ " = "+(qtd*1.50)+ "\n";
						total += qtd*1.50;
					}else if(cod ==103 ) {
						output+= "Hambúrguer      R$ 1,20  * "+qtd+ " = "+(qtd*1.20)+ "\n";
						total += qtd*1.20;
					}else if(cod ==104 ) {
						output+= "Cheeseburguer   R$ 1,30  * "+qtd+ " = "+(qtd*1.30)+ "\n";
						total += qtd*1.30;
					}else if(cod == 105) {
						output+= "Refrigerante    R$ 1,00 * "+qtd+ " = "+(qtd*1.00)+ "\n";
						total += qtd*1.00;
					}else {
						System.out.println("Codigo informado não existe!");
					}
				}
				
			} while (naoTerminar);
			System.out.println(output);
			System.out.println("Total é: "+ new DecimalFormat("#,##0.00").format(total));
		}

	}

}