package aula1016.heranca;

/**
 * @author prof. João Felipe Coghi
 */
public class Animais {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.respirar();
        cachorro.latir();

        Gato gato = new Gato();
        gato.respirar();
        gato.miar();

        Baleia baleia = new Baleia();
        baleia.respirar();
        baleia.cantar();

    }
}
