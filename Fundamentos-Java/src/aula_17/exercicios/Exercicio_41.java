package aula_17.exercicios;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**Exercicio 41
 * 
 * Faça um programa que receba o valor de uma dívida e mostre uma 
 * tabela com os seguintes dados: valor da dívida, valor dos juros, 
 * quantidade de parcelas e valor da parcela.
 * Os juros e a quantidade de parcelas seguem a tabela abaixo:
 * Quantidade de Parcelas % de Juros sobre o valor inicial da dívida 
 * 1 0 
 * 3 10 
 * 6 15 
 * 9 20 
 * 12 25
 * Exemplo de saída do programa:
 * Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela 
 * R$ 1.000,00 0 1 R$ 1.000,00 
 * R$ 1.100,00 100 3 R$ 366,00 
 * R$ 1.150,00 150 6 R$ 191,67
 * 
 * @author Germano
 */


public class Exercicio_41 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			@SuppressWarnings("deprecation")
			Locale localeBr = new Locale("pt", "BR");
	        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeBr);
	        
	        // Recebe o valor da dívida
	        System.out.print("Digite o valor da dívida: ");
	        double valorDivida = scan.nextDouble();
	        
	        // Monta a tabela com os dados solicitados
	        System.out.println("Valor da Dívida\tValor dos Juros\tQuantidade de Parcelas\tValor da Parcela");
	        System.out.print(currencyFormatter.format(valorDivida));
	        System.out.print("\t\tR$ 00,00");
	        System.out.print("\t\t1");
	        System.out.print("\t\t" + currencyFormatter.format(valorDivida));
	        System.out.println();
	        for (int parcelas = 3; parcelas <= 12; parcelas += 3) {
	            double valorJuros = valorDivida * (parcelas / 100.0);
	            double valorDividaComJuros = valorDivida + valorJuros;
	            double valorParcela = valorDividaComJuros / parcelas;
	            System.out.print(currencyFormatter.format(valorDividaComJuros));
	            System.out.print("\t\t" + currencyFormatter.format(valorJuros));
	            System.out.print("\t\t" + parcelas);
	            System.out.print("\t\t" + currencyFormatter.format(valorParcela));
	            System.out.println();
	        }
	    
		}

	}

}
