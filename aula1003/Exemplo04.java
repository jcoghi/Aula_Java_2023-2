package aula1003;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author joaof
 */
public class Exemplo04 {
   
    public static String[] cadastro() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome:");
        String nome = teclado.nextLine();
        System.out.println("Idade:");
        String idade = teclado.next();
        System.out.println("CPF:");
        String cpf = teclado.next();
        
        String[] retorno = {nome, idade, cpf};
        return retorno;
    }
    
    public static void main(String[] args) {
        String[] dados = new String[3];
        dados = cadastro();
        System.out.println(Arrays.toString(dados));
    }
}
