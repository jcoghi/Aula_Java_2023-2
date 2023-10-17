package aula1017.produtos;

/**
 * @author prof. João Felipe Coghi
 */
public abstract class Produto {

    private String nome;
    private int tempo; // minutos

    public Produto(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    /**
     * <p>
     * Função que retorna a duração do filme ou da série</p>
     *
     * @return String com tempoHoras:tempoMinutos
     */
    public String duracao() {
        int tempoHoras = (int) tempo / 60;
        int tempoMinutos = (int) tempo % 60;
        return String.valueOf(tempoHoras) + ":" + String.valueOf(tempoMinutos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

}
