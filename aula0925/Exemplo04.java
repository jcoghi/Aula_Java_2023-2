/*
 * Calcular média entre todos os elementos do vetor criado com
 * valores aleatórios entre 1 e 100. O usuário deverá informar
 * a quantidade de elementos do vetor.
 */
package aula0925;

import java.util.Random;
import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {
        
        Random gerador = new Random();
        Scanner teclado = new Scanner(System.in);
        
        int comprimento;
        int acumulador = 0;
        double media;
        
        System.out.println("CÁLCULO DA MÉDIA");
        System.out.println("Quantos elementos?");
        comprimento = teclado.nextInt();
        
        int[] vetor = new int[comprimento];
        
        for (int a = 0; a < vetor.length; a++) {
            vetor[a] = 1 + gerador.nextInt(100);
            acumulador += vetor[a];
            System.out.println(vetor[a]);
        }

        media = (float)acumulador / comprimento;
       
        System.out.println("Média ficou em " + media);

    }

}
