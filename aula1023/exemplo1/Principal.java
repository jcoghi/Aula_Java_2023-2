package aula1023.exemplo1;

import aula1023.exemplo1.cachorro.Cachorro;
import aula1023.exemplo1.gato.Gato;

/**
 *
 * @author prof. João Felipe Coghi
 */
public class Principal {

    public static void main(String[] args) {
        
        Cachorro cao = new Cachorro();
        Gato gato = new Gato();
        
        
        gato.comunicar();
        cao.comunicar();
    }
}
