/* LÓGICA RELACIONAL OU*/
package aula0905;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo02 {

    public static void main(String[] args) {
        /* VERIFICAÇÃO DE IDADE PARA VOTAÇÃO */
        
        int idade = 15;
        
        if (idade < 16) {
            System.out.println("Não pode votar");
        } else if ((idade >= 16 && idade < 18) || (idade >= 60 && idade < 120)) {
            System.out.println("Pode votar");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Obrigado a votar");
        } else {
            System.out.println("Vampiros não votam");
        }
        
    }

}
