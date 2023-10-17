package aula0925;

import java.util.Random;
import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo03 {

    public static void main(String[] args) {
        
        Random gerador = new Random();
        Scanner teclado = new Scanner(System.in);
        
        int comprimento;
        
        System.out.println("Qual comprimento você deseja?");
        comprimento = teclado.nextInt();
        
        int[] vetor = new int[comprimento];
        
        for (int a = 0; a < vetor.length; a++) {
            vetor[a] = gerador.nextInt(100);
        }
        
        for (int elemento : vetor) {
            System.out.println("\n" + elemento);
        }
       

    }

}
