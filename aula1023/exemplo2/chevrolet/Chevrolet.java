package aula1023.exemplo2.chevrolet;

import aula1023.exemplo2.carro.Carro;

/**
 *
 * @author prof. João Felipe F. Coghi
 */
public class Chevrolet extends Carro{

    String montadora = "GM-Chrevrolet";
    
    
    public Chevrolet(String nome, float preco, int ano) {
        super(nome, preco, ano);
    }

    @Override
    public void atualizarPreco(int ano) {
        if (getAno() == ano) {
            setPreco(getPreco() * 0.9f);
        }
    }

    public String getMontadora() {
        return montadora;
    }
    
    
}
