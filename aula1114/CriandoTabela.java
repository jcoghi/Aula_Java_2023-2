package aula1114;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author prof. João Felipe F. Coghi
 */
public class CriandoTabela {

    public static void main(String[] args) {
        try {
            Connection conexao = ControllerJDBC.getConexao();
            
            String query = "CREATE TABLE IF NOT EXISTS Pessoas("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(50) NOT NULL"
                    + ");";
                    
            Statement stmt = conexao.createStatement();
            stmt.execute(query);
            
            conexao.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
