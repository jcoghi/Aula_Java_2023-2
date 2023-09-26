package aula0828;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exemplo03 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero, resultado;
        
        
        System.out.println("Informe um numero: ");
        numero = teclado.nextInt();
        
        resultado = (int)Math.pow(numero, 2);
        
        JOptionPane.showMessageDialog
        (null, resultado);

    }

}
