package aula0828;

import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        float real, dolar;
        final float COTACAO = 4.89f;
        
        System.out.println("Quantos dólares quer converter: ");
        dolar = teclado.nextFloat();
        
        real = COTACAO * dolar;
        
        System.out.printf("R$ %.2f \n",real);
    }

}
