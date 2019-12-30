package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luan Said Meira
 */
public class Conexao {
    
    final private String url = "jdbc:postgresql://localhost:5432/estoque";  
    final private String usuario = "luan";
    final private String senha = "shake225";
   
    public Connection pegarConexao(){
        try{
            Connection con = DriverManager.getConnection(url, usuario, senha);
            return con;
        }catch(SQLException erro){
            System.out.println("Problema ao se conectar");
        }
        return null;
    }
}
