package DAO;

import java.sql.PreparedStatement;
import MODEL.Categoria;
import MODEL.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.UIManager.getInt;


/**
 *
 * @author Luan Said Meira
 */

public class CategoriaDAO {
   
    public static void cadastrarCategoria (Categoria categoria) throws SQLException {
        String sql = "INSERT INTO categorias (nome) VALUES(?)";
        PreparedStatement pstm = new Conexao().pegarConexao().prepareStatement(sql);
        pstm.setObject(1, categoria.getNome());
        pstm.execute();
        pstm.close();
    }
    public static List <Categoria> listarCategoria () throws SQLException {
        
        List <Categoria> categorias = new ArrayList();
        String sql = "SELECT * FROM categorias ORDER BY id";
                PreparedStatement pstm = new Conexao().pegarConexao().prepareStatement(sql);
                ResultSet rs = pstm.executeQuery();
                while (rs.next()) {
                    Categoria categoria = new Categoria();
                    categoria.setId(rs.getInt("id"));
                    categoria.setNome(rs.getString("nome"));
                    categorias.add(categoria);
                }
                rs.close();
        return categorias;
    }
}
