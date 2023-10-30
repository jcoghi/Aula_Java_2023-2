package aula1024.interfaces;

/**
 *
 * @author prof. João Felipe F. Coghi
 */
public class Triangulo implements Exemplo {

    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;

    public Triangulo(int base, int altura, int ladoA, int ladoB) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public int getArea() {
        return (base * altura) / 2;
    }
    
    @Override
    public int getPerimetro() {
        return ladoA + ladoB + base;
    }
}
