package aula1010.funcionario;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author prof. João Felipe Coghi
 */
public class CadastroFuncionario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome;
        int matricula;
        String funcao;
        Funcionario[] funcionarios = new Funcionario[3];

        for (int a = 0; a < 3; a++) {
            System.out.println("Nome: ");
            nome = teclado.next();
            System.out.println("Matrícula: ");
            matricula = teclado.nextInt();
            System.out.println("Função: ");
            funcao = teclado.next();
            if (funcao.equalsIgnoreCase("vendedor")) {
                funcionarios[a] = new Funcionario(nome, matricula);
            } else {
                funcionarios[a] = new Funcionario(nome, matricula, funcao);
            }
        }

        System.out.println(Arrays.toString(funcionarios));
    }
}
