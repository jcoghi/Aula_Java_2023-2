package aula1023.exemplo1.gato;

import aula1023.exemplo1.mamifero.Mamifero;

/**
 *
 * @author João Felipe Coghi
 */
public class Gato extends Mamifero{
    
    @Override
    public void respirar() {
        System.out.println("Respido pelo nariz mesmo, sou um gato!");
    }
    
    @Override
    public void comunicar() {
        System.out.println("MMMIIIAAUU");
    }
}
