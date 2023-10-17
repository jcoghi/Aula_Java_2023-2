/*
 * Fazer 2 matrizes 2x2 povoadas com números aleatórios entre 0 e 10;
 * O programa deve mostrar as 2 matrizes e a matriz soma entre elas. 
 */
package aula0926;

import java.util.Arrays;
import java.util.Random;

/**
 * @author prof. João Felipe Coghi
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Random gerador = new Random();
        int[][] m1 = new int[2][2];
        int[][] m2 = new int[2][2];
        int[][] soma = new int[2][2];

        for (int linha = 0; linha < m1.length; linha++) {
            for (int coluna = 0; coluna < m1.length; coluna++) {
                m1[linha][coluna] = gerador.nextInt(11);
                m2[linha][coluna] = gerador.nextInt(11);
                soma[linha][coluna] = m1[linha][coluna] + m2[linha][coluna];
            }
        }
//        
//        System.out.println(Arrays.deepToString(m1) +
//                " + " + Arrays.deepToString(m2) + " = " + 
//                Arrays.deepToString(soma));

        System.out.println(Arrays.toString(m1[0]) + " + " + Arrays.toString(m2[0]));
        System.out.println(Arrays.toString(m1[1]) + "   " + Arrays.toString(m2[1]));

    }

}
