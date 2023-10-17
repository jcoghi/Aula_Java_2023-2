/*
 * Controle de acesso via login e senha
 */
package aula0912;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo05 {

    public static void main(String[] args) {

        final String NOME = "joao";
        final String PASSWORD = "a123";

        Scanner teclado = new Scanner(System.in);

        String login, senha;

        for (int a = 3; ; a--) {

            if (a > 0) {
                System.out.println("Tentativas: " + a);
                System.out.printf("Login: ");
                login = teclado.next();
                System.out.printf("Senha: ");
                senha = teclado.next();

                if (login.equals(NOME) && senha.equals(PASSWORD)) {
                    System.out.println("Acesso liberado");
                    break;
                } else {
                    System.out.println("Usuário ou senha inválidos \n");
                }
            } else {
                System.out.println("Acesso bloqueado");
                break;
            }

        }

    }

}
