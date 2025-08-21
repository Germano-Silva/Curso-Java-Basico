package aula_20.exercicios;

import java.util.Scanner;

/**
 * 4. Faça um programa para armazenar em uma matriz os compromissos
 * de uma agenda pessoal. Cada dia do mês deve conter 24 horas,
 * onde para cada uma destas 24 horas podemos associar um tarefa
 * específica (compromisso agendado). O programa deve ter um menu
 * onde o usuário indica o dia do mês que deseja alterar e a hora,
 * entrando em seguida com o compromisso, ou então, o usuário pode
 * também consultar a agenda, fornecendo o dia e a hora para obter
 * o compromisso armazenado.
 * 
 * @author Germano-Silva
 */

public class Exercicio_04 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de entrada do usuário
        Scanner scan = new Scanner(System.in);

        // Cria uma matriz 31x24 para armazenar os compromissos (dias x horas)
        String[][] compromissos = new String[31][24];

        // Variável de controle para o loop principal do programa
        boolean sair = false;
        // Variável para armazenar a opção escolhida pelo usuário
        byte opcao;

        // Loop principal que mantém o programa em execução até o usuário escolher sair
        while (!sair) {
            // Exibe o menu de opções para o usuário
            System.out.println("\n=== AGENDA PESSOAL ===");
            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Verificar compromisso");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção escolhida pelo usuário
            opcao = scan.nextByte();
            scan.nextLine(); // Limpa o buffer do teclado após a leitura numérica

            if (opcao == 1) { // Opção para adicionar compromisso
                // Variável para controlar a validação do dia
                boolean diaValido = false;
                int dia = 0;

                // Loop até que um dia válido seja fornecido
                while (!diaValido) {
                    System.out.print("Entre com o dia do mês (1-31): ");
                    dia = scan.nextInt();
                    scan.nextLine(); // Limpa o buffer após leitura numérica

                    // Verifica se o dia está dentro do intervalo válido
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }

                // Variável para controlar a validação da hora
                boolean horaValida = false;
                int hora = 0;

                // Loop até que uma hora válida seja fornecida
                while (!horaValida) {
                    System.out.print("Entre com a hora do compromisso (0-23): ");
                    hora = scan.nextInt();
                    scan.nextLine(); // Limpa o buffer após leitura numérica

                    // Verifica se a hora está dentro do intervalo válido
                    if (hora >= 0 && hora <= 23) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }

                // Solicita e lê o compromisso
                System.out.print("Digite o compromisso: ");
                String compromisso = scan.nextLine();

                // Armazena o compromisso na matriz (subtrai 1 do dia para indexação correta)
                compromissos[dia - 1][hora] = compromisso;
                System.out.println("Compromisso agendado com sucesso!");

            } else if (opcao == 2) { // Opção para verificar compromisso
                // Variável para controlar a validação do dia
                boolean diaValido = false;
                int dia = 0;

                // Loop até que um dia válido seja fornecido
                while (!diaValido) {
                    System.out.print("Entre com o dia do mês (1-31): ");
                    dia = scan.nextInt();
                    scan.nextLine(); // Limpa o buffer após leitura numérica

                    // Verifica se o dia está dentro do intervalo válido
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }

                // Variável para controlar a validação da hora
                boolean horaValida = false;
                int hora = 0;

                // Loop até que uma hora válida seja fornecida
                while (!horaValida) {
                    System.out.print("Entre com a hora do compromisso (0-23): ");
                    hora = scan.nextInt();
                    scan.nextLine(); // Limpa o buffer após leitura numérica

                    // Verifica se a hora está dentro do intervalo válido
                    if (hora >= 0 && hora <= 23) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }

                // Recupera o compromisso da matriz
                String compromisso = compromissos[dia - 1][hora];
                System.out.println("\nCompromisso agendado:");

                // Verifica se existe compromisso agendado para o horário
                if (compromisso != null && !compromisso.isEmpty()) {
                    System.out.println(compromisso);
                } else {
                    System.out.println("Nenhum compromisso agendado para este horário.");
                }

            } else if (opcao == 0) { // Opção para sair do programa
                sair = true;
                System.out.println("Saindo da agenda...");
            } else {
                // Mensagem para opção inválida
                System.out.println("Opção inválida! Digite novamente.");
            }
        }

        // Fecha o scanner para liberar recursos
        scan.close();
    }
}