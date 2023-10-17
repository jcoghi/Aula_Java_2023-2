package aula0926;

import java.util.Arrays;

/**
 * @author prof. João Felipe Coghi
 */
public class Exercicio02 {

    public static void main(String[] args) {

        String[][] moradores = {{"Joao", "Julia", "Laura", "Bruno"},
        {"Diego", "Renato", "Mateus", "Vinicius"}};
        System.out.println("Lista de moradores:");

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.println(moradores[linha][coluna]);
            }
        }

        System.out.println(Arrays.deepToString(moradores));
    }
}
