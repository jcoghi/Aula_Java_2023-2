/*
 * Fazer uma calculadora de tabuada em que o usuário informa qual número
 * ele sedeja a tabuada e o programa devolve a tabuada entre 0 e 10 daquele
 * número. Dado: vetor =  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */
package aula0925;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo06 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num, resultado;
        String[] nomes = {"joao", "felipe","sheila", "Miguel"};
        boolean encontrado = false;
        
        System.out.println("Entre com um nome");
        String entrada = teclado.next();
        
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(entrada)) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("A pessoa foi encontrada no banco");
        } else {
            System.out.println("A pessoa não foi encontrada no banco");
        }
    }

}
