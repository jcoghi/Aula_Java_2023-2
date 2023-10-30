package aula1024.enums;

/**
 *
 * @author joaof
 */
public enum Bebidas {
    CERVEJA("Baden Baden Golden", 17.00),
    VODKA("Absolut", 65.00),
    CACHACA("Velho Barreiro", 51.00),
    GIN("Tanqueray", 100.00),
    AGUA("Cristal", 10.00);

    public String nome;
    public double valor;

    private Bebidas(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
}
