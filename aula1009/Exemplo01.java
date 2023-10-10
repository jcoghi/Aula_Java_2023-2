/*
 * Contador Números Pares
 */
package aula1009;

import java.util.Scanner;

/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo01 {

    public static int contador(int contador, int numero) {
        if (numero == 0) {
            contador++;
            return contador;
        }
        if ( numero % 2 == 0) {
            contador++;
            return contador(contador, numero - 1);
        }
        else return contador(contador, numero-1);
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try{
        System.out.println("Insira um número inteiro");
        int n = teclado.nextInt();
            System.out.println(contador(0, n));
        } catch (Exception e) {
            System.out.println("Entrada inválida");
        }
    }
}
