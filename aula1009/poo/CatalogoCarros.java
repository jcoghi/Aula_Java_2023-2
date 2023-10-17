package aula1009.poo;

/**
 * @author prof. João Felipe Coghi
 */
public class CatalogoCarros {

    public static void main(String[] args) {

        Carro tCross = new Carro("VolksWagen",
                "T-Cross Highline",
                1.4);

        tCross.cor = "Prata";
        tCross.porta = 4;

        System.out.println("Rodas = " + tCross.RODAS);
        System.out.println("Cor = " + tCross.cor);
        System.out.println("Marca = " + tCross.marca);
        System.out.println("Modelo = " + tCross.modelo);
        System.out.println("motor = " + tCross.motor);
        System.out.println("Placa = " + tCross.valor);
        System.out.println("portas = " + tCross.porta);

    }
}
