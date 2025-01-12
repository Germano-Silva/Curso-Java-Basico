package aula_15.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_27 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("==================== Frutaria =====================");
			System.out.println("              Até 5 kg                Acima de 5kg");
			System.out.println(" Morango    R$ 2,25 kg                  R$ 2,20 kg");
			System.out.println(" Maçã       R$ 2,25 kg                  R$ 2,20 kg");
			System.out.println("===================================================");
			
			System.out.println("Informe qual fruta deseja comprar Maçã (m) Morango (g):");
			String f = scan.next();
			System.out.println("Informe a quantidade de de kg que vai comprar:");
			double p = scan.nextDouble();
			
			double r = 0; 
			double v = 0;
			double d = 0;
			
			switch (f) {
			case "m": {
				if(p<=0.0) {
					System.out.println("Valor de peso invalido!");
				}else if(p<=5) {
					v = (p*1.80);
					System.out.println("A quantidade que você comprou foi: "+p+"kg no valor de R$"+ new DecimalFormat("#,##0.00").format(v));
					
				}else  if(p>=8.0) {
					v = (p*1.50);
					d = ((p*1.50)*(10.0/100.0));
					r = v-d;
					System.out.println("A quantidade que você comprou foi: "+p+"kg no valor de R$"+ new DecimalFormat("#,##0.00").format(v)+"\nRecebeu um desconto de R$"+ new DecimalFormat("#,##0.00").format(d)+"\nTotal a pagar é R$" + new DecimalFormat("#,##0.00").format(r));
				}else if(p>5.0) {
					v = (p*1.50);
					System.out.println("A quantidade que você comprou foi: "+p+"kg no valor de R$"+ new DecimalFormat("#,##0.00").format(v));
					
				}
				break;
			}
			case "g": {
				if(p<=0.0) {
					System.out.println("Valor de peso invalido!");
				}else if(p<=5.0) {
					v = (p*2.50);
					System.out.println("A quantidade que você comprou foi: "+p+"kg no valor de R$"+ new DecimalFormat("#,##0.00").format(v));
					
				}else  if(p>=8.0) {
					v = (p*2.20);
					d = ((p*2.20)*(10./100.0));
					r = v-d;
					System.out.println("A quantidade que você comprou foi: "+p+"kg no valor de R$"+ new DecimalFormat("#,##0.00").format(v)+"\nRecebeu um desconto de R$"+ new DecimalFormat("#,##0.00").format(d)+"\nTotal a pagar é R$" + new DecimalFormat("#,##0.00").format(r));
				}else if(p>5.0) {
					v = (p*2.20);
					System.out.println("A quantidade que você comprou foi: "+p+"kg no valor de R$"+ new DecimalFormat("#,##0.00").format(v));
				}	
				break;		
			}
			default:
				System.out.println("Opção invalida!");
			}
		}
	}

}
