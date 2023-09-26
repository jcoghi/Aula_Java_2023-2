/*
 * NÚMEROS PARES DE 0 ATÉ 100 -> condição booleana
 */
package aula0918;

public class Exemplo03a {

    public static void main(String[] args) {
        
        boolean ligado = true;
        int cont = 0;
        
        while (ligado) {
            
            if(cont > 100) {
                ligado = false;
            } else {
                System.out.println(cont);
                cont += 2;
            }
            
        }
        
    }

}
