package aula1121;

import java.util.Scanner;
import java.sql. ResultSet;
/**
 *
 * @author prof. João Felipe F. Coghi
 */
public class Crud {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ControllerJDBC conexao = new ControllerJDBC();
        String nome;
        int id;
        boolean ligado = true;
        
        try{
        while(ligado) {
            System.out.println("Acesso ao banco de dados"
                    + "\n1 - Inserir;"
                    + "\n2 - Buscar;"
                    + "\n3 - Atualizar;"
                    + "\n4 - Deletar"
                    + "\n5 - Sair"
                    + "\nSelecione a opção desejada");
            int opcao = teclado.nextInt();
            
            switch(opcao) {
                case 1 -> {
                    System.out.println("Insira o nome da pessoa:");
                    nome = teclado.nextLine();
                    conexao.inserirDado(nome);
                }
                case 2 ->{
                    ResultSet busca =  conexao.buscarDados();
                    while(busca.next()) {
                        System.out.print(busca.getInt("id") + " ");
                        System.out.println(busca.getString("nome"));
                    }
                }
                case 3 ->{
                    System.out.println("Informe o novo nome:");
                    nome = teclado.nextLine();
                    System.out.println("Informe o id a ser alterado:");
                    id = teclado.nextInt();
                    if (conexao.atualizarDado(id, nome) > 0) {
                        System.out.println("Alteração realizada com sucesso.");
                    } else {
                        System.out.println("Nenhum dado foi alterado.");
                    }
                }
                case 4 ->{
                    System.out.println("Informe o id a ser removido:");
                    id = teclado.nextInt();
                    if (conexao.deletarDado(id) > 0) {
                        System.out.println("Alteração realizada com sucesso.");
                    } else {
                        System.out.println("Nenhum dado foi alterado.");
                    }
                }
                case 5 ->{
                    ligado = false;
                    System.out.println("Obrigado e volte sempre");
                }
                default -> {System.out.println("Opçõa Inválida");}
            }
            
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
