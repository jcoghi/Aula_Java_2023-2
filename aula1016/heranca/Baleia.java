package aula1016.heranca;

/**
 * @author prof. João Felipe Coghi
 */
public class Baleia extends Mamifero {

    public void cantar() {
        System.out.println("Dó, Ré , Mi, Fá");
    }

    @Override
    public void respirar() {
        System.out.println("Respiro de baixo d'água!");
    }

}
