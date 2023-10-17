
/*
 * 2.	Crie uma matriz 4x4 preenchida aleatoriamente entre 10 e 1000. 
 * O programa deve informar o maior valor da matriz.
 */
package aula1002;

import java.util.Random;

/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo03 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        Random gerador = new Random();
        int maior = Integer.MIN_VALUE;

        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                matriz[lin][col] = gerador.nextInt(991) + 10;
                if (matriz[lin][col] > maior) {
                    maior = matriz[lin][col];
                }
            }
        }
        System.out.println("Maior entrada foi " + maior);
    }

}
