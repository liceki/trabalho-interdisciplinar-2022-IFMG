package DAO;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    public Connection conectaBD(){
        Dotenv dotenv = Dotenv.load();
        String url = dotenv.get("DB_ACCESS");
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO: " + erro.getMessage());
        }
        return conn;  
    } 
}
