/*
 * SENHA SECRETA -> NÚMERO -> 0 a 10
 * LEMBRETE -> nextInt(bound) -> bound não entra na conta!
 * PARA FAZER ALEATÓRIO DE 0 A 10, O BOUND TEM QUE SER 11!
 */
package aula0919;

import java.util.Random;
import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo01 {

    public static void main(String[] args) {
        
        Random gerador = new Random();
        int senha = gerador.nextInt(11);
        Scanner teclado = new Scanner(System.in);
        int entrada = -1;
        
        try {
            System.out.println("**** SENHA SECRETA ****");
            
            System.out.println("Digite um número:");

            while (entrada != senha) {
                
                entrada = teclado.nextInt();
                
                if (entrada > senha) {
                    System.out.println("Você digitou um número maior");
                    System.out.println("\nDigite novamente");
                } else if (entrada < senha){
                    System.out.println("Você digitou um número menor");
                    System.out.println("\nDigite novamente");
                }       
            }
            
            System.out.println("Você acertou");
        } catch (Exception e) {
            System.out.println("Entrada inválida");
        }
        
    }

}
