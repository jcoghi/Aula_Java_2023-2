package aula1016.rpg;

/**
 * @author joaof
 */
public class Jogo {

    public static void main(String[] args) {

        Personagens p1 = new Personagens("João", 10);
        Personagens p2 = new Personagens("Goblin", 2);

        System.out.println(p1.getNome() + " estava em uma floresta,"
                + " quando de repente sai um " + p2.getNome()
                + " de trás de um arbusto.");
        System.out.println("Assustado, " + p1.getNome() + " saca "
                + "sua espada e ataca o " + p2.getNome());

        System.out.println(p1.info());
        System.out.println(p2.info());

        while (p1.isVivo() && p2.isVivo()) {
            p2.setVida(p1.dano(p2));
            p2.setVivo(p2.getVida());
            p1.setVida(p2.dano(p1));
            p1.setVivo(p1.getVida());
        }
        
        System.out.println(p1.info());
        System.out.println(p2.info());
    }
}
