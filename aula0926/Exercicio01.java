/*
 * Faça um programa que gere aleatoriamente uma amostra de 500 números entre 
 * 5 e 1000. O programa deve salvar estes números em um vetor e, depois, 
 * calcular a quantidade de números pares e ímpares da amostra.
 */
package aula0926;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author joaof
 */
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Random gerador = new Random();  
        int[] numeros = new int[500];
        int pares = 0;
        int impares = 0;
        
        for (int a  = 0; a < numeros.length; a++) {
            numeros[a] = gerador.nextInt(996)+5;
        }
        
        for (int numero : numeros) {
            
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            
        }
        
        System.out.printf("São %d números pares \n", pares);
        System.out.printf("São %d números ímpares \n", impares);
    }
    
}
