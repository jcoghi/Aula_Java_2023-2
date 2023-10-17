/*
5. Tendo como dados de entrada a altura e o sexo 
   de uma pessoa, construa um programa que calcule 
   seu peso ideal utilizando as seguintes fórmulas:
      a. Homens: Peso Ideal = (72,7 * altura) - 58
      b. Mulheres: Peso Ideal = (62,1 * altura) – 44,7

 */
package aula0905;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo04a {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite sua altura:");
            double altura = teclado.nextDouble();

            System.out.println("Informe sexo:");
            String sexo = teclado.next();

            if (sexo.equalsIgnoreCase("masculino")) {
               double pesoIdeal = (72.7 * altura) - 58;
               System.out.println("Peso ideal de " + pesoIdeal);
            } else if (sexo.equalsIgnoreCase("feminino")) {
                double pesoIdeal = (62.1 * altura) - 44.7;
                System.out.println("Peso ideal de " + pesoIdeal);
            } else {
                System.out.println("Sexo inválido");
            }
            
            

        } catch (Exception ex) {
            System.out.println("Altura inválida");
        }

    }
}
