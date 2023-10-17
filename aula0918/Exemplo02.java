package aula0918;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo02 {

    public static void main(String[] args) {
            
        boolean ligado = true;
        int cont = 0;
        
        while (ligado) { 
            
            if (cont > 10) {
                ligado = false;
            } else {
                System.out.println(cont);
                cont++;
            }
            
        }
        
    }

}
