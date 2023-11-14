package aula1114;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * @author prof. João Felipe Coghi
 */
public class TesteConexao {

    public static void main(String[] args) {
        final String url = "jdbc:mysql://localhost";
        final String user = "root";
        final String senha = "123456";
        
        try (Connection conexao = DriverManager.getConnection(url, user, senha)) {
            System.out.println("conectado");
            
        } catch(SQLException e) {
            System.out.println("Erro ao conectar no Servidor");
        }
    }
}
