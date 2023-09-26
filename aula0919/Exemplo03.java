/*
 * 7.	O usuário vai digitar uma nota válida (de 0 até 10). 
 * O programa deverá armazenar estas notas em um acumulador. 
 * Usar uma segunda variável para contar quantas notas foram armazenadas.
 * Ao final, quando o usuário não quiser mais lançar notas, ele pede para
 * sair e o programa imprime na tela a média das notas.
 */
package aula0919;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nota = "";
        double sum = 0;
        double media;
        int contador = 0;
        System.out.println("Digite Ok a qualquer momento para sair");
        try {
            while (!nota.equalsIgnoreCase("ok")) {
                System.out.println("Digite uma nota:");
                nota = teclado.next();

                if (!nota.equalsIgnoreCase("ok")) {
                    nota = nota.replace(",", ".");
                    if (Double.parseDouble(nota) >= 0
                            && Double.parseDouble(nota) <= 10) {
                        // CASTING
                        sum += Double.parseDouble(nota);
                        contador++;
                    } else {
                        System.out.println("Digite uma nota entre 0 e 10");
                    }
                }
            }
            media = sum / contador;
            System.out.println("Media = " + media);

        } catch (Exception e) {
            System.out.println("Entrada inválida");
            System.out.println(e);
        }

    }

}
