/* FAZER O RESTO DA DIVISÃO ENTRE
   DOIS NÚMEROS INTEIROS 
   NÃO PODE USAR O OPERADOR %
*/
package aula0822;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo03 {
    
    public static void main(String[] args) {

        //DECLARAÇÃO
        int divisor;
        int dividendo;
        int resultado;
        int resto;
        
        //ATRIBUIÇÃO
        divisor = 10;
        dividendo = 5;
        resultado = divisor / dividendo;
        resto = divisor - dividendo * resultado;
        
        //MOSTRAR NA TELA
        System.out.println(resto);
        
    }
}
