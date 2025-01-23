package aula_20;

/*
 * Faça um programa que crie uma matriz 3x3x3 onde cada elemento da matriz seja igual a soma 
 * dos seus índices (exemplo: M[1,2,1] = 1+2+1 = 4). Obtenha a soma de todos elementos da 
 * matriz, e obtenha soma dos elementos cujos valores são pares e a soma dos elementos cujos 
 * valores são ímpares. Exibir na tela os valores da soma total, soma dos pares e soma dos 
 * ímpares.
 */
public class Matriz_02 {
    public static void main(String[] args) {
        //Instanciando um array de 3 linhas e 3 colunas e 3 profundidade
        int[][][] matriz = new int[3][3][3];

        //atribuindo valores
        int somaTotal = 0;
        int somaPares = 0;
        int somaImpares = 0;
        //Preenchendo a matriz e calculando a soma total, soma dos pares e soma dos ímpares
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    //Atribuindo valores
                    matriz[i][j][k] = i + j + k;
                    //Soma total
                    somaTotal += matriz[i][j][k];
                    //Verifica se o número é par ou ímpar
                    if (matriz[i][j][k] % 2 == 0) {
                        //Soma dos pares
                        somaPares += matriz[i][j][k];
                    } else {
                        //Soma dos ímpares
                        somaImpares += matriz[i][j][k];
                    }
                }
            }
        }
    }
    
}
