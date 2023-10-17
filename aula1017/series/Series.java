package aula1017.series;

import aula1017.produtos.Produto;

/**
 * @author prof. João Felipe Coghi
 */
public class Series extends Produto {

    private int temporadas = 1;
    private int episodios = 1;

    /**
     * <p>
     * Você deve informar o <b>nome</b> e <b>tempo</b> </p>
     *
     * @param nome Inserir o nome do <em>filme</em> ou da série
     * @param tempo Inserir o tempo em minutos
     * @param temporadas Inserir a quantidade de temporadas
     */
    public Series(String nome, int tempo, int temporadas, int episodios) {
        super(nome, tempo);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    /**
     *
     * @return Quantidade de temporadas
     */
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int duração() {
        return super.getTempo();
    }

    @Override
    public String toString() {
        return super.getNome() + "\n Duração: " + duracao() + "\n Episódios: " + episodios + "\n Temporadas: " + temporadas;
    }

}
