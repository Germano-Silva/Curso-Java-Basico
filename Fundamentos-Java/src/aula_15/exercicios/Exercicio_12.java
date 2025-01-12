package aula_15.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("=======================================================\n");
			System.out.print(" Informe o valor da sua hoara de trabalho:");
			double v = scan.nextDouble();
			System.out.print(" Informe a quantidade de horas trabalhadas:");
			double h = scan.nextDouble();
			System.out.println("\n=======================================================\n");
			
			double salario = v*h;
			double sindicato = salario*(3.0/100);
			double fgts = salario*(11.0/100);
			double ir = 0;
			double inss = salario*(10.0/100);
			double totalDescontos = 0;
			
				System.out.println("Salario bruto: ("+v+" * " +h+ ")              : R$" + new DecimalFormat("#,##0.00").format(salario));
			if(salario<=900.00) {
				System.out.println("(-) IR:        (insento)");
			}else if(salario>900.00 && salario<=1500.00) {
				System.out.println("(-) IR:        (5%)                       : R$" + new DecimalFormat("#,##0.00").format(ir = (salario*(5.0/100))));
			}else if(salario<=2500.00 && salario>1500.00) {
				System.out.println("(-) IR:        (10%)                      : R$" + new DecimalFormat("#,##0.00").format(ir = (salario*(10.0/100))));
			}else{
				System.out.println("(-) IR:        (20%)                      : R$" + new DecimalFormat("#,##0.00").format(ir = (salario*(20.0/100))));
			}
			
			System.out.println("(-) Sindicado: (3%)                       : R$" + new DecimalFormat("#,##0.00").format(sindicato));
			System.out.println("(-) INSS:      (10%)                      : R$" + new DecimalFormat("#,##0.00").format(inss));
			System.out.println("FGTS:          (11%)                      : R$" + new DecimalFormat("#,##0.00").format(fgts));
			
			totalDescontos = ir+sindicato+inss;
			System.out.println("\n=======================================================\n");
			System.out.println("Total de descontos:                       : R$" + new DecimalFormat("#,##0.00").format(totalDescontos));
			System.out.println("Salario liquido:                          : R$" + new DecimalFormat("#,##0.00").format(salario-totalDescontos));
		}
		System.out.println("\n=======================================================");
	}

}
