package aula1010.conta;

import java.util.Scanner;

/**
 * @author prof. João Felipe Coghi
 */
public class Banco {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Conta joao = new Conta(100, "João");
        Conta miguel = new Conta(1000, "Miguel");
        boolean ligado = true;

        while (ligado) {
            try {
                System.out.println("""
                           \t******************
                           \t* CONTA BANCÁRIA *
                           \t******************""");

                System.out.println("Olá, " + joao.getDono() + ", segue nossa lista de opções");

                System.out.println("""
                           \t1 - Saldo
                           \t2 - Saque
                           \t3 - Depósito
                           \t4 - Transferência
                           \t5 - Sair""");
                System.out.print("Digite a opção desejada: ");
                char opcao = teclado.next().charAt(0);

                switch (opcao) {
                    case '1' -> {
                        System.out.printf("\nSaldo R$%.2f\n\n", joao.getSaldo());
                    }
                    case '2' -> {
                        System.out.println("Quanto deseja sacar?");
                        float valor = teclado.nextFloat();
                        String mensagem = joao.saque(valor) ? "Saque realizado com sucesso" : "Saldo insuficiente";
                        System.out.println(mensagem);
                        System.out.printf("Saldo atualizado para R$%.2f\n\n", joao.getSaldo());
                    }

                    case '3' -> {
                        System.out.println("Quanto deseja depositar?");
                        float valor = teclado.nextFloat();
                        joao.deposito(valor);
                        System.out.printf("Saldo atualizado para R$%.2f\n\n", joao.getSaldo());
                    }
                    case '4' -> {
                        System.out.println("Quanto deseja tranferir?");
                        float valor = teclado.nextFloat();
                        joao.tranfere(miguel, valor);
                        System.out.printf("Saldo atualizado para R$%.2f\n\n", joao.getSaldo());
                    }
                    case '5' -> {
                        ligado = false;
                        System.out.println("\nObrigado e volte sempre");
                    }
                    default -> {
                        System.out.println("\nOpção inválida\n");
                    }

                }
            } catch (Exception e) {
                System.out.println("Oção inválida");
            }
        }

    }
}
