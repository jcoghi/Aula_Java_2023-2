package aula0828;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo02 {

    public static void main(String[] args) {
            
            //DECLARAÇÃO
            Scanner teclado = new Scanner(System.in);
            int num1, num2;
            double media;
            
            //ATRIBUIÇÃO
            System.out.println("Informe o primeiro número:");
            num1 = teclado.nextInt();
            System.out.println("Informe o segundo número:");
            num2 = teclado.nextInt();
            media = (double)(num1 + num2) / 2;
            
            
            //SAÍDA
            System.out.println("Média: " + media);
    }
}
