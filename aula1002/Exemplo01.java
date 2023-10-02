/*
 * 1.	Crie um programa com uma matriz 3x3 preenchida aleatoriamente com
 * números entre -10 e 10. O programa deve mostrar a matriz criada e sua oposta. 
 */
package aula1002;

import java.util.Arrays;
import java.util.Random;


public class Exemplo01 {

    public static void main(String[] args) {

        Random gerador = new Random();
        boolean negativo;
        int numero;
        int[][] matriz = new int[3][3];
        int[][] matrizOposta = new int[3][3] ;
        
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                numero = gerador.nextInt(11);
                negativo = gerador.nextBoolean();
                
                if (!negativo) {
                    matriz[lin][col] = numero;
                    matrizOposta[lin][col] = -numero;
                } else {
                    matriz[lin][col] = -numero;
                    matrizOposta[lin][col] = numero;
                }
            }
        }
        
        System.out.println(Arrays.deepToString(matriz));
        System.out.println(Arrays.deepToString(matrizOposta));
        
        
    }

}
