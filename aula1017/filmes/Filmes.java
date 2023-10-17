package aula1017.filmes;

import aula1017.produtos.Produto;

/**
 * @author prof. João Felipe Coghi
 */
public class Filmes extends Produto {

    private String categoria;

    public Filmes(String nome, int tempo, String categoria) {
        super(nome, tempo);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.getNome() + "\n Categoria: " + getCategoria() + "\n Duração: " + super.duracao();
    }

}
