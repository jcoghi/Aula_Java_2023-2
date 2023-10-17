/*
 * Devolver a soma de todos os números pares;
 */
package aula1003;

import java.util.Scanner;

/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo06 {

    public static int somaPares(int numero) {
        if (numero % 2 != 0) {
            return somaPares(numero - 1);
        } else if (numero == 0) {
            return 0;
        }
        return numero + somaPares(numero - 2);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("**** SOMA DOS PARES");
        System.out.println("Insira um número:");
        int num = teclado.nextInt();

        int soma = somaPares(num);
        System.out.println(soma);
    }
}
