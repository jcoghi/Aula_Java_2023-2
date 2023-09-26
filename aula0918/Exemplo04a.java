/*
 * TABUADA
 */
package aula0918;

import java.util.Scanner;

public class Exemplo04a {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        boolean ligado = true;

        try {

            System.out.println("Digite um número");
            int entrada = teclado.nextInt();

            while (ligado) {

                if (contador <= 10) {
                    int resultado = contador * entrada;
                    System.out.printf("%d * %d = %d \n",
                            entrada, contador, resultado);
                    contador++;
                } else {
                    ligado = false;
                }

            }

        } catch (Exception e) {
            System.out.println("Digitação inválida,"
                    + "Digite apenas números inteiros");
        }

    }

}
