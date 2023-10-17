/*
 * Fazer uma calculadora de tabuada em que o usuário informa qual número
 * ele sedeja a tabuada e o programa devolve a tabuada entre 0 e 10 daquele
 * número. Dado: vetor =  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */
package aula0925;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo05 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num, resultado;
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        try{
            System.out.println("CALCULADORA DE TABUADA");
            System.out.println("De qual número você deseja a tabuada?");
            num = teclado.nextInt();
            
            for(int elemento : vetor) {
                resultado = elemento * num;
                System.out.printf("%d * %d = %d \n",
                        elemento, num, resultado);
            }
        
        
        } catch(Exception e) {
            System.out.println("Você deve digitar um número inteiro");
        }
    }

}
