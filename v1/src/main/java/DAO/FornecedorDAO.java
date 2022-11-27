package DAO;

import DTO.FornecedorDTO;
import DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FornecedorDAO {
    Connection conn; 
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FornecedorDTO> lista;
    
    // --> MÉTODO PARA CADASTRAR FORNECEDORES NO BANCO DE DADOS
    public void cadastrarFornecedor(FornecedorDTO fornecedorDto){
        String c = "INSERT INTO espaco_mix.fornecedores(razao_social, cnpj, email) VALUES(?,?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(c);
            pstm.setString(1, fornecedorDto.getRazaoSocial());
            pstm.setString(2, fornecedorDto.getCnpj());
            pstm.setString(3, fornecedorDto.getEmail());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FornecedorDto -> cadastrarFornecedor" + e.getMessage());
        }
    }
    
    // --> MÉTODO PARA CONSULTAR FORNECEDORES CADASTRADOS NO BD
    public ArrayList<FornecedorDTO> consultarProdutos(String condition){
        String c = "SELECT * FROM espaco_mix.fornecedores " + condition;
        conn = new ConexaoDAO().conectaBD();
        this.lista = new ArrayList<>();
        
        try {
            pstm = conn.prepareStatement(c);
            rs = pstm.executeQuery();

            while(rs.next()){
                FornecedorDTO fornecedorConsulta = new FornecedorDTO();
                
                fornecedorConsulta.setCodigo(rs.getInt("codigo"));
                fornecedorConsulta.setRazaoSocial(rs.getString("razao_social"));
                fornecedorConsulta.setCnpj(rs.getString("cnpj"));
                fornecedorConsulta.setEmail(rs.getString("email"));
                
                lista.add(fornecedorConsulta); 
            }
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO -> consultarFornecedores: " + erro.getMessage());
        }
        
        return lista;
        
    }
}
