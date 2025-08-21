package aula_20.exercicios;

import java.util.Scanner;

/**
 * 5. Modifique o programa anterior de maneira a guardar os
 * compromissos de todo o ano, organizados por mês, dia e hora
 * (só 8 horas por dia).
 * 
 * @author Germano-Silva
 */

public class Exercicio_05 {
    public static void main(String[] args) {

        // Cria um objeto Scanner para leitura de entrada do usuário
        Scanner scan = new Scanner(System.in);

        // Cria uma matriz 12x31x24 para armazenar compromissos (meses x dias x horas)
        String[][][] compromissos = new String[12][31][24];

        // Variável de controle para o loop principal do programa
        boolean sair = false;
        // Variável para armazenar a opção escolhida pelo usuário
        byte opcao;

        // Loop principal que mantém o programa em execução
        while (!sair) {

            // Exibe o menu de opções
            System.out.println("\n=== AGENDA ANUAL ===");
            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Verificar compromisso");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextByte();
            scan.nextLine(); // Limpa o buffer após leitura numérica

            if (opcao == 1) { // Adicionar compromisso

                // Solicita e valida o mês
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.print("Entre com o mês (1-12): ");
                    mes = scan.nextInt();
                    scan.nextLine(); // Limpa o buffer
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente");
                    }
                }

                // Solicita e valida o dia
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.print("Entre com o dia do mês (1-31): ");
                    dia = scan.nextInt();
                    scan.nextLine(); // Limpa o buffer
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }

                // Solicita e valida a hora
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.print("Entre com a hora do compromisso (0-23): ");
                    hora = scan.nextInt();
                    scan.nextLine(); // Limpa o buffer
                    if (hora >= 0 && hora <= 23) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }

                // Ajusta os índices (arrays começam em 0)
                mes--;
                dia--;

                // Solicita o compromisso
                System.out.print("Digite o compromisso: ");
                String compromisso = scan.nextLine();

                // Armazena o compromisso na matriz
                compromissos[mes][dia][hora] = compromisso;
                System.out.println("Compromisso agendado com sucesso!");

            } else if (opcao == 2) { // Verificar compromisso

                // Solicita e valida o mês
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.print("Entre com o mês (1-12): ");
                    mes = scan.nextInt();
                    scan.nextLine(); // Limpa o buffer
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite novamente");
                    }
                }

                // Solicita e valida o dia
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.print("Entre com o dia do mês (1-31): ");
                    dia = scan.nextInt();
                    scan.nextLine(); // Limpa o buffer
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }

                // Solicita e valida a hora
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.print("Entre com a hora do compromisso (0-23): ");
                    hora = scan.nextInt();
                    scan.nextLine(); // Limpa o buffer
                    if (hora >= 0 && hora <= 23) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }

                // Ajusta os índices (arrays começam em 0)
                mes--;
                dia--;

                // Recupera e exibe o compromisso
                System.out.println("O compromisso agendado é:");
                String compromisso = compromissos[mes][dia][hora];

                // Verifica se há compromisso agendado
                if (compromisso != null && !compromisso.isEmpty()) {
                    System.out.println(compromisso);
                } else {
                    System.out.println("Nenhum compromisso agendado para este horário.");
                }

            } else if (opcao == 0) { // Sair do programa
                sair = true;
                System.out.println("Saindo da agenda...");
            } else {
                System.out.println("Opção inválida, digite novamente");
            }
        }

        // Fecha o scanner para liberar recursos
        scan.close();
    }
}