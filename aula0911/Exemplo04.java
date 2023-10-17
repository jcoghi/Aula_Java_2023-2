package aula0911;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome, resultado;
        char sexo;
        int idade;
        double hemo;

        try {
            System.out.println("Nome:");
            nome = teclado.nextLine();

            System.out.println("Idade:");
            idade = teclado.nextInt();

            System.out.println("Hemoglobina:");
            hemo = teclado.nextDouble();

            if (idade > 2 && idade <= 6) {
                resultado = (hemo > 11.5 && hemo < 13.5) ? "Normal" : "Anormal";
                System.out.println(nome + " está " + resultado);
            } else if (idade > 6 && idade <= 12) {
                resultado = (hemo > 11.5 && hemo < 15.5) ? "Normal" : "Anormal";
                System.out.println(nome + " está " + resultado);
            } else if (idade < 120) {
                System.out.println("Sexo: [M/F]");
                sexo = teclado.next().toLowerCase().charAt(0);
                switch (sexo) {
                    case 'm':
                        resultado = (hemo > 14 && hemo < 18) ? "Normal" : "Anormal";
                        System.out.println(nome + " está " + resultado);
                        break;
                    case 'f':
                        char gestante;
                        System.out.println("Gestante? [s/n]");
                        gestante = teclado.next().toLowerCase().charAt(0);

                        switch (gestante) {
                            case 'n':
                                resultado = (hemo > 12 && hemo < 16) ? "Normal" : "Anormal";
                                System.out.println(nome + " está " + resultado);
                                break;
                            case 's':
                                resultado = (hemo > 11) ? "Normal" : "Anormal";
                                System.out.println(nome + " está " + resultado);
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }

                    default:
                        System.out.println("Sexo inválido");
                }
            } else {
                System.out.println("Idade inválida");
            }

        } catch (InputMismatchException ex) {
            System.out.println("Idade ou Hemoglobina inválidos");
        }

    }
}
