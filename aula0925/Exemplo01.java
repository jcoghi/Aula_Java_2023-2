package aula0925;

import java.util.Random;

public class Exemplo01 {

    public static void main(String[] args) {
        
        Random gerador = new Random();
        int[] vetor = new int[3];
        
        for (int a = 0; a < 3; a++) {
            vetor[a] = gerador.nextInt(100);
        }
        
        System.out.print("[");
        for (int a = 0; a < 3; a++){
            if (a != 2) {
                System.out.printf("%d, ", vetor[a]);
            }
            else {
                System.out.println(vetor[a] + "]");
            }
        }


    }

}
