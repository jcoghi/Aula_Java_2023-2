/*
 * FUNÇÃO RECURSIVA
 * É uma função que chama ela mesma até conseguir resolver uma situação.
 */
package aula1003;

/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo05 {

    public static int proximoPar(int numero) {
        if (numero % 2 != 0) {
            return proximoPar(numero + 1);
        }
        return numero;
    }

    public static void main(String[] args) {
        System.out.println(proximoPar(3));
    }

}
