/*
5. Tendo como dados de entrada a altura e o sexo 
   de uma pessoa, construa um programa que calcule 
   seu peso ideal utilizando as seguintes fórmulas:
      a. Homens: Peso Ideal = (72,7 * altura) - 58
      b. Mulheres: Peso Ideal = (62,1 * altura) – 44,7

 */
package aula0905;

import java.util.Scanner;

public class Exemplo04c {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);
            double pesoIdeal =0;

            System.out.println("Digite sua altura:");
            double altura = teclado.nextDouble();

            System.out.println("Informe sexo:");
            String sexo = teclado.next();

            if (sexo.equalsIgnoreCase("masculino")) pesoIdeal = (72.7 * altura) - 58; 
            else if (sexo.equalsIgnoreCase("feminino")) pesoIdeal = (62.1 * altura) - 44.7;
            else System.out.println("Sexo inválido");
            
            System.out.printf("Peso ideal de %.2f kg \n", pesoIdeal);

        } catch (Exception ex) {
            System.out.println("Altura inválida");
        }

    }
}
