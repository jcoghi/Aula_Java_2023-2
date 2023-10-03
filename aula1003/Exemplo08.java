/*
 * Elabore um programa que faça a sequência e n elementos da sequência de 
 * Fibonacci.
 */
package aula1003;

/**
 *
 * @author joaof
 */
public class Exemplo08 {
    // 0,1,1,2,3,5,8,13....
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    
    public static void main(String[] args) {
        
        int elemento = fibo(10);
        System.out.println(elemento);
    }

}
