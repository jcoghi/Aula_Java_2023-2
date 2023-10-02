package aula1002;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int entrada;
        int auxiliar = Integer.MIN_VALUE;
        
        
        try{
            for (int a = 0; a< 5; a++) {
                System.out.println("Insira um numero");
                entrada = teclado.nextInt();
                if ( entrada > auxiliar) {
                    auxiliar = entrada;
                }
            }
            
            System.out.println(auxiliar);
            
        } catch (Exception e) {
            System.out.println("Entrada inválida");
        }
        
    }

}
