package aula0905;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Exemplo01 {
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
        int idade;
        char sexo;

        System.out.println("Digite sua idade");
        idade = teclado.nextInt();

        System.out.println("Informe o sexo biológico[M/F]");
        sexo = teclado.next().toLowerCase().charAt(0);

        if (idade >= 18 && sexo == 'm') {
            System.out.println("Obrigatório");
        } else if (idade >= 18 && sexo == 'f') {
                System.out.println("Não Obrigatório");
        } else if (idade >=18) {
            System.out.println("Opção inválida");
        } else {
            System.out.println("Não pode");
        }

    }
    
}
