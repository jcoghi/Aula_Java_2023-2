package aula1121;

// Não faça assim, mas faremos em aula...
import java.sql.*;

/**
 *
 * @author joaof
 */
public class ControllerJDBC {

    private String query;

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

    // Create do CRUD
    public boolean inserirDado(String nome) throws SQLException {
        query = "INSERT INTO pessoas(nome) VALUES (?)";
        PreparedStatement stmt = getConexao().prepareStatement(query);
        stmt.setString(1, nome);

        return stmt.execute();
    }

    // READ do CRUD
    public ResultSet buscarDados() throws SQLException {
        query = "SELECT * FROM pessoas";
        Statement stmt = getConexao().createStatement();

        return stmt.executeQuery(query);
    }

    // UPDATE do CRUD
    public int atualizarDado(int id, String nome) throws SQLException {
        query = "UPDATE pessoas SET nome = ? WHERE id  = ?";
        PreparedStatement stmt = getConexao().prepareStatement(query);
        stmt.setString(1, nome);
        stmt.setInt(2, id);

        return stmt.executeUpdate();
    }

    // DELETE do CRUD
    public int deletarDado(int id) throws SQLException {
        query = "DELETE FROM pessoas WHERE id = ?";
        PreparedStatement stmt = getConexao().prepareStatement(query);
        stmt.setInt(1, id);

        return stmt.executeUpdate();
    }

}
