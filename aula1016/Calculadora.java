package aula1016;

import java.util.Scanner;

/**
 * @author prof. João Felipe Coghi
 */
public class Calculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Area a1;
        String opcao;

        System.out.println("Escolha entre:"
                + "\n\t1. Quadrado;"
                + "\n\t2. Retângulo;"
                + "\n\t3. Trapézio"
                + "\n\tQual área desejada?");
        opcao = teclado.next();

        switch (opcao) {
            case "1" -> {
                System.out.println("Informe o lado do quadrado");
                a1 = new Area(teclado.nextDouble());
                System.out.println("Area = " + a1.calcArea(a1.getA()));
            }
            case "2" -> {
                System.out.println("Informe o lado do retângulo");
                double lado = teclado.nextDouble();
                System.out.println("Informe a altura do retângulo");
                double altura = teclado.nextDouble();
                a1 = new Area(lado, altura);
                System.out.println("Area = " + a1.calcArea(
                        a1.getA(), a1.getB()));
            }
            case "3" -> {
                System.out.println("Informe a base maior do trapézio");
                double bMaior = teclado.nextDouble();
                System.out.println("Informe a base menor do trapézio");
                double bMenor = teclado.nextDouble();
                System.out.println("Informe a altura do trapézio");
                double altura = teclado.nextDouble();
                a1 = new Area(bMaior, bMenor, altura);
                System.out.println("Area = "
                        + a1.calcArea(a1.getA(), a1.getB(), a1.getC()));
            }
            default -> {
                System.out.println("Opção inválida");
            }
        }

    }
}
