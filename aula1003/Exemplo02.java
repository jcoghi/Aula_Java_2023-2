/*
 * Escrever uma função que verifica se uma letra está detro de 
 * uma determinada palavra
 */
package aula1003;

/**
 * @author joaof
 */
public class Exemplo02 {
    
    
    public static boolean verificaLetra(String letra, String palavra) {
        return palavra.contains(letra);
    }

    public static void main(String[] args) {
        
        String palavra = "arara";
        String letra = "e";
        
        String mensagem = 
                verificaLetra(letra, palavra) ? "Encontrei" : "Não encontrei";
        
        System.out.println(mensagem);
        
    }
}
