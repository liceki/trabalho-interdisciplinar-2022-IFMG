package view;

import controller.SupplierController;
import model.Supplier;
import table_model.SupplierTableModel;

import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SupplierView extends javax.swing.JFrame {
    SupplierController controller;
    SupplierTableModel tableModel;

    ArrayList<JTextField> txtFieldsList;
    public SupplierView() {
        initComponents();

        myInitComponents();

        this.controller = new SupplierController();
    }

    private void myInitComponents(){
        this.tableModel = new SupplierTableModel();
        this.tblSuppliers.setModel(tableModel);
        this.txtFieldsList = new ArrayList<>();
        this.txtFieldsList.add(txtFieldCnpj);
        this.txtFieldsList.add(txtFieldCorporateName);
        this.txtFieldsList.add(txtFieldEmail);
    }

    private void initComponents() {
        //initializing components
        //Panels
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        panelTable = new JPanel();
        //Labels
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel5 = new JLabel();
        //Buttons
        btnCadastrarFornecedor = new JButton();
        btnFecharJanelaFornecedor = new JButton();
        btnRemoveSupplier = new JButton();
        btnFilterSuppliers = new JButton();
        //Text Fields
        txtFieldCnpj = new JTextField();
        txtFieldCorporateName = new JTextField();
        txtFieldEmail = new JTextField();
        //ScrollPanes
        jScrollPane1 = new JScrollPane();
        //Tables
        tblSuppliers = new JTable();


        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new Color(0, 0, 0));


        txtFieldCorporateName.setBackground(new Color(0, 0, 0));
        txtFieldCorporateName.setForeground(new Color(255, 255, 255));
        txtFieldCorporateName.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtFieldCorporateName.addActionListener((ActionEvent evt) -> txtRazaoSocialActionPerformed(evt));

        txtFieldCnpj.setBackground(new Color(0, 0, 0));
        txtFieldCnpj.setForeground(new Color(255, 255, 255));
        txtFieldCnpj.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 0)));
        txtFieldCnpj.addActionListener((ActionEvent evt) -> txtCnpjActionPerformed(evt));

        txtFieldEmail.setBackground(new Color(0, 0, 0));
        txtFieldEmail.setForeground(new Color(255, 255, 255));
        txtFieldEmail.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 204, 0)));
        txtFieldEmail.addActionListener((ActionEvent evt) -> txtEmailActionPerformed(evt));


        jLabel1.setForeground(new Color(255, 255, 0));
        jLabel1.setText("Razão Social");

        jLabel2.setForeground(new Color(255, 255, 0));
        jLabel2.setText("CNPJ");

        jLabel3.setForeground(new  Color(255, 255, 0));
        jLabel3.setText("Email");

        jLabel5.setFont(new  Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new Color(153, 153, 153));
        jLabel5.setText("CADASTRO DE FORNECEDORES");


        btnCadastrarFornecedor.setBackground(new Color(0, 0, 0));
        btnCadastrarFornecedor.setFont(new Font("Dialog", 1, 18)); // NOI18N
        btnCadastrarFornecedor.setForeground(new Color(255, 255, 0));
        btnCadastrarFornecedor.setText("Cadastrar Fornecedor");
        btnCadastrarFornecedor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153, 153, 153)));
        btnCadastrarFornecedor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCadastrarFornecedor.addActionListener((ActionEvent evt) -> btnCadastrarFornecedorActionPerformed(evt));

        btnFecharJanelaFornecedor.setBackground(new Color(0, 0, 0));
        btnFecharJanelaFornecedor.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        btnFecharJanelaFornecedor.setForeground(new Color(255, 255, 0));
        btnFecharJanelaFornecedor.setText("FECHAR");
        btnFecharJanelaFornecedor.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 0)));
        btnFecharJanelaFornecedor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnFecharJanelaFornecedor.addActionListener((ActionEvent evt) -> btnFecharJanelaFornecedorActionPerformed(evt));

        btnRemoveSupplier.setBackground(new Color(0, 0, 0));
        btnRemoveSupplier.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        btnRemoveSupplier.setForeground(new Color(255, 255, 0));
        btnRemoveSupplier.setText("REMOVE");
        btnRemoveSupplier.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 0)));
        btnRemoveSupplier.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRemoveSupplier.addActionListener((ActionEvent evt) -> btnRemoveSupplierFornecedorActionPerformed(evt));

        btnFilterSuppliers.setBackground(new Color(0, 0, 0));
        btnFilterSuppliers.setFont(new Font("Dialog", 1, 18)); // NOI18N
        btnFilterSuppliers.setForeground(new Color(255, 255, 0));
        btnFilterSuppliers.setText("Filtrar Busca");
        btnFilterSuppliers.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153, 153, 153)));
        btnFilterSuppliers.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnFilterSuppliers.addActionListener((ActionEvent evt) -> btnFilterSuppliersActionPerformed(evt));


        GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
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
                            .addComponent(txtFieldCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtFieldCorporateName)
                            .addComponent(txtFieldEmail))
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
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldCorporateName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldCnpj, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldEmail, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnCadastrarFornecedor, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTable.setBackground(new Color(0, 0, 0));

        tblSuppliers.setBackground(new Color(0, 0, 0));
        tblSuppliers.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 0)));
        tblSuppliers.setFont(new Font("Dialog", 0, 12)); // NOI18N
        tblSuppliers.setForeground(new Color(204, 204, 204));


        tblSuppliers.setColumnSelectionAllowed(true);
        tblSuppliers.setFillsViewportHeight(true);
        tblSuppliers.setGridColor(new Color(204, 204, 204));
        tblSuppliers.setSelectionBackground(new Color(51, 51, 51));
        tblSuppliers.setSelectionForeground(new Color(204, 204, 204));
        tblSuppliers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblSuppliers.setShowGrid(false);
        tblSuppliers.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblSuppliers);
        tblSuppliers.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);





        GroupLayout jPanel3Layout = new GroupLayout(panelTable);
        panelTable.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFecharJanelaFornecedor)
                    .addComponent(btnFilterSuppliers)
                    .addGap(300)
                    .addComponent(btnRemoveSupplier)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 504, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnFecharJanelaFornecedor)
                .addGap(26, 26, 26)
                .addComponent(btnRemoveSupplier)
                .addComponent(btnFilterSuppliers )
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelTable,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }



    private void txtRazaoSocialActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtCnpjActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtEmailActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCadastrarFornecedorActionPerformed(ActionEvent evt) {
        String corporateName = txtFieldCorporateName.getText();
        String cnpj = txtFieldCnpj.getText();
        String email = txtFieldEmail.getText();

        for(JTextField txtField: this.txtFieldsList){
            if(txtField.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(this,
                        "ALL the Fields must be filled out", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        Supplier supplier = this.controller.addSupplier(corporateName, cnpj, email);
        tableModel.addSupplier(supplier);

        tblSuppliers.updateUI();
        clearTextFields();
    }

    private void btnFilterSuppliersActionPerformed(ActionEvent evt){
        tableModel.setResults(this.controller.getFilteredSuppliers());
        tblSuppliers.updateUI();
    }

    private void btnRemoveSupplierFornecedorActionPerformed(ActionEvent evt) {
        int rowIndex = tblSuppliers.getSelectedRow();
        Supplier supplierToRemove = tableModel.getSupplierAtRowIndex(rowIndex);
        int confirmation = JOptionPane.showConfirmDialog(this,
                "Are you sure about removing " + supplierToRemove.getCorporateName() +
                " of the Supplier's table?", "Confirmation", ConfirmationCallback.YES_NO_OPTION);

        if(confirmation == 0){
            tableModel.removeSupplierAtRow(rowIndex);
            controller.removeSupplier(supplierToRemove);
            tblSuppliers.updateUI();
        }

    }

    private void btnFecharJanelaFornecedorActionPerformed(ActionEvent evt) {
        this.dispose();
    }


    public static void iniciarFrameFornecedor() {
        EventQueue.invokeLater(() -> new SupplierView().setVisible(true));
    }

    private JButton btnCadastrarFornecedor;
    private JButton btnFecharJanelaFornecedor;
    private JButton btnRemoveSupplier;
    private JButton btnFilterSuppliers;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel panelTable;
    private JScrollPane jScrollPane1;
    private JTable tblSuppliers;
    private JTextField txtFieldCnpj;
    private JTextField txtFieldEmail;
    private JTextField txtFieldCorporateName;

    // End of variables declaration

    private void clearTextFields(){
        for(JTextField txtField: this.txtFieldsList){
            txtField.setText("");
        }
    }
}
