package aula_17.exercicios;

import java.util.Scanner;

/**Exercicio 37
 * 
 * Uma academia deseja fazer um senso entre seus clientes para 
 * descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, para 
 * isto você deve fazer um programa que pergunte a cada um dos 
 * clientes da academia seu código, sua altura e seu peso. O final da 
 * digitação de dados deve ser dada quando o usuário digitar 0 (zero) no 
 * campo código. Ao encerrar o programa também deve ser informados 
 * os códigos e valores do clente mais alto, do mais baixo, do mais gordo 
 * e do mais magro, além da média das alturas e dos pesos dos clientes
 * 
 * @author Germano
 */


public class Exercicio_37 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
        int codigo = -1;
        double altura, peso;
        double alturaMaisAlto = 0, alturaMaisBaixo = Double.MAX_VALUE;
        double pesoMaisGordo = 0, pesoMaisMagro = Double.MAX_VALUE;
        int codigoMaisAlto = -1, codigoMaisBaixo = -1, codigoMaisGordo = -1, codigoMaisMagro = -1;
        double somaAlturas = 0, somaPesos = 0;
        int numeroClientes = 0;

        while (codigo != 0) {
            System.out.print("Digite o código do cliente (0 para encerrar): ");
	            codigo = scan.nextInt();
	            scan.nextLine();
	
	            if (codigo != 0) {
	                System.out.print("Digite a altura do cliente em metros: ");
	                altura = scan.nextDouble();
	                scan.nextLine();
	
	                System.out.print("Digite o peso do cliente em quilos: ");
	                peso = scan.nextDouble();
	                scan.nextLine();
	
	                somaAlturas += altura;
	                somaPesos += peso;
	                numeroClientes++;
	
	                if (altura > alturaMaisAlto) {
	                    alturaMaisAlto = altura;
	                    codigoMaisAlto = codigo;
	                }
	
	                if (altura < alturaMaisBaixo) {
	                    alturaMaisBaixo = altura;
	                    codigoMaisBaixo = codigo;
	                }
	
	                if (peso > pesoMaisGordo) {
	                    pesoMaisGordo = peso;
	                    codigoMaisGordo = codigo;
	                }
	
	                if (peso < pesoMaisMagro) {
	                    pesoMaisMagro = peso;
	                    codigoMaisMagro = codigo;
	                }
	            }
	        }
	
	        if (numeroClientes > 0) {
	            double mediaAlturas = somaAlturas / numeroClientes;
	            double mediaPesos = somaPesos / numeroClientes;
	
	            System.out.println("Cliente mais alto: código = " + codigoMaisAlto + ", altura = " + alturaMaisAlto + "m");
	            System.out.println("Cliente mais baixo: código = " + codigoMaisBaixo + ", altura = " + alturaMaisBaixo + "m");
	            System.out.println("Cliente mais gordo: código = " + codigoMaisGordo + ", peso = " + pesoMaisGordo + "kg");
	            System.out.println("Cliente mais magro: código = " + codigoMaisMagro + ", peso = " + pesoMaisMagro + "kg");
	            System.out.println("Média das alturas: " + mediaAlturas + "m");
	            System.out.println("Média dos pesos: " + mediaPesos + "kg");
	        } else {
	            System.out.println("Não há clientes cadastrados.");
	        }
		}
	}
}
