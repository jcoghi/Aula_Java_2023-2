package aula1009.poo;

/**
 * @author joaof
 */
public class Carro {
    //ATRIBUTOS
    public final int RODAS = 4;
    public String marca;
    public String modelo;
    public String cor;
    public int porta = 2;
    public double valor = 100000;
    public double motor;
    
    //CONSTRUTOR
    public Carro
        (String marca, String modelo, double motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
}
