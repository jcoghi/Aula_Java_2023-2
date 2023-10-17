package aula0911;

import java.util.Scanner;
/**
 * @author prof. João Felipe Coghi
 */
public class Reforco {

    public static void main(String[] args) {
        
        // DECLARAÇÃO
        // Números
        Scanner teclado = new Scanner(System.in);    
        int db, senha;
        db = 1234;
        
        try{
        System.out.println("Senha:");
        senha = teclado.nextInt();
        
        switch(senha) {
            case 1234:
                System.out.println("Acesso liberado");
            System.out.println("""
                               1. Saldo
                               2. Pagamento
                               3. Empréstimo
                               4. Poupança
                               """);
            break;
            default:
                System.out.println("Acesso bloqueado no Switch");
        }
        
        if (senha == db) {
            System.out.println("Acesso liberado");
            System.out.println("""
                               1. Saldo
                               2. Pagamento
                               3. Empréstimo
                               4. Poupança
                               """);
        }
        else {
            System.out.println("Acesso bloqueado no else");
        }
        }
        catch (Exception e) {
            System.out.println("Erro na entrada da senha");
        }
    }
}
