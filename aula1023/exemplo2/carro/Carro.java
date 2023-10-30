package aula1023.exemplo2.carro;

/**
 *
 * @author prof. João Felipe F. Coghi
 */
public abstract class Carro {

    private String nome;
    private float preco;
    private int ano;

    public Carro(String nome, float preco, int ano) {
        this.nome = nome;
        this.preco = preco;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void atualizarPreco(int ano) {
        if (this.ano == ano) {
            this.preco *= 0.95;
        }
    }

    @Override
    public String toString() {
        String mensagem = "Nome: " + nome + "\nAno: " + String.valueOf(ano) + "\nPreço: R$" + String.valueOf(preco);
        return mensagem;
    }
}
