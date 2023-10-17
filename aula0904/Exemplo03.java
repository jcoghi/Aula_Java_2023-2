package aula0904;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo03 {

    public static void main(String[] args) {
        
        // DECLARAÇÃO E ATRIBUIÇÃO
        int num;
        Scanner teclado = new Scanner(System.in);
        String menorOuNao;
        
        System.out.println("Entre com um número:");
        num = teclado.nextInt();
       
        if (num % 2 == 0)menorOuNao = "Par"; 
        else menorOuNao = "Impar";
        
        System.out.println(menorOuNao);
    }

}
