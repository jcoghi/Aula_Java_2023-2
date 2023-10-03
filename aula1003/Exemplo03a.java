package aula1003;

import java.util.Scanner;

/**
 * @author joaof
 */
public class Exemplo03a {
    
    public static String entrada() {
        Scanner teclado = new Scanner(System.in);
        String digitado = teclado.nextLine(); // 111.222.333-44
        digitado = digitado.replace("-",".");
        digitado = digitado.replace(".","");
        return digitado;
    }
    public static void main(String[] args) {
        
        try{
        System.out.println("**** CADASTRO DE CLIENTES ****");
        System.out.println("Nome Completo:");
        String nome = entrada();

        System.out.println("Idade:");
        int idade = Integer.parseInt(entrada());
        
        System.out.println("CPF:");
        int cpf = Integer.parseInt(entrada());
        
        System.out.println("Cadastro realizado com sucesso:");
        System.out.println(nome + " " + idade + " anos " + cpf);
        } catch (NumberFormatException e) {
            System.out.println("Idade e CPF com apenas números");
        }
        
    }
}
