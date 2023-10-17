package aula0918;

import java.util.Random;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo05 {

    public static void main(String[] args) {
        Random gerador = new Random();
        int segredo = gerador.nextInt(10);
        System.out.println(segredo);
    }
}
