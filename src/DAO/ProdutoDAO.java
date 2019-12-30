package DAO;

import MODEL.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luan Said Meira
 */

public class ProdutoDAO {
    
    public static void cadastrarProduto (Produto produto) throws SQLException {
        String sql = "INSERT INTO produtos (nome, quantidade, id_categoria) VALUES(?, ?, ?)";
        PreparedStatement pstm = new Conexao().pegarConexao().prepareStatement(sql);
        pstm.setObject(1, produto.getNome());
        pstm.setObject(2, produto.getQuantidade());
        pstm.setObject(3, produto.getId_categoria());
        pstm.execute();
        pstm.close();
    }
    
    public static void removerProduto (int id) throws SQLException {
        String sql = "DELETE FROM produtos WHERE id=?";
        PreparedStatement pstm = new Conexao().pegarConexao().prepareStatement(sql);
        pstm.setObject(1, id);
        pstm.execute();
        pstm.close();
    }
    
    public static List<Produto> buscarProduto(String tipo) throws SQLException {
        List <Produto> produtos = new ArrayList();
        /* O argumento 'tipo' norteia para qual consulta SQL o sistema vai realizar.*/
        switch (tipo) {
            case "padrao":
                String sql = "SELECT * FROM produtos ORDER BY id";
                PreparedStatement pstm = new Conexao().pegarConexao().prepareStatement(sql);
                ResultSet rs = pstm.executeQuery();
                while (rs.next()) {
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id"));
                    produto.setNome(rs.getString("nome"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produtos.add(produto);
                }
                rs.close();
            break;
            case "nome":
                sql = "SELECT * FROM produtos ORDER BY nome";
                pstm = new Conexao().pegarConexao().prepareStatement(sql);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id"));
                    produto.setNome(rs.getString("nome"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produto.setId_categoria(rs.getInt("id_categoria"));
                    produtos.add(produto);
                }
                rs.close();
            break;
            
            case "quantidade":
                sql = "SELECT * FROM produtos ORDER BY quantidade";
                pstm = new Conexao().pegarConexao().prepareStatement(sql);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id"));
                    produto.setNome(rs.getString("nome"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produto.setId_categoria(rs.getInt("id_categoria"));
                    produtos.add(produto);
                }
                rs.close();
            break;
            
            case "maiorMenorQuantidade":
                sql = "SELECT * FROM\n" +
                    "(SELECT nome as nome_maximo, quantidade as quantidade_maximo FROM produtos\n" +
                    "WHERE quantidade = (SELECT max(quantidade) FROM produtos)\n" +
                    ")t1,\n" +
                    "(SELECT nome as nome_minimo, quantidade as quantidade_minimo FROM produtos\n" +
                    "WHERE quantidade = (SELECT min(quantidade) FROM produtos)\n" +
                    ")t2;"; 
                    
                pstm = new Conexao().pegarConexao().prepareStatement(sql);
                rs = pstm.executeQuery();
                while (rs.next()) {
                        Produto produto_min = new Produto();
                        Produto produto_max = new Produto();
                        produto_min.setNome(rs.getString("nome_minimo"));
                        produto_min.setQuantidade(rs.getInt("quantidade_minimo"));
                        produto_max.setNome(rs.getString("nome_maximo"));
                        produto_max.setQuantidade(rs.getInt("quantidade_maximo"));
                        produtos.add(produto_min);
                        produtos.add(produto_max);
                }
                rs.close();
            break;
            
            case "categoria":
                sql = "SELECT * FROM produtos order by id_categoria";
                pstm = new Conexao().pegarConexao().prepareStatement(sql);
                rs = pstm.executeQuery();
                while (rs.next()) {
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id"));
                    produto.setNome(rs.getString("nome"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produtos.add(produto);
                }
                rs.close();
            break;            
        }
        return produtos;
    }
    
    public static List<Produto> buscarProdutoEspecifico(int id) throws SQLException {
        List<Produto> produtos = new ArrayList();
        String sql = "SELECT DISTINCT * FROM produtos WHERE id_categoria=?";
        PreparedStatement pstm = new Conexao().pegarConexao().prepareStatement(sql);
        pstm.setObject(1, id);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            Produto produto = new Produto();
            produto.setId(rs.getInt("id"));
            produto.setNome(rs.getString("nome"));
            produto.setQuantidade(rs.getInt("quantidade"));
            produto.setId_categoria(rs.getInt("id_categoria"));
            produtos.add(produto);
        }
        rs.close();
        return produtos;
    }
    
    public static String recuperarNome (int id) throws SQLException {
        String nome_categoria = null;
        String sql = "SELECT nome FROM categorias WHERE id=?";
        PreparedStatement pstm = new Conexao().pegarConexao().prepareStatement(sql);
        pstm.setObject(1, id);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            nome_categoria = rs.getString("nome");
        }
        rs.close();
        return nome_categoria;
    }
    /*
    public static void atualizarProduto (Produto produto) throws SQLException{
        String sql = "UPDATE produtos SET nome=?, tipo=? ,preco=? WHERE id=?";
        PreparedStatement pstm = new Conexao().pegarConexao().prepareStatement(sql);
        pstm.setObject(1, produto.getNome());
        pstm.setObject(2, produto.getTipo());
        pstm.setObject(3, produto.getPreco());
        pstm.setObject(4, produto.getId());
        pstm.execute();
        pstm.close();
    }
     
*/
}

