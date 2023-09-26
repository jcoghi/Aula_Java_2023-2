/*
 * Como pescador profissional, João tem uma cota diária de 50kg de peixe. 
 * Ele deve pesar os peixes pescados ao final de cada dia e pagar uma multa
 * de R$ 4,00 por quilo excedente caso ultrapasse sua cota. Faça um
 * programa que, ao informar o peso de peixes, o programa retorna o valor
 * da multa. 
 */
package aula0911;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {
        
        final int COTA = 50;
        final double TAXA = 4.00;
        
        Scanner teclado = new Scanner(System.in);
        double peso, multa;
        
        System.out.println("Quanto foi pescado hoje:");
        peso = teclado.nextDouble();
        
        multa = (peso <= 50)? 0 : (peso - COTA) * TAXA;
        System.out.printf("Multa de R$ %.2f \n", multa);
        
    }
}
