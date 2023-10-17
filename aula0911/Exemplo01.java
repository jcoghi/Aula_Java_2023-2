package aula0911;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo01 {

    public static void main(String[] args) {
        
        String segredo = "CERVEJA";
        
        Scanner teclado = new Scanner(System.in);
        String entrada;
        
        System.out.println("Informe uma palavra");
        entrada = teclado.next().toUpperCase();
        
        String resultado = (entrada.equals(segredo))? 
                "Acertou" : "Errrou" ;
        System.out.println(resultado);
   
    }
}
