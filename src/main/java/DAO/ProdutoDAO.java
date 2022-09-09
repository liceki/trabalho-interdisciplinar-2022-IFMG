package DAO;

import DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class ProdutoDAO {
    
    Connection conn; 
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ProdutoDTO> lista = new ArrayList<>();
    
    // --> MÉTODO PARA CADASTRAR PRODUTOS NO BANCO DE DADOS
    public void cadastrarProduto(ProdutoDTO objprodutodto){
        String c = "INSERT INTO henrique_leao.produtos (produto_nome, produto_categoria, produto_tamanho, produto_quantidade, preco_compra, preco_venda, data_entrada) VALUES(?,?,?,?,?,?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(c);
            pstm.setString(1, objprodutodto.getNome());
            pstm.setString(2, objprodutodto.getCategoria());
            pstm.setString(3, objprodutodto.getTamanho());
            pstm.setInt(4, objprodutodto.getQuantidade());
            pstm.setDouble(5, objprodutodto.getPrecoCompra());
            pstm.setDouble(6, objprodutodto.getPrecoVenda());
            pstm.setDate(7, Date.valueOf(LocalDate.now()));
            
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + e);
        }
    }
    
    

// --> MÉTODO PARA CONSULTAR PRODUTOS NO BANCO DE DADOS
    public ArrayList<ProdutoDTO> consultarProdutos(String condition){
        String c = "SELECT * FROM henrique_leao.produtos " + condition;
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(c);
            rs = pstm.executeQuery();

            while(rs.next()){
                ProdutoDTO produtoconsulta = new ProdutoDTO();
                
                produtoconsulta.setId_produto(rs.getInt("produto_id"));
                produtoconsulta.setNome(rs.getString("produto_nome"));
                produtoconsulta.setCategoria(rs.getString("produto_categoria"));
                produtoconsulta.setTamanho(rs.getString("produto_tamanho"));
                produtoconsulta.setQuantidade(rs.getInt("produto_quantidade"));
                produtoconsulta.setPrecoCompra(rs.getDouble("preco_compra"));
                produtoconsulta.setPrecoVenda(rs.getDouble("preco_venda"));
                produtoconsulta.setDataEntrada(rs.getDate("data_entrada").toLocalDate());
                
                lista.add(produtoconsulta); 
            }
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO -> consultarProduto: " + erro.getMessage());
        }
        
        return lista;
        
    }
    
    
    
// --> MÉTODO PARA DELETAR PRODUTO PELO ID
    public void deletarProdutoPeloId(int idproduto){
        String sql = "DELETE FROM henrique_leao.produtos WHERE produto_id = " + idproduto;
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "deletarProdutoPeloId" + erro);
        }
    }
    
    
// --> MÉTODO PARA ALTERAR PRODUTO PELO ID
    public void alterarProduto(ProdutoDTO objprodutodto, int produto_id){
        String sql = "UPDATE henrique_leao.produtos SET produto_nome = ?, produto_categoria = ?, produto_tamanho = ?, produto_quantidade = ?, preco_compra = ?, preco_venda = ?"
                + "WHERE produto_id = " + produto_id;
        Connection conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprodutodto.getNome());
            pstm.setString(2, objprodutodto.getCategoria());
            pstm.setString(3, objprodutodto.getTamanho());
            pstm.setInt(4, objprodutodto.getQuantidade());
            pstm.setDouble(5, objprodutodto.getPrecoCompra());
            pstm.setDouble(6, objprodutodto.getPrecoVenda());
            pstm.executeUpdate();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO -> alterarProduto: " + erro.getMessage());
        }
        
    }
    
    
}
