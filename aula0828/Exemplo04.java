package aula0828;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo04 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        double x, y;
        
        System.out.println("Informe a coordenada x:");
        x = teclado.nextDouble();
        
        y = 3 * x + 2;
        
        System.out.println("y = " + y);
    }

}
