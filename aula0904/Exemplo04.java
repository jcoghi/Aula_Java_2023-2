/*
VAMOS FAZER UM PROGRAMA PARA VERIFICAR SE A PESSOA
DEVE OU NÃO SE ALISTAR NO EXÉRCITO.
 */
package aula0904;

import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int idade;
        char sexo;

        System.out.println("Digite sua idade");
        idade = teclado.nextInt();

        System.out.println("Informe o sexo biológico[M/F]");
        sexo = teclado.next().charAt(0);

        if (idade >= 18) {
            if (sexo == 'M') {
                System.out.println("Obrigatório");
            } else if (sexo == 'm') {
                System.out.println("Obrigatório");
            } else if (sexo == 'F') {
                System.out.println("Não Obrigatório");
            } else if (sexo == 'f') {
                System.out.println("Não Obrigatório");
            } else {
                System.out.println("Opção inválida");
            }
        } else {
            System.out.println("Não pode ainda");
        }

    }
}
