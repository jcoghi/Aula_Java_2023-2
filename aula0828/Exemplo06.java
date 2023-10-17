package aula0828;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo06 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, num4, resultado;
        
        System.out.println("Informe o primeiro número: ");
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = teclado.nextInt();
        System.out.println("Informe o terceiro número: ");
        num3 = teclado.nextInt();
        System.out.println("Informe o quarto número: ");
        num4 = teclado.nextInt();
        
        resultado = (int)(Math.pow(num1, 2) + Math.pow(num2, 2) + 
                Math.pow(num3, 2) + Math.pow(num4, 2));
        
        System.out.println(resultado);
        
    }

}
