package view.supplier;

import controller.SupplierController;
import java.awt.BorderLayout;

public class SupplierFiltersPanel extends javax.swing.JPanel {
    //relations with other panels
    private SupplierTablePanel supplierTablePanel;
    private SupplierPropertiesPanel supplierPropertiesPanel;
    
    private SupplierController controller;

    public SupplierFiltersPanel() {  
        this.controller = new SupplierController();
        
        initComponents();
    }
    
    public void setRelations(SupplierTablePanel supplierTablePanel, SupplierPropertiesPanel supplierPropertiesPanel){
        this.supplierTablePanel = supplierTablePanel;
        this.supplierPropertiesPanel = supplierPropertiesPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFilterResults = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFieldCorporateNameFilter = new my_components.MyTextField1();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFieldCnpjFilter = new my_components.MyTextField1();
        jLabel5 = new javax.swing.JLabel();
        txtFieldEmailFilter = new my_components.MyTextField1();

        setBackground(new java.awt.Color(52, 58, 64));
        setMaximumSize(new java.awt.Dimension(400, 1000));
        setMinimumSize(new java.awt.Dimension(400, 1000));

        btnFilterResults.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFilterResults.setText("FILTER RESULTS");
        btnFilterResults.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnFilterResults.setPreferredSize(new java.awt.Dimension(80, 40));
        btnFilterResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterResultsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(152, 158, 164));
        jLabel1.setText("FILTERS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(152, 158, 164));
        jLabel3.setText("Corporate Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(152, 158, 164));
        jLabel4.setText("CNPJ:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(152, 158, 164));
        jLabel5.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(txtFieldEmailFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(txtFieldCnpjFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txtFieldCorporateNameFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFilterResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldCorporateNameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldCnpjFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldEmailFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(btnFilterResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterResultsActionPerformed
        supplierTablePanel.tableModel.setResults(
            controller.getFilteredSuppliers(
                    txtFieldCorporateNameFilter.getText(),
                    txtFieldCnpjFilter.getText(), 
                    txtFieldEmailFilter.getText())
        );
        
        this.supplierTablePanel.tableSupplier.updateUI();
    }//GEN-LAST:event_btnFilterResultsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilterResults;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private my_components.MyTextField1 txtFieldCnpjFilter;
    private my_components.MyTextField1 txtFieldCorporateNameFilter;
    private my_components.MyTextField1 txtFieldEmailFilter;
    // End of variables declaration//GEN-END:variables
    
    
}
