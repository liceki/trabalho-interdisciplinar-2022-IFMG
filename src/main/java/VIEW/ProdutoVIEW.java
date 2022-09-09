package VIEW;

import DAO.ProdutoDAO;
import DTO.ProdutoDTO;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProdutoVIEW extends javax.swing.JFrame {
    
    public ProdutoVIEW() {
        initComponents();
        listarProdutos();
        
        ImageIcon img = new ImageIcon("C:\\Users\\0063400\\Downloads\\Gerenciamento_Estoque_Clientes_v0.1\\src\\main\\java\\Image/Logo.png");
        this.setIconImage(img.getImage());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtPrecoCompra = new javax.swing.JTextField();
        btnAdicionarProduto = new javax.swing.JButton();
        lblCategoria1 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblNome3 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtTamanho = new javax.swing.JTextField();
        txtPrecoVenda = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtDeletarProduto = new javax.swing.JTextField();
        btnDeletarProduto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtAlterarProduto = new javax.swing.JTextField();
        btnAlterarProduto = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE PRODUTOS  - ESPAÇO MIX");
        setBackground(new java.awt.Color(0, 0, 153));
        setIconImage(getIconImage());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("CADASTRO DE PRODUTOS");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecoCompra.setBackground(new java.awt.Color(0, 0, 0));
        txtPrecoCompra.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtPrecoCompra.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecoCompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtPrecoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoCompraActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 312, 182, -1));

        btnAdicionarProduto.setBackground(new java.awt.Color(0, 0, 0));
        btnAdicionarProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdicionarProduto.setForeground(new java.awt.Color(255, 255, 0));
        btnAdicionarProduto.setText("ADICIONAR PRODUTO");
        btnAdicionarProduto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        btnAdicionarProduto.setContentAreaFilled(false);
        btnAdicionarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdicionarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 262, 37));

        lblCategoria1.setBackground(new java.awt.Color(153, 153, 0));
        lblCategoria1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCategoria1.setForeground(new java.awt.Color(255, 255, 0));
        lblCategoria1.setText("Tamanho");
        jPanel1.add(lblCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 154, -1, -1));

        lblNome2.setBackground(new java.awt.Color(153, 153, 0));
        lblNome2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(255, 255, 0));
        lblNome2.setText("Preço de Venda");
        jPanel1.add(lblNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 349, -1, -1));

        lblCategoria.setBackground(new java.awt.Color(153, 153, 0));
        lblCategoria.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 0));
        lblCategoria.setText("Categoria");
        jPanel1.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 89, -1, -1));

        lblNome1.setBackground(new java.awt.Color(153, 153, 0));
        lblNome1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(255, 255, 0));
        lblNome1.setText("Preço de Compra");
        jPanel1.add(lblNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 284, -1, -1));

        txtNome.setBackground(new java.awt.Color(0, 0, 0));
        txtNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(204, 204, 204));
        txtNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 52, 182, -1));

        lblNome.setBackground(new java.awt.Color(153, 153, 0));
        lblNome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 0));
        lblNome.setText("Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 24, -1, -1));

        lblNome3.setBackground(new java.awt.Color(153, 153, 0));
        lblNome3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNome3.setForeground(new java.awt.Color(255, 255, 0));
        lblNome3.setText("Quantidade");
        jPanel1.add(lblNome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 219, -1, -1));

        txtQuantidade.setBackground(new java.awt.Color(0, 0, 0));
        txtQuantidade.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(204, 204, 204));
        txtQuantidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 247, 182, -1));

        txtTamanho.setBackground(new java.awt.Color(0, 0, 0));
        txtTamanho.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtTamanho.setForeground(new java.awt.Color(204, 204, 204));
        txtTamanho.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanhoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 182, 182, -1));

        txtPrecoVenda.setBackground(new java.awt.Color(0, 0, 0));
        txtPrecoVenda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtPrecoVenda.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecoVenda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtPrecoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoVendaActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecoVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 377, 182, -1));

        cmbCategoria.setBackground(new java.awt.Color(0, 0, 0));
        cmbCategoria.setForeground(new java.awt.Color(204, 204, 204));
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roupas Femininas", "Roupas Masculinas", "Acessórios", "Cosméticos" }));
        cmbCategoria.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 0)));
        cmbCategoria.setName(""); // NOI18N
        cmbCategoria.setNextFocusableComponent(txtTamanho);
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 190, -1));

        tblProduto.setAutoCreateRowSorter(true);
        tblProduto.setBackground(new java.awt.Color(0, 0, 0));
        tblProduto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tblProduto.setForeground(new java.awt.Color(204, 204, 204));
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Categoria", "Tamanho", "Quantidade", "Prç.Compra", "Prç.Venda", "Lucro", "Data Entrada", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.setFillsViewportHeight(true);
        tblProduto.setGridColor(new java.awt.Color(0, 0, 0));
        tblProduto.setSelectionBackground(new java.awt.Color(255, 255, 204));
        tblProduto.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblProduto.setShowHorizontalLines(false);
        tblProduto.setShowVerticalLines(false);
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduto);
        if (tblProduto.getColumnModel().getColumnCount() > 0) {
            tblProduto.getColumnModel().getColumn(0).setResizable(false);
            tblProduto.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblProduto.getColumnModel().getColumn(1).setResizable(false);
            tblProduto.getColumnModel().getColumn(1).setPreferredWidth(75);
            tblProduto.getColumnModel().getColumn(2).setResizable(false);
            tblProduto.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblProduto.getColumnModel().getColumn(3).setResizable(false);
            tblProduto.getColumnModel().getColumn(3).setPreferredWidth(15);
            tblProduto.getColumnModel().getColumn(4).setResizable(false);
            tblProduto.getColumnModel().getColumn(4).setPreferredWidth(18);
            tblProduto.getColumnModel().getColumn(5).setResizable(false);
            tblProduto.getColumnModel().getColumn(5).setPreferredWidth(12);
            tblProduto.getColumnModel().getColumn(6).setResizable(false);
            tblProduto.getColumnModel().getColumn(6).setPreferredWidth(12);
            tblProduto.getColumnModel().getColumn(7).setResizable(false);
            tblProduto.getColumnModel().getColumn(7).setPreferredWidth(10);
            tblProduto.getColumnModel().getColumn(8).setResizable(false);
            tblProduto.getColumnModel().getColumn(8).setPreferredWidth(20);
        }

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(222, 204, 51));
        jLabel2.setText("Deletar produto pelo ID:");

        txtDeletarProduto.setBackground(new java.awt.Color(0, 0, 0));
        txtDeletarProduto.setForeground(new java.awt.Color(204, 204, 204));
        txtDeletarProduto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 240, 0)));
        txtDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeletarProdutoActionPerformed(evt);
            }
        });

        btnDeletarProduto.setBackground(new java.awt.Color(0, 0, 0));
        btnDeletarProduto.setForeground(new java.awt.Color(222, 204, 51));
        btnDeletarProduto.setText("DELETAR");
        btnDeletarProduto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        btnDeletarProduto.setContentAreaFilled(false);
        btnDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarProdutoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(222, 204, 51));
        jLabel3.setText("Alterar produto pelo ID:");

        txtAlterarProduto.setBackground(new java.awt.Color(0, 0, 0));
        txtAlterarProduto.setForeground(new java.awt.Color(204, 204, 204));
        txtAlterarProduto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 240, 0)));
        txtAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlterarProdutoActionPerformed(evt);
            }
        });

        btnAlterarProduto.setBackground(new java.awt.Color(0, 0, 0));
        btnAlterarProduto.setForeground(new java.awt.Color(222, 204, 51));
        btnAlterarProduto.setText("ALTERAR");
        btnAlterarProduto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        btnAlterarProduto.setContentAreaFilled(false);
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(txtAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(txtDeletarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(btnDeletarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAlterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addComponent(txtDeletarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        //String nomeProduto = txtNomeProduto;
    }//GEN-LAST:event_txtNomeActionPerformed


    //---------BNT-ADICIONAR-PRODUTOS---------
    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        if(numControle == 1){
            btnAdicionarProduto.setText("ADICIONAR PRODUTO");
            cadastrarProdutos();
        }else if(numControle == 2){
            int produto_id = Integer.parseInt(txtAlterarProduto.getText());
            btnAdicionarProduto.setText("ALTERAR PRODUTO");
            alterarProduto(produto_id);
        }
        
        listarProdutos();
        limparCamposCadastro();
        
        
        
        
        
        
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void txtPrecoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoCompraActionPerformed

    private void txtPrecoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoVendaActionPerformed

    private void txtTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamanhoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        
    }//GEN-LAST:event_tblProdutoMouseClicked
    
    //---------BNT-DELETAR-PRODUTOS---------
    private void txtDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeletarProdutoActionPerformed
        Action action = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {  
                deletarProduto();
                listarProdutos();
                txtDeletarProduto.setText("");
            }
        };
       txtDeletarProduto.addActionListener(action);
        
    }//GEN-LAST:event_txtDeletarProdutoActionPerformed

    private void btnDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarProdutoActionPerformed
        deletarProduto();
        listarProdutos();
        txtDeletarProduto.setText("");
    }//GEN-LAST:event_btnDeletarProdutoActionPerformed

    private void txtAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlterarProdutoActionPerformed
        Action action = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {  
                numControle = 1;
                mostrarDados();
            }
        };
       txtAlterarProduto.addActionListener(action);
    }//GEN-LAST:event_txtAlterarProdutoActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        mostrarDados();
        
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    
    public static void viewProduto() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnDeletarProduto;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCategoria1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtAlterarProduto;
    private javax.swing.JTextField txtDeletarProduto;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPrecoCompra;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTamanho;
    // End of variables declaration//GEN-END:variables
    private int numControle = 1;
    
    
    
    
    
    
    
    
    //MÉTODO PARA CADASTRAR PRODUTOS
    private void cadastrarProdutos(){
        numControle = 1;
        String nomeProduto, categoriaProduto, tamanhoProduto;
        double precoCompra, precoVenda;
        int quantidadeProduto;
        
        nomeProduto = txtNome.getText();
        categoriaProduto = cmbCategoria.getSelectedItem().toString();
        tamanhoProduto = txtTamanho.getText();
        quantidadeProduto = Integer.parseInt(txtQuantidade.getText());
        precoCompra = Double.parseDouble(txtPrecoCompra.getText());
        precoVenda = Double.parseDouble(txtPrecoVenda.getText());
        
        
        ProdutoDTO objprodutodto = new ProdutoDTO();
        objprodutodto.setNome(nomeProduto);
        objprodutodto.setCategoria(categoriaProduto);
        objprodutodto.setTamanho(tamanhoProduto);
        objprodutodto.setQuantidade(quantidadeProduto);
        objprodutodto.setPrecoCompra(precoCompra);
        objprodutodto.setPrecoVenda(precoVenda);
        

        ProdutoDAO objprodutodao = new ProdutoDAO();
        
        objprodutodao.cadastrarProduto(objprodutodto);
          
    }
    
    
    //MÉTODO PARA LISTAR PRODUTOS
    private void listarProdutos(){
        try {
            ProdutoDAO objprodutodao = new ProdutoDAO();
            DefaultTableModel model = (DefaultTableModel) tblProduto.getModel();
            model.setNumRows(0);
            
            ArrayList<ProdutoDTO> lista = objprodutodao.consultarProdutos("");
            
            for(int i = 0; i < lista.size(); i++){  
                JButton btn = new JButton("");
                double lucro = (lista.get(i).getPrecoVenda()) - (lista.get(i).getPrecoCompra());
                model.addRow(new Object[]{
                    lista.get(i).getId_produto(),
                    lista.get(i).getNome(),
                    lista.get(i).getCategoria(),
                    lista.get(i).getTamanho(),
                    lista.get(i).getQuantidade(),
                    lista.get(i).getPrecoCompra(),
                    lista.get(i).getPrecoVenda(),
                    lucro,
                    lista.get(i).getDataEntrada(),
                    btn
                });
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoVIEW -> listarProdutos: " + erro);
        }
    }
    
    
    //MÉTODO PARA DELETAR PRODUTO PELO ID
    private void deletarProduto(){
        int idprodutodeletado;
        idprodutodeletado = Integer.parseInt(txtDeletarProduto.getText());
        ProdutoDAO objprodutodao = new ProdutoDAO();
        objprodutodao.deletarProdutoPeloId(idprodutodeletado);
        
    }
    
    
    //MÉTODO PARA LIMPAR CAMPOS DE TEXTO DO CADASTRO
    private void limparCamposCadastro(){
        txtNome.setText("");
        txtTamanho.setText("");
        txtQuantidade.setText("");
        txtPrecoCompra.setText("");
        txtPrecoVenda.setText("");
    }
    
    
    //MÉTODO PARA MOSTRAR DADOS DO PRODUTO QUE SERÁ ALTERADO NOS TXT_FIELDS
    private void mostrarDados(){
        numControle = 2;
        ArrayList<ProdutoDTO> lista = new ArrayList<>();
        ProdutoDAO objprodutodao = new ProdutoDAO();
        
        int produto_id = Integer.parseInt(txtAlterarProduto.getText());
        String condition = "WHERE produto_id = " + produto_id;
        
        lista = objprodutodao.consultarProdutos(condition);
        
        for(ProdutoDTO obj: lista){
            btnAdicionarProduto.setText("ALTERAR PRODUTO");
            txtNome.setText(obj.getNome());
            txtTamanho.setText(obj.getTamanho());
            txtQuantidade.setText(String.valueOf(obj.getQuantidade()));
            txtPrecoCompra.setText(String.valueOf(obj.getPrecoCompra()));
            txtPrecoVenda.setText(String.valueOf(obj.getPrecoVenda()));
            
        }
        
        
    }
    
    //ALTERAR PRODUTO PARA OS NOVOS VALORES QUE O USUÁRIO MODIFICOU NOS TXT_FIELDS
    public void alterarProduto(int produto_id){
        ProdutoDTO objprodutodto = new ProdutoDTO();
        
        objprodutodto.setNome(txtNome.getText());
        objprodutodto.setCategoria(cmbCategoria.getSelectedItem().toString());
        objprodutodto.setTamanho(txtTamanho.getText());
        objprodutodto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        objprodutodto.setPrecoCompra(Double.parseDouble(txtPrecoCompra.getText()));
        objprodutodto.setPrecoVenda(Double.parseDouble(txtPrecoVenda.getText()));
        
        ProdutoDAO objprodutodao = new ProdutoDAO();
        objprodutodao.alterarProduto(objprodutodto, produto_id);
        
        numControle = 1;
        btnAdicionarProduto.setText("ADICIONAR PRODUTO");
        txtAlterarProduto.setText("");
    }
}
