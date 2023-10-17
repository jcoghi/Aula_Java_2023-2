package aula0904;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo01 {

    public static void main(String[] args) {

        // DECLARAÇÃO
        double num1, num2, num3, media;
        
        // CRIAÇÃO DE DO TECLADO
        Scanner teclado = new Scanner(System.in);
        
        // ENTRADA DE VALORES
        System.out.println("Informe um número");
        num1 = teclado.nextDouble();
        System.out.println("Informe um número");
        num2 = teclado.nextDouble();
        System.out.println("Informe um número");
        num3 = teclado.nextDouble();
        
        // CÁLCULO DA MÉDIA
        media = (num1 + num2 + num3) / 3;
        
        // SAÍDA DE SISTEMA
        System.out.println("Média = " + media);
    }
}
