package aula1114;

// Não faça assim, mas faremos em aula...
import java.sql.*;

/**
 *
 * @author joaof
 */
public class ControllerJDBC {

    public static Connection getConexao() {
        try {
            final String url = "jdbc:mysql://localhost/tsegundona";
            final String user = "root";
            final String senha = "123456";

            return DriverManager.getConnection(url, user, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
