/*
 * 3.	Crie um programa para ler 3 notas e mostrar a média delas.
 */
package aula0919;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int contador = 1;
        double soma = 0;
        double entrada;
        double media;
               
        try {
            
            while (contador < 4) {
                System.out.println("Digite uma nota:");
                entrada  = teclado.nextDouble();
                
                if (entrada < 0 || entrada > 10) {
                    System.out.println("Nota inválida");
                } else {
                   soma += entrada;
                   contador++;
                }
            }
            
            media = soma / contador;
            System.out.printf("Média = %.2f \n",media);

        } catch (Exception e) {
            System.out.println("Entrada inválida");
        }
        
    }

}
