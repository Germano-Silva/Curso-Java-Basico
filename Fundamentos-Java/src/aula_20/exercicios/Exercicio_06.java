package aula_20.exercicios;

import java.util.Scanner;

/**
 * 6. Faça um programa para jogar o jogo da velha. O programa deve
 * permitir que dois jogadores façam uma partida do jogo da velha,
 * usando o computador para ver o tabuleiro. Cada jogador vai
 * alternadamente informando a posição onde deseja colocar a sua
 * peça ('O' ou 'X'). O programa deve impedir jogadas inválidas e
 * determinar automaticamente quando o jogo terminou e quem foi o
 * vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
 * deve atualizar a situação do tabuleiro na tela.
 * 
 * @author Germano-Silva
 */

public class Exercicio_06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Inicializa a matriz 3x3 para o jogo da velha com espaços vazios
        char[][] jogoVelha = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogoVelha[i][j] = ' ';
            }
        }

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");
        System.out.println();

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        // Loop principal do jogo
        while (!ganhou) {

            // Define de quem é a vez baseado no número da jogada
            if (jogada % 2 == 1) { // jogador 1
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';
            } else { // jogador 2
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
                sinal = 'O';
            }

            // Validação da linha (deve ser entre 1 e 3)
            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.print("Entre com a linha (1, 2 ou 3): ");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Linha inválida, tente novamente");
                }
            }

            // Validação da coluna (deve ser entre 1 e 3)
            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.print("Entre com a coluna (1, 2 ou 3): ");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Coluna inválida, tente novamente");
                }
            }

            // Ajusta para índices de array (0-2)
            linha--;
            coluna--;

            // Verifica se a posição já está ocupada
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
                System.out.println("Posição já usada, tente novamente");
            } else {
                // Jogada válida - marca a posição e incrementa o contador
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            // Imprime o tabuleiro atualizado
            System.out.println("\nTabuleiro atual:");
            for (int i = 0; i < jogoVelha.length; i++) {
                for (int j = 0; j < jogoVelha[i].length; j++) {
                    System.out.print(jogoVelha[i][j] + " ");
                    if (j < 2) {
                        System.out.print("| ");
                    }
                }
                System.out.println();
                if (i < 2) {
                    System.out.println("---------");
                }
            }
            System.out.println();

            // Verifica se o jogador 1 (X) ganhou
            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || // linha 1
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || // linha 2
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || // linha 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || // coluna 1
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || // coluna 2
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || // coluna 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') || // diagonal
                                                                                                    // principal
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')) { // diagonal
                                                                                                    // secundária
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            }
            // Verifica se o jogador 2 (O) ganhou
            else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || // linha 1
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || // linha 2
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || // linha 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || // coluna 1
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || // coluna 2
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || // coluna 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') || // diagonal
                                                                                                    // principal
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')) { // diagonal
                                                                                                    // secundária
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            }
            // Verifica se houve empate (todas as posições preenchidas)
            else if (jogada > 9) {
                ganhou = true;
                System.out.println("Empate! Ninguém ganhou essa partida.");
            }
        }

        scan.close();
    }
}