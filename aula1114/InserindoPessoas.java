package aula1114;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author prof. João Felipe F. Coghi
 */
public class InserindoPessoas {

    public static void main(String[] args) {

        try {
            Connection conexao = ControllerJDBC.getConexao();
            Scanner teclado = new Scanner(System.in);

            System.out.println("Insira um nome:");
            String nome = teclado.nextLine();
            /* 
            nunca permitir que o usuário faça esse tipo de interação com o
             banco de dados, pois permitimos SQL injection
           
            Statement stmt = conexao.createStatement();
            String query = "INSERT INTO Pessoas(nome) VALUES ('" + nome + "');";
            stmt.execute(query);
            */
            
            String query = "INSERT INTO Pessoas(nome) VALUES (?);";
            PreparedStatement stmt = conexao.prepareStatement(query);
            stmt.setString(1, nome);
            
            stmt.execute();
            conexao.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
