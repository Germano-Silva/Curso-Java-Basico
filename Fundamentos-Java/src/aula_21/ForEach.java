package aula_21;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {

        // Declaração e inicialização de um array unidimensional de inteiros com 10
        // posições
        int[] notas = new int[10];

        // Criação de um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Loop for tradicional para preencher o array com notas aleatórias (0-9)
        for (int i = 0; i < notas.length; i++) {
            // Gera número aleatório entre 0 e 9 e atribui à posição i do array
            notas[i] = random.nextInt(10);
        }

        // Loop for tradicional para exibir as notas
        for (int i = 0; i < notas.length; i++) {
            int nota = notas[i]; // Acessa cada elemento pelo índice
            System.out.println(nota); // Imprime cada nota
        }

        System.out.println("Usando o for each");

        // Loop for-each (enhanced for) - mais simples e legível
        for (int nota : notas) {
            System.out.println(nota); // Itera diretamente sobre os valores
        }

        // Exemplo 02: Array multidimensional (matriz)
        System.out.println("Exemplo com arrays multidimensionais");

        // Declara matriz 3x4 (3 alunos, 4 notas cada)
        double[][] notasAlunos = new double[3][4];

        // Atribuição manual das notas do primeiro aluno
        notasAlunos[0][0] = 10; // Aluno 0, Nota 0
        notasAlunos[0][1] = 7; // Aluno 0, Nota 1
        notasAlunos[0][2] = 9; // Aluno 0, Nota 2
        notasAlunos[0][3] = 9.5; // Aluno 0, Nota 3

        // Atribuição das notas do segundo aluno
        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        // Atribuição das notas do terceiro aluno
        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        // Loop for-each aninhado para percorrer a matriz
        for (double[] notasAluno : notasAlunos) { // Itera sobre cada array interno (cada aluno)
            for (double nota : notasAluno) { // Itera sobre cada nota do aluno
                System.out.print(nota + " "); // Imprime nota com espaço
            }
            System.out.println(); // Quebra linha após cada aluno
        }
    }
}