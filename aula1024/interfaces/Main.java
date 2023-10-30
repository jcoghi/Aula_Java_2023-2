package aula1024.interfaces;

/**
 * @author prof. João Felipe F. Coghi
 */
public class Main {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Triangulo triangulo = new Triangulo(3,5,10,8);
        
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getArea());
        
    }
}
