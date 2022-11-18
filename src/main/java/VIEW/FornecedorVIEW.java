package VIEW;

import DAO.FornecedorDAO;
import DAO.ProdutoDAO;
import DTO.FornecedorDTO;
import DTO.ProdutoDTO;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FornecedorVIEW extends javax.swing.JFrame {

    public FornecedorVIEW() {
        initComponents();
        listarFornecedores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtRazaoSocial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCadastrarFornecedor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecedores = new javax.swing.JTable();
        btnFecharJanelaFornecedor = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        txtRazaoSocial.setBackground(new java.awt.Color(0, 0, 0));
        txtRazaoSocial.setForeground(new java.awt.Color(255, 255, 255));
        txtRazaoSocial.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaoSocialActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Razão Social");

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("CNPJ");

        txtCnpj.setBackground(new java.awt.Color(0, 0, 0));
        txtCnpj.setForeground(new java.awt.Color(255, 255, 255));
        txtCnpj.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnpjActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Email");

        txtEmail.setBackground(new java.awt.Color(0, 0, 0));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnCadastrarFornecedor.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrarFornecedor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCadastrarFornecedor.setForeground(new java.awt.Color(255, 255, 0));
        btnCadastrarFornecedor.setText("Cadastrar Fornecedor");
        btnCadastrarFornecedor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        btnCadastrarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFornecedorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("CADASTRO DE FORNECEDORES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtRazaoSocial)
                            .addComponent(txtEmail))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCadastrarFornecedor)
                        .addGap(122, 122, 122))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnCadastrarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        tblFornecedores.setBackground(new java.awt.Color(0, 0, 0));
        tblFornecedores.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tblFornecedores.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tblFornecedores.setForeground(new java.awt.Color(204, 204, 204));
        tblFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id", "Razão Social", "CNPJ", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFornecedores.setColumnSelectionAllowed(true);
        tblFornecedores.setFillsViewportHeight(true);
        tblFornecedores.setGridColor(new java.awt.Color(204, 204, 204));
        tblFornecedores.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tblFornecedores.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tblFornecedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblFornecedores.setShowGrid(false);
        tblFornecedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblFornecedores);
        tblFornecedores.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnFecharJanelaFornecedor.setBackground(new java.awt.Color(0, 0, 0));
        btnFecharJanelaFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFecharJanelaFornecedor.setForeground(new java.awt.Color(255, 255, 0));
        btnFecharJanelaFornecedor.setText("FECHAR");
        btnFecharJanelaFornecedor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        btnFecharJanelaFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharJanelaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharJanelaFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFecharJanelaFornecedor)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnFecharJanelaFornecedor)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaoSocialActionPerformed

    private void txtCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnpjActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFornecedorActionPerformed
        cadastrarFornecedor();
    }//GEN-LAST:event_btnCadastrarFornecedorActionPerformed

    private void btnFecharJanelaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharJanelaFornecedorActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharJanelaFornecedorActionPerformed

    public static void iniciarFrameFornecedor() {
        java.awt.EventQueue.invokeLater(() -> new FornecedorVIEW().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarFornecedor;
    private javax.swing.JButton btnFecharJanelaFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tblFornecedores;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtRazaoSocial;
    // End of variables declaration//GEN-END:variables

    private void limparCamposDeTexto(){
        txtRazaoSocial.setText("");
        txtCnpj.setText("");
        txtEmail.setText(""); 
    }
    
    
    private void cadastrarFornecedor(){
        String razaoSocial, cnpj, email;
        
        razaoSocial = txtRazaoSocial.getText();
        cnpj = txtCnpj.getText();
        email = txtEmail.getText();
        
        FornecedorDTO fornecedorDto = new FornecedorDTO(razaoSocial, cnpj, email);
        
        FornecedorDAO fornecedorDao = new FornecedorDAO();
        fornecedorDao.cadastrarFornecedor(fornecedorDto);
        
        limparCamposDeTexto();
        listarFornecedores();
    }
    
    
    private void listarFornecedores(){
        try {
            FornecedorDAO fornecedorDao = new FornecedorDAO();
            DefaultTableModel model = (DefaultTableModel) tblFornecedores.getModel();
            model.setNumRows(0);
            
            ArrayList<FornecedorDTO> lista = fornecedorDao.consultarProdutos("");
            
            for(int i = 0; i < lista.size(); i++){  
                FornecedorDTO f = lista.get(i);
                
                model.addRow(new Object[]{
                    f.getCodigo(),
                    f.getRazaoSocial(),
                    f.getCnpj(),
                    f.getEmail()
                });
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FornecedorVIEW -> listarFornecedores: " + erro);
        }
    }
}
