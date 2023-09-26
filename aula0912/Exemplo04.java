/*
 * Crie programa de tabuada.
*/

package aula0912;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int entrada;
        
        try {
        System.out.println("Digite um numero inteiro");
        entrada = teclado.nextInt();
        
        
        for (int a = 0; a <= 10; a++) {
            int resultado = a * entrada;
            System.out.printf("%d * %d = %d \n",
                    entrada, a, resultado);
        }
        
        
        } catch (InputMismatchException e) {
            System.out.println("Deu ruim");
        }
    }

}
