package DAO;

import DTO.EnderecoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EnderecoDAO {
    Connection conn;
    PreparedStatement pstm;
    Statement stm;
    ResultSet rs;

    // cadastrando endereco do cliente no Banco de Dados
    public void cadastrarEndereco(EnderecoDTO enderecodto){
        String sql = "INSERT INTO henrique_leao.enderecos(estado, cidade, bairro, rua, numero, cliente_id) VALUES(?,?,?,?,?,?);";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, enderecodto.getEstado());
            pstm.setString(2, enderecodto.getCidade());
            pstm.setString(3, enderecodto.getBairro());
            pstm.setString(4, enderecodto.getRua());
            pstm.setInt(5, enderecodto.getNumero());
            pstm.setInt(6, enderecodto.getCliente_id());
            
            pstm.execute();
            pstm.close();
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EnderecoDAO -> cadastrarEndereco: " + erro.getMessage());
        }
        
    }
    
    
    // pegando endereço pelo id do cliente
    public String pegarEnderecoCliente(int cliente_id){
        String estado, cidade, bairro, rua, endereco = "";
        int numero;
        
        String sql = "SELECT * FROM henrique_leao.enderecos WHERE cliente_id = ?";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, cliente_id);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                    estado = rs.getString("estado");
                    cidade = rs.getString("cidade");
                    bairro = rs.getString("bairro");
                    rua = rs.getString("rua");
                    numero = rs.getInt("numero");
                    endereco = String.format("%s, %s, %s, %s, %o", estado, cidade, bairro, rua, numero );
            }
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EnderecoDAO -> pegarEnderecoCliente: " + erro.getMessage());
        }
        
        return endereco;
    }

    
}
