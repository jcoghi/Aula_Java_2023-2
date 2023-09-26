package aula0925;

import java.util.Arrays;
import java.util.Random;

public class Exemplo02 {

    public static void main(String[] args) {
        
        Random gerador = new Random();
        int[] vetor = new int[3];
        
        for (int a = 0; a < 3; a++) {
            vetor[a] = gerador.nextInt(100);
        }
         
        System.out.println(Arrays.toString(vetor));
        
        for (int elemento : vetor) {
            System.out.println(elemento);
        }

    }

}
