/*
 * TABUADA
 */
package aula0918;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo04 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        try {
            
            int contador = 0;
            
            System.out.println("Digite um número");
            int entrada = teclado.nextInt();
            
            while (contador <= 10) {
                
                int resultado = contador * entrada;
                System.out.printf("%d * %d = %d \n", 
                        entrada, contador, resultado);
                contador++;
            }
               
        } catch (Exception e) {
            System.out.println("Digitação inválida,"
                    + "Digite apenas números inteiros");
        }
        
    }

}
