package aula1016.rpg;

/**
 * @author joaof
 */
public class Personagens {

    private String nome;
    private int vida;
    private int ataque = (int) (Math.random() * 10);
    private int defesa = (int) (Math.random() * 10);
    private boolean vivo = true;

    public Personagens(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int dano(Personagens destino) {
        if (this.vivo && destino.vivo) {
            return this.ataque - destino.defesa;
        }
        return Integer.MIN_VALUE;
    }

    public void setVida(int dano) {
        if (dano == Integer.MIN_VALUE) {
            this.vida = 0;
        } else if (vida - dano < 0) {
            this.vida = 0;
        } else {
            this.vida -= dano;
        }
    }

    public void setVivo(int vida) {
        if (vida == 0) {
            vivo = false;
        } else {
            vivo = true;
        }
    }
    
    public String info() {
        String info = "Nome: " + nome +
                      "\nVida: " + vida + 
                      "\nAtaque: " + ataque + 
                      "\n Defesa: " + defesa;
        return info;
    }
}
