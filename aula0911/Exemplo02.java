/*
Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um programa que calcule seu peso ideal utilizando as 
seguintes fórmulas:
    a.	Homens: Peso Ideal = (72,7 * altura) - 58
    b.	Mulheres: Peso Ideal = (62,1 * altura) – 44,7

*/
package aula0911;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo02 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int sexo;
        double altura, pesoIdeal;
        
        try {
            System.out.println("""
                               DIGITE:
                                1. Masculino
                                2. Feminino
                               """);
            sexo = teclado.nextInt();
            
            System.out.println("Altura:");
            altura = teclado.nextDouble();
            
            switch (sexo) {
                case 1:
                    pesoIdeal = (72.7 * altura) - 58;
                    System.out.printf("Peso ideal é %.2f kg\n",pesoIdeal);
                    break;
                case 2:
                    pesoIdeal = (62.1 * altura) - 44.7;
                    System.out.printf("Peso ideal é %.2f kg\n", pesoIdeal);
                    break;
                default:
                    System.out.println("Você deve escolher 1 ou 2");
            }
            
        } catch (Exception ex) {
            System.out.println("Errou a digitação");
        }
        
        
    }
            
}
