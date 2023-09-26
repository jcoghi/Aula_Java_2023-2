/*CALCULAR ANIVERSÁRIO - calendar*/
package aula0828;

import java.util.Calendar;



public class Exemplo01 {

    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        int ano = calendar.get(Calendar.YEAR);
        System.out.println(ano);
    }

}
