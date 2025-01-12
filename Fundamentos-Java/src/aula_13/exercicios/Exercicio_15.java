package aula_13.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Qual o valor da sua hora de trabalho?");
			double valorH = scan.nextDouble();
			System.out.print("Quantas horas você trabalhou esse mês?");
			double horasT = scan.nextDouble();
			
			double salario = horasT * valorH;
			double impostoR = (salario * (11.0 / 100.0));
			double inss = (salario * (8.0 / 100.0));
			double sindicato = (salario * (5.0 / 100.0));
			double salarioL = (((salario - impostoR) - inss) - sindicato);
			
			System.out.println("===============================================");
			System.out.println("     Horas trabalhadas:           " + new DecimalFormat("#,##0.00").format(horasT) + "H");
			System.out.println("     Valor por Hora trabalhada: R$" + new DecimalFormat("#,##0.00").format(valorH));
			System.out.println("===============================================\n");
			System.out.println(" Informações       Descrição       Valor  \n");
			System.out.println(" Salario           " + new DecimalFormat("#,##0.00").format(horasT) + "H         R$"
					+ new DecimalFormat("#,##0.00").format(salario));
			System.out.println(" Imposto de Renda  11%             R$" + new DecimalFormat("#,##0.00").format(impostoR));
			System.out.println(" INSS               8%             R$" + new DecimalFormat("#,##0.00").format(inss));
			System.out.println(" Sindicato          5%             R$" + new DecimalFormat("#,##0.00").format(sindicato));
			System.out.println("===============================================\n");
			System.out.println("     Salario Liquido               R$" + new DecimalFormat("#,##0.00").format(salarioL));
		}
		System.out.println("===============================================\n");
	}

}
