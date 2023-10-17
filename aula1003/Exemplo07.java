/*
 * Fazer um programa para o cálculo fatorial de um número
 * 4! = 4 . 3 . 2 . 1 = 24
 */
package aula1003;

import java.util.Scanner;

/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo07 {

    public static int fatorial(int num) {

        return (num == 1) ? 1 : num * fatorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** CÁLCULO FATORIAL ***");
        System.out.println("Digite um número inteiro");
        int num = teclado.nextInt();

        System.out.println(fatorial(num));
    }
}
