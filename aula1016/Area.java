package aula1016;

/**
 * @author prof. João Felipe Coghi
 */
public class Area {

    //ATRIBUTOS
    private double a, b, c;

    //CONSTRUTORES
    public Area(double lado) {
        this.a = lado;
    }

    public Area(double lado, double altura) {
        this.a = lado;
        this.b = altura;
    }

    public Area(double bMaior, double bMenor, double altura) {
        this.a = bMaior;
        this.b = bMenor;
        this.c = altura;
    }

    //GET
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //MÉTODOS
    public double calcArea(double lado) {
        return Math.pow(lado, 2);
    }

    public double calcArea(double lado, double altura) {
        return lado * altura;
    }

    public double calcArea(double bMaior, double bMenor, double altura) {
        return (bMaior + bMenor) / 2 * altura;
    }

}
