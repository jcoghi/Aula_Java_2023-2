package aula1023.exemplo1.cachorro;

import aula1023.exemplo1.mamifero.Mamifero;

/**
 *
 * @author prof. João Felipe Coghi
 */
public class Cachorro extends Mamifero {
    
    @Override
    public void respirar() {
        System.out.println("Respiro pela boca com a lingua para fora!");
    }
    
    @Override
    public void comunicar() {
        System.out.println("Au Au!");
    }
}
