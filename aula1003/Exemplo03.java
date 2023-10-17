/*
 * Fazer um programa de cadastro de cliente no qual temos uma função
 * para a entrada de dados, ou seja, sempre que desejamos uma informação,
 * temos que chamar a função.
 * Informações do cliente: Nome completo, idade, CPF
 */
package aula1003;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo03 {

    public static String entrada() {
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine();
        return entrada;
    }

    public static void main(String[] args) {
        String[] opcoes = {"Nome:", "Idade:", "CPF:"};
        String[][] entradas = new String[2][opcoes.length];
        entradas[0] = opcoes;

        for (int a = 0; a < entradas[0].length; a++) {
            System.out.println(opcoes[a]);
            entradas[1][a] = entrada();

        }

        for (String[] saida : entradas) {
            System.out.println(Arrays.toString(saida));
        }
    }
}
