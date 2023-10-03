package aula1003;
/**
 * @author joaof
 */
public class Exemplo01 {

    public static Double quadrado(double num1) {
        return Math.pow(num1,2);
    }
    
    public static boolean verificaPar(int num) {
        return (num % 2 == 0);
    }

    
    public static void main(String[] args) {
        
        if (verificaPar(3)) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
