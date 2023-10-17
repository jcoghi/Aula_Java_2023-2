package aula0822;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo04 {
    
    public static void main(String[] args) {
       
        //DECLARAÇÃO
       double celsus, fahrenheit;
       Scanner teclado = new Scanner(System.in);
       
       //ATRIBUIÇÃO
       System.out.println("Informe uma temperatura em °C");
       celsus = teclado.nextDouble();
       fahrenheit = celsus * (9.0 / 5) + 32;
       
       //MOSTRAR NA TELA
        System.out.println("Temperatura em Fahrenheit: " 
                + fahrenheit + "°F");
    }
}
