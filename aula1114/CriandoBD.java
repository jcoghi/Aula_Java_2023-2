package aula1114;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author prof. João Felipe F. Coghi
 */
public class CriandoBD {

    public static void main(String[] args) throws SQLException {
        
        Connection conexao = ControllerJDBC.getConexao();
        
        Statement stmt = conexao.createStatement();
        String query = "CREATE DATABASE IF NOT EXISTS tsegundona";
        
        stmt.execute(query);
        System.out.println("Banco de dados criado com sucesso");
        conexao.close();
    }

}
