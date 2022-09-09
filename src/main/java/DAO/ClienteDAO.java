package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {
    PreparedStatement pstm;
    Statement stm;
    Connection conn;
    ResultSet rs;

    //checando ultimo id cadastrado
    public int idCliente(){
        String sql = "SELECT cliente_id FROM henrique_leao.clientes ;";
        conn = new ConexaoDAO().conectaBD();
        int id = 0;
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                id = rs.getInt("cliente_id");
            }
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO -> idCliente: " + erro.getMessage());
        }
        
        return id;
    }
    
    
    //cadastrando cliente no Banco de Dados
    public void cadastrarCliente(ClienteDTO cliente){
        String sql = "INSERT INTO henrique_leao.clientes(cliente_nome, cliente_telefone, cliente_cpf, cliente_email) VALUES (?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cliente.getCliente_nome());
            pstm.setString(2, cliente.getCliente_telefone());
            pstm.setString(3, cliente.getCliente_cpf());
            pstm.setString(4, cliente.getCliente_email());
            
            pstm.execute();
            pstm.close();
               
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO -> cadastrarCliente" + erro.getMessage());
        }
    }
    
    
    //consultando clientes cadastrados no Banco de Dados
    public ArrayList<ClienteDTO> consultarClientes(String condicao){
        ArrayList<ClienteDTO> listaClientes = new ArrayList<>();
        
        int id, endereco;
        String nome, telefone, email, cpf;
        
        String sql = "SELECT * FROM henrique_leao.clientes ;";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
                id = rs.getInt("cliente_id");
                nome = rs.getString("cliente_nome");
                telefone = rs.getString("cliente_telefone");
                email = rs.getString("cliente_email");
                cpf = rs.getString("cliente_cpf");
                
                ClienteDTO clientedto = new ClienteDTO(id, nome, telefone, email, cpf);
                listaClientes.add(clientedto);
            } 
            
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO -> consultarClientes: " + erro.getMessage());
        }
        
        return listaClientes;
        
    }
    
}
