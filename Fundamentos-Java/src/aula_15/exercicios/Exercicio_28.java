package aula_15.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_28 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("======================= Açougue ========================");
			System.out.println("              Até 5 kg                Acima de 5kg");
			System.out.println(" File Duplo    R$ 4,90 kg                  R$ 5,80 kg");
			System.out.println(" Alcatra       R$ 5,90 kg                  R$ 6,80 kg");
			System.out.println(" Picanha       R$ 6,90 kg                  R$ 7,80 kg");
			System.out.println("=========================================================");
			
			System.out.println("Informe qual carne deseja comprar File (1) Alcatra (2) Picanha (3):");
			int c = scan.nextInt();
			System.out.println("Informe a quantidade de de kg que vai comprar:");
			double p = scan.nextDouble();
			System.out.println("Informe a forma de pagamento:\nCartão Tabajara (a) Dinheiro (b) Outros Cartões (c)");
			String l = scan.next();
			
			double v = 0;
			double d = 0;
			double t = 0;
			
			switch (c) {
			case 1: {
				if(p<=0.0) {
					System.out.println("Valor de peso invalido!");
				}else if(p<=5.0) {
					switch(l) {
						case "a":{
							v = (p*4.90);
							d = ((p*4.90)*(5.0/100.0));
							t = v-d;
							System.out.println("============== Culpom Fiscal =================");
							System.out.println(" Valor do item:");
							System.out.println(" File Duplo              R$ 4,90 kg");
							System.out.println("_______________________________________________");
							System.out.println(" Quantidade comprada     "+p+"kg");
							System.out.println(" File Duplo              R$"+ new DecimalFormat("#,##0.00").format(v));
							System.out.println(" Tipo de pagamento       Cartão Tabajara");
							System.out.println(" Desconto                R$"+ new DecimalFormat("#,##0.00").format(d));
							System.out.println(" Total a pagar           R$"+ new DecimalFormat("#,##0.00").format(t));
							System.out.println("================================================");
							break;
						}
						default:{
							v = (p*4.90);
							d = 0;
							t = v-d;
							System.out.println("============== Culpom Fiscal =================");
							System.out.println(" Valor do item:");
							System.out.println(" File Duplo              R$ 4,90 kg");
							System.out.println("_______________________________________________");
							System.out.println(" Quantidade comprada     "+p+"kg");
							System.out.println(" File Duplo              R$"+ new DecimalFormat("#,##0.00").format(v));
							System.out.println(" Tipo de pagamento       Dinheiro");
							System.out.println(" Desconto                R$"+ new DecimalFormat("#,##0.00").format(d));
							System.out.println(" Total a pagar           R$"+ new DecimalFormat("#,##0.00").format(t));
							System.out.println("================================================");
						}
					}
					
				}else if(p>5.0) {
					switch(l) {
					case "a":{
						v = (p*5.80);
						d = ((p*5.80)*(5.0/100.0));
						t = v-d;
						System.out.println("============== Culpom Fiscal =================");
						System.out.println(" Valor do item:");
						System.out.println(" File Duplo              R$ 4,90 kg");
						System.out.println("_______________________________________________");
						System.out.println(" Quantidade comprada     "+p+"kg");
						System.out.println(" File Duplo              R$"+ new DecimalFormat("#,##0.00").format(v));
						System.out.println(" Tipo de pagamento       Cartão Tabajara");
						System.out.println(" Desconto                R$"+ new DecimalFormat("#,##0.00").format(d));
						System.out.println(" Total a pagar           R$"+ new DecimalFormat("#,##0.00").format(t));
						System.out.println("================================================");
						break;
					}
					default:{
						v = (p*5.80);
						d = 0;
						t = v-d;
						System.out.println("============== Culpom Fiscal =================");
						System.out.println(" Valor do item:");
						System.out.println(" File Duplo              R$ 4,90 kg");
						System.out.println("_______________________________________________");
						System.out.println(" Quantidade comprada     "+p+"kg");
						System.out.println(" File Duplo              R$"+ new DecimalFormat("#,##0.00").format(v));
						System.out.println(" Tipo de pagamento       Dinheiro");
						System.out.println(" Desconto                R$"+ new DecimalFormat("#,##0.00").format(d));
						System.out.println(" Total a pagar           R$"+ new DecimalFormat("#,##0.00").format(t));
						System.out.println("================================================");
					}
				}
				
			}
				break;
			}
			case 2: {
				if(p<=0.0) {
					System.out.println("Valor de peso invalido!");
				}else if(p<=5.0) {
					switch(l) {
						case "a":{
							v = (p*5.90);
							d = ((p*5.90)*(5.0/100.0));
							t = v-d;
							System.out.println("============== Culpom Fiscal =================");
							System.out.println(" Valor do item:");
							System.out.println(" Alcatra                 R$ 5,90 kg");
							System.out.println("_______________________________________________");
							System.out.println(" Quantidade comprada     "+p+"kg");
							System.out.println(" File Duplo              R$"+ new DecimalFormat("#,##0.00").format(v));
							System.out.println(" Tipo de pagamento       Cartão Tabajara");
							System.out.println(" Desconto                R$"+ new DecimalFormat("#,##0.00").format(d));
							System.out.println(" Total a pagar           R$"+ new DecimalFormat("#,##0.00").format(t));
							System.out.println("================================================");
							break;
						}
						default:{
							v = (p*5.90);
							d = 0;
							t = v-d;
							System.out.println("============== Culpom Fiscal =================");
							System.out.println(" Valor do item:");
							System.out.println(" Alcatra                 R$ 5,90 kg");
							System.out.println("_______________________________________________");
							System.out.println(" Quantidade comprada     "+p+"kg");
							System.out.println(" File Duplo              R$"+ new DecimalFormat("#,##0.00").format(v));
							System.out.println(" Tipo de pagamento       Dinheiro");
							System.out.println(" Desconto                R$"+ new DecimalFormat("#,##0.00").format(d));
							System.out.println(" Total a pagar           R$"+ new DecimalFormat("#,##0.00").format(t));
							System.out.println("================================================");
						}
					}
					
				}else if(p>5.0) {
					switch(l) {
					case "a":{
						v = (p*6.80);
						d = ((p*6.80)*(5.0/100.0));
						t = v-d;
						System.out.println("============== Culpom Fiscal =================");
						System.out.println(" Valor do item:");
						System.out.println(" Alcatra                 R$ 6,80 kg");
						System.out.println("_______________________________________________");
						System.out.println(" Quantidade comprada     "+p+"kg");
						System.out.println(" File Duplo              R$"+ new DecimalFormat("#,##0.00").format(v));
						System.out.println(" Tipo de pagamento       Cartão Tabajara");
						System.out.println(" Desconto                R$"+ new DecimalFormat("#,##0.00").format(d));
						System.out.println(" Total a pagar           R$"+ new DecimalFormat("#,##0.00").format(t));
						System.out.println("================================================");
						break;
					}
					default:{
						v = (p*6.80);
						d = 0;
						t = v-d;
						System.out.println("============== Culpom Fiscal =================");
						System.out.println(" Valor do item:");
						System.out.println(" Alcatra                 R$ 6,80 kg");
						System.out.println("_______________________________________________");
						System.out.println(" Quantidade comprada     "+p+"kg");
						System.out.println(" File Duplo              R$"+ new DecimalFormat("#,##0.00").format(v));
						System.out.println(" Tipo de pagamento       Dinheiro");
						System.out.println(" Desconto                R$"+ new DecimalFormat("#,##0.00").format(d));
						System.out.println(" Total a pagar           R$"+ new DecimalFormat("#,##0.00").format(t));
						System.out.println("================================================");
					}
				}
				
			}
				break;
			}
			case 3: {
				if(p<=0.0) {
					System.out.println("Valor de peso invalido!");
				}else if(p<=5.0) {
					switch(l) {
						case "a":{
							v = (p*6.90);
							d = ((p*6.90)*(5.0/100.0));
							t = v-d;
							System.out.println("============== Culpom Fiscal =================");
							System.out.println(" Valor do item:");
							System.out.println(" Picanha                 R$ 6,90 kg");
							System.out.println("_______________________________________________");
							System.out.println(" Quantidade comprada     "+p+"kg");
							System.out.println(" File Duplo              R$"+ new DecimalFormat("#,##0.00").format(v));
							System.out.println(" Tipo de pagamento       Cartão Tabajara");
							System.out.println(" Desconto                R$"+ new DecimalFormat("#,##0.00").format(d));
							System.out.println(" Total a pagar           R$"+ new DecimalFormat("#,##0.00").format(t));
							System.out.println("================================================");
							break;
						}
						default:{
							v = (p*6.90);
							d = 0;
							t = v-d;
							System.out.println("============== Culpom Fiscal =================");
							System.out.println(" Valor do item:");
							System.out.println(" Picanha                 R$ 6,90 kg");
							System.out.println("_______________________________________________");
							System.out.println(" Quantidade comprada     "+p+"kg");
							System.out.println(" File Duplo              R$"+ new DecimalFormat("#,##0.00").format(v));
							System.out.println(" Tipo de pagamento       Dinheiro");
							System.out.println(" Desconto                R$"+ new DecimalFormat("#,##0.00").format(d));
							System.out.println(" Total a pagar           R$"+ new DecimalFormat("#,##0.00").format(t));
							System.out.println("================================================");
						}
					}
					
				}else if(p>5.0) {
					switch(l) {
					case "a":{
						v = (p*7.80);
						d = ((p*7.80)*(5.0/100.0));
						t = v-d;
						System.out.println("============== Culpom Fiscal =================");
						System.out.println(" Valor do item:");
						System.out.println(" Picanha                 R$ 7,80 kg");
						System.out.println("_______________________________________________");
						System.out.println(" Quantidade comprada     "+p+"kg");
						System.out.println(" File Duplo              R$"+ new DecimalFormat("#,##0.00").format(v));
						System.out.println(" Tipo de pagamento       Cartão Tabajara");
						System.out.println(" Desconto                R$"+ new DecimalFormat("#,##0.00").format(d));
						System.out.println(" Total a pagar           R$"+ new DecimalFormat("#,##0.00").format(t));
						System.out.println("================================================");
						break;
					}
					default:{
						v = (p*7.80);
						d = 0;
						t = v-d;
						System.out.println("============== Culpom Fiscal =================");
						System.out.println(" Valor do item:");
						System.out.println(" Picanha                 R$ 7,80 kg");
						System.out.println("_______________________________________________");
						System.out.println(" Quantidade comprada     "+p+"kg");
						System.out.println(" File Duplo              R$"+ new DecimalFormat("#,##0.00").format(v));
						System.out.println(" Tipo de pagamento       Dinheiro");
						System.out.println(" Desconto                R$"+ new DecimalFormat("#,##0.00").format(d));
						System.out.println(" Total a pagar           R$"+ new DecimalFormat("#,##0.00").format(t));
						System.out.println("================================================");
					}
				}
				
			}
				break;
			}
			default:
				System.out.println("Não encontrado o tipo de carne.\nInforme um tipo de carne valida!");
			}
		}
	}

}
