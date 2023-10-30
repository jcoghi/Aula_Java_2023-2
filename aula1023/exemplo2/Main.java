package aula1023.exemplo2;

import aula1023.exemplo2.chevrolet.Onix;
import aula1023.exemplo2.chevrolet.OnixPlus;
import aula1023.exemplo2.honda.City;
import aula1023.exemplo2.honda.Hrv;

/**
 *
 * @author prof. Joao Felipe F. Coghi
 */
public class Main {

    public static void main(String[] args) {
        
        City city = new City("City", 125000f, 2023);
        Hrv hrv = new Hrv("HRV", 142000, 2023);
        
        Onix onix = new Onix("Onix", 90000, 2023);
        OnixPlus onixPlus = new OnixPlus("Onix Plus", 104000, 2023);
        
        System.out.println("--------------------------");
        System.out.println(city.toString());
        city.atualizarPreco(2023);
        System.out.println(city.toString());
        System.out.println("--------------------------");
        
        System.out.println("\n--------------------------");
        System.out.println(onix.toString());
        onix.atualizarPreco(2022);
        System.out.println(onix.toString());
        System.out.println("--------------------------");
        
        System.out.println("\n--------------------------");
        System.out.println(onix.toString());
        onix.atualizarPreco(2023);
        System.out.println(onix.toString());
        System.out.println("--------------------------");
    }
}
