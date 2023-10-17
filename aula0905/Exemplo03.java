/*4.	Faça um programa que leia um número inteiro e 
        retorna ao usuário uma mensagem informando se o número
        é par ou ímpar e se é positivo ou negativo.*/
package aula0905;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int entrada;

        try {
            System.out.println("Insira um número inteiro");
            entrada = teclado.nextInt();

            if (entrada < 0 && entrada % 2 == 0) {
                System.out.println("Negativo e Par");
            } else if (entrada < 0 && entrada % 2 != 0) {
                System.out.println("Negativo e Ímpar");
            } else if (entrada > 0 && entrada % 2 != 0) {
                System.out.println("Positivo e Ímpar");
            } else {
                System.out.println("Positivo e Par");
            }

        } catch (InputMismatchException ex) {
            System.out.println("Deu ruim!");
        }

    }

}
