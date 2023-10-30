package aula1024.interfaces;

/**
 *
 * @author prof. João Felipe F. Coghi
 */
public class Quadrado implements Exemplo {

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }
    
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
    
    @Override
    public int getArea() {
        return lado * lado;
    }
    
    @Override
    public int getPerimetro() {
        return lado * 4;
    }
}
