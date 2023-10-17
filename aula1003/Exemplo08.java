/*
 * Elabore um programa que faça a sequência e n elementos da sequência de 
 * Fibonacci.
 */
package aula1003;

import java.util.Scanner;

/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo08 {

    // 0,1,1,2,3,5,8,13....
    public static int[] entradas() {
        Scanner teclado = new Scanner(System.in);
        int[] entradas = new int[2];

        System.out.println("Valor 1:");
        entradas[0] = teclado.nextInt();
        System.out.println("Valor 2:");
        entradas[1] = teclado.nextInt();

        return entradas;
    }

//    public static void main(String[] args) {
//        
//        int elemento = fibo(10);
//        System.out.println(elemento);
//    }
}
