package aula0822;

import java.util.Scanner;

public class Exemplo05 {
    
    public static void main(String[] args) {
        
        //DECLARAÇÃO
        int anoAtual, idade, nascimento;
        Scanner teclado = new Scanner(System.in);
        
        //Atribuição
        anoAtual = 2023;
        System.out.println("Informe seu ano de nascimento");
        nascimento = teclado.nextInt();
        
        //CALCULAR IDADE
        idade = anoAtual - nascimento;
        
        //MOSTRAR NA TELA
        System.out.println("Idade: " + idade);
    }
}
