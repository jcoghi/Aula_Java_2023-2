
package aula1002;

public class Exemplo04 {

    public static void main(String[] args) {

        int numero = soma(3,2);
        System.out.println(numero);
    }
 
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }
    
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }
    
    public static int mult(int num1, int num2) {
        return num1 * num2;
    }
    
    public static int div(int num1, int num2) {
        return num1 / num2;
    }

}
